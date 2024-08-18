Problem statement
Given two strings, 'S' and 'T' with lengths 'M' and 'N', find the length of the 'Longest Common Subsequence'.

For a string 'str'(per se) of length K, the subsequences are the strings containing characters in the same relative order as they are present in 'str,' but not necessarily contiguous. Subsequences contain all the strings of length varying from 0 to K.

Example :
Subsequences of string "abc" are:  ""(empty string), a, b, c, ab, bc, ac, abc.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
adebc
dcadb
Sample Output 1 :
3
Explanation of the Sample Output 1 :
Both the strings contain a common subsequence 'adb', which is the longest common subsequence with length 3. 
Sample Input 2 :
ab
defg
Sample Output 2 :
0
Explanation of the Sample Output 2 :
The only subsequence that is common to both the given strings is an empty string("") of length 0.
  
//Recursive way

  
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int index1=s.length()-1;
		int index2=t.length()-1;

		return f(index1,index2,s,t);
    }
	static int f(int index1,int index2,String s,String t){
		if(index1<0 || index2<0){
			return 0;
		}

		if(s.charAt(index1)==t.charAt(index2)){
			return 1+f(index1-1,index2-1,s,t);
		}

		return Math.max(f( index1-1, index2, s, t),f(index1, index2-1, s, t));
	}

}

//Memoization(Top-down)
// https://www.youtube.com/watch?v=NPZn9jBrX8U&t=862s - reference

import java.util.*;
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here

		int index1=s.length();
		int index2=t.length();

		int dp[][] =new int[index1][index2];

		for(int row[]:dp){
			Arrays.fill(row,-1);
		}

		return f(index1-1,index2-1,s,t,dp);
    }

	static int f(int index1,int index2,String s,String t,int[][] dp){

        // Base case: if either index becomes negative, return 0
        if (index1 < 0 || index2 < 0) {
            return 0;
        }

        // If the value is already computed, return it from dp array
        if (dp[index1][index2] != -1) {
            return dp[index1][index2];
        }

        // If characters match, include them in LCS and move to the next characters
        if (s.charAt(index1) == t.charAt(index2)) {
            dp[index1][index2] = 1 + f(index1 - 1, index2 - 1, s, t, dp);
        } else {
            // If characters don't match, take the maximum LCS by excluding one character from either string
            dp[index1][index2] = Math.max(f(index1 - 1, index2, s, t, dp), f(index1, index2 - 1, s, t, dp));
        }

        return dp[index1][index2];


	}

}
//ztzc: O(n*m)
//sc:O(n*m) + O(n+m)(auxillary space)

//Tabulation(bottom-up)

import java.util.*;

class TUF {
    // Function to find the length of the Longest Common Subsequence (LCS)
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store results of subproblems
        int dp[][] = new int[n + 1][m + 1];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        // Initialize the first row and first column with zeros since LCS with an empty string is zero
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        // Fill the dp array using dynamic programming
        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                // If the characters at the current indices are the same, increment the LCS length
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                // If the characters are different, choose the maximum LCS length by either
                // excluding a character in s1 or excluding a character in s2
                else
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }

        return dp[n][m]; // Return the length of the Longest Common Subsequence (LCS)
    }

    public static void main(String args[]) {
        String s1 = "acd";
        String s2 = "ced";

        // Call the lcs function and print the result
        System.out.println("The Length of Longest Common Subsequence is " + lcs(s1, s2));
    }
}


