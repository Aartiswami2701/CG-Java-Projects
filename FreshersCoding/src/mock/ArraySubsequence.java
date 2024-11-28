package mock;

public class ArraySubsequence {
 
    public static int lcs(int n, String str1, int m, String str2) {
       
        int[][] dp = new int[n + 1][m + 1];
 
      
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
               
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
 
  
        return dp[n][m];
    }
 
    public static void main(String[] args) {
       
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        int n = str1.length();
        int m = str2.length();
 
        System.out.println("Length of Longest Common Subsequence: " + lcs(n, str1, m, str2));
    }
}