Search Pattern (KMP-Algorithm)

  Given two strings, one is a text string, txt and other is a pattern string, pat. The task is to print the indexes of all the occurences of pattern string in the text string. Use one-based indexing while returning the indices. 
Note: Return an empty list incase of no occurences of pattern. Driver will print -1 in this case.

Example 1:

Input:
txt = "geeksforgeeks"
pat = "geek"
Output: 
1 9
Explanation: 
The string "geek" occurs twice in txt, one starts are index 1 and the other at index 9. 
Example 2:

Input: 
txt = "abesdu"
pat = "edu"
Output: 
-1
Explanation: 
There's not substring "edu" present in txt.
Your Task:
You don't need to read input or print anything. Your task is to complete the function search() which takes the string txt and the string pat as inputs and returns an array denoting the start indices (1-based) of substring pat in the string txt. 

Expected Time Complexity: O(|txt|).
Expected Auxiliary Space: O(|txt|).

Constraints:
1 ≤ |txt| ≤ 106
1 ≤ |pat| < |S|
Both the strings consists of lowercase English alphabets.




  class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        ArrayList<Integer> res =new ArrayList<>();
        int n=txt.length();
        int m=pat.length();
        
        for(int i=0;i<=n-m;i++){
            boolean b=true;
            for(int j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    b=false;
                    break;
                }
            }
            if(b){
                res.add(i+1);  //Use one-based indexing while returning the indices. 
            }
        }
        
        return res;
    }
}


  //Tc -O(n)



// https://www.geeksforgeeks.org/problems/pattern-searching4145/1


class Solution {
    int search(String text, String pat) {
        // code here
        int n=text.length();
        int m=pat.length();
        boolean bool=true;
        for(int i=0;i<=n-m;i++){
              bool=true;
            for(int j=0;j<m;j++){
                if(text.charAt(i+j)!=pat.charAt(j)){
                    bool=false;
                   break;
                }
            }
            if(bool){
                return 1;
            }
            
        }
        return 0;
    }
}
