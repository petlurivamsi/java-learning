import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();

        stack.push("Samajavaragamana");
        stack.push("The Kerala Files");
        stack.push("Miss Shetty Mr polishetty");
        stack.push("The Vaccine War");

        stack.pop();

        if(stack.search("Samajavaragamana")>0){
            System.out.println("Vamsi watched Samajavaragamana");
        }

        String topElement = stack.peek();

        System.out.println(stack);
        System.out.println(topElement);


    }
}
