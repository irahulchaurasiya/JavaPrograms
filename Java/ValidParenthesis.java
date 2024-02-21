// Link :- https://leetcode.com/problems/valid-parentheses/description/

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "()(()){}{{[[]]}}";
        String s = "[[{]]()(";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(st.isEmpty())
            {
                st.push(c);
            }
            else if(c == ')' && st.peek() == '(')
            {
                st.pop();
            }
            else if(c == '}' && st.peek() == '{')
            {
                st.pop();
            }
            else if(c == ']' && st.peek() == '[')
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        return st.size() == 0;
    }
}
