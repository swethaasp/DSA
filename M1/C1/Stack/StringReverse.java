package com.ust.LP1.lesson2.stack;

import java.util.Optional;

public class StringReverse {
    public String reverse(String str){
        StringBuffer res = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        Optional<Character> optchar = stack.pop();
        while (optchar.isPresent()){
            res.append(optchar.get());
            optchar = stack.pop();
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(new StringReverse().reverse("This will be reversed"));
    }
}
