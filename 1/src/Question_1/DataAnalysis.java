/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

/**
 *
 * @author xhu
 */
public class DataAnalysis {
    private char[] data;
    public DataAnalysis(char[] data){
        this.data = data;
    }
    
    public boolean bracketEvaluator(){
        // if (data == null || data.length % 2 != 0) {
        //     return false;
        // }

        char[] stack = new char[data.length];
        int top = -1; 

        for (char c : data) {
            if (isOpeningBracket(c)) {
                stack[++top] = c; 
            } else if (isClosingBracket(c)) {
                if (top == -1 || !isMatchingPair(stack[top], c)) {
                    return false; 
                }
                top--; 
            }
        }

        return top == -1; 
    }

    private boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isClosingBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

        
}
