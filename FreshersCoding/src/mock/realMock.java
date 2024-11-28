package mock;
import java.io.*;


import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Result {
    


    public static List<List<String>> extractErrorLogs(List<List<String>> logs) {
        // Create a list to hold error logs
        List<List<String>> errorLogs = new ArrayList<>();

        // Iterate through the logs to find ERROR and CRITICAL logs
        for (List<String> log : logs) {
            String checkError = log.get(2);
            if (checkError.equals("ERROR") || checkError.equals("CRITICAL")) {
                errorLogs.add(log);
            }
        }

        // Sort the error logs based on the timestamp
        Collections.sort(errorLogs, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
                LocalDateTime dateTime1 = LocalDateTime.parse(o1.get(0) + " " + o1.get(1), formatter);
                LocalDateTime dateTime2 = LocalDateTime.parse(o2.get(0) + " " + o2.get(1), formatter);
                return dateTime1.compareTo(dateTime2);
            }
        });

        // Return the sorted list of error logs
        return errorLogs;
    }
}


public class realMock {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int logsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int logsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> logs = new ArrayList<>();

        IntStream.range(0, logsRows).forEach(i -> {
            try {
                logs.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<List<String>> result = Result.extractErrorLogs(logs);

        result.stream()
            .map(
                r -> r.stream()
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
