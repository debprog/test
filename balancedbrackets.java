
import java.io.*;
import java.util.*;

public class balancedbrackets {

    public static void main(String[] args) {

        String exp = "[(a+b)+{(c+d)*(e/f)]";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
                st.push(exp.charAt(i));
            }

            else if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {

                if (st.peek() == '(' && exp.charAt(i) == ')' || st.peek() == '{' && exp.charAt(i) == '}'
                        || st.peek() == '[' && exp.charAt(i) == ']') {
                    st.pop();
                }

            }

        }

        if (st.isEmpty()) {
            System.out.println("balanced");
        }

        else {
            System.out.println("not balanced");
        }
    }

}
