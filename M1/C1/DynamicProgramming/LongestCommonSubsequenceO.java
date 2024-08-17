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


//Tabulation(bottom-up)

