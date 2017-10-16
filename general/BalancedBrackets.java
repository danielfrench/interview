import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
       
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if (c=='{' || c=='['  || c=='(') {
                stack.add(c);
                continue;
            }
            
            if (c=='}' || c==']'  || c==')'){
                if (stack.isEmpty()) return false;
                
                char popped = stack.pop();
                
                switch(popped){
                  case '{': 
                      if (c!='}') return false;
                      break;       
                 case '[': 
                      if (c!=']') return false;
                      break;
                      
                 case '(': 
                          if (c!=')') return false;
                          break;
                  }
                                           
                }
     
                        
        } 
           return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    } 
}

