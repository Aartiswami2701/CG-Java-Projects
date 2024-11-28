package mock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;
enum ActionEnum {
    appliedFilter,
    feature1Button,
    feature2Button,
    feature3Button,
    proceedButton
}

interface IAnalytics {
    public void registerAction(ActionEnum action);
	public int getNumberOfActionRegisteredButNotSentToAnalyticsStore();
	public int getTotalNumberOfLoggedActions();
    public List<ActionEnum> getMostFrequentlyUsedActions();
}

interface IAnalyticsStore {
    public void storeActions(Queue<ActionEnum> q);
    public Queue<ActionEnum> getAllStoredActions();
}
class Analytics implements IAnalytics {
    private Queue<ActionEnum> storedEventEnums = new LinkedList<>();
    private IAnalyticsStore analyticsStore;
    private int K;
    private Queue<ActionEnum> unprocessedActions = new LinkedList<>();
    private int totalActionsLogged = 0;
    
    public Analytics(IAnalyticsStore analyticsStore, int K) {
        this.analyticsStore= analyticsStore;
        this.K=K;
    }
    
 
    @Override
    public void registerAction(ActionEnum action) {
        
       if (action != null) {
            unprocessedActions.add(action);
            totalActionsLogged++;
            
            // If the queue size reaches K, store the actions
            if (unprocessedActions.size() >= K) {
                analyticsStore.storeActions(unprocessedActions);
                unprocessedActions.clear(); // Clear the queue after storing
            }
        }
       
    }
    
    public void storeActions(Queue<ActionEnum> q){
         while (!q.isEmpty()) {
            storedEventEnums.add(q.poll());
        }
    }
    public Queue<ActionEnum> getAllStoredActions(){
        return new LinkedList<>(storedEventEnums);
    }

    @Override
    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
    return unprocessedActions.size();  
    }

    @Override
    public int getTotalNumberOfLoggedActions() {
        
        return totalActionsLogged;
    }

    @Override
    public List<ActionEnum> getMostFrequentlyUsedActions() {
       Map<ActionEnum, Long> frequencyMap = new HashMap<>();
        Queue<ActionEnum> allStoredActions = analyticsStore.getAllStoredActions();
        
        // Count frequencies
        for (ActionEnum action : allStoredActions) {
            frequencyMap.put(action, frequencyMap.getOrDefault(action, 0L) + 1);
        }

        // Sort by frequency and return top K (or all if fewer than K)
        return frequencyMap.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .map(Map.Entry::getKey)
                .limit(K)
                .collect(Collectors.toList());
    }
    }


public class RealMock2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String inp[];
        inp = br.readLine().split(" ");

        int totalNumberOfRequests = Integer.parseInt(inp[0]),
            K = Integer.parseInt(inp[1]);
        
        IAnalyticsStore analyticsStore = new AnalyticsStore();
        IAnalytics analytics = new Analytics(analyticsStore, K);

        for(int queryNumber = 1; queryNumber <= totalNumberOfRequests; queryNumber++) {
            inp = br.readLine().split(" "); 
            switch(inp[0]) {
                case "registerAction":
                    ActionEnum actionEnum = ActionEnum.valueOf(inp[1]);
                    analytics.registerAction(actionEnum);
                    break;
                case "getTotalNumberOfLoggedActions":
                    int totalNumberOfLoggedEvents = analytics.getTotalNumberOfLoggedActions();
                    out.println(totalNumberOfLoggedEvents);
                    break;
                case "getNumberOfActionRegisteredButNotSentToAnalyticsStore":
                    int x = analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore();
                    out.println(x);
                    break;
                case "getMostFrequentlyUsedActions":
                    List<ActionEnum> li = analytics.getMostFrequentlyUsedActions();
                    for(ActionEnum a : li) {
                        out.print(a + " ");
                    }
                    out.print("\n");
                    break;
            }
        }
        
        Queue<ActionEnum> q = analyticsStore.getAllStoredActions();
        for(ActionEnum a : q) {
            out.print(a.toString() + " ");
        }
        out.print("\n");

        out.flush();
        out.close();
    }
}

class AnalyticsStore implements IAnalyticsStore {
    private Queue<ActionEnum> storedEventEnums = new LinkedList<>();

    @Override
    public void storeActions(Queue<ActionEnum> q) {
        while(!q.isEmpty()) {
            storedEventEnums.add(q.poll());
        }
    }

    @Override
    public Queue<ActionEnum> getAllStoredActions() {
        Queue<ActionEnum> clonedActionEnums = new LinkedList<>(storedEventEnums);
        return clonedActionEnums;
    }
}