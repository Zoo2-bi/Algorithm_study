import java.util.Scanner;
import java.util.Stack;

public class Main9012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String[] input=sc.next().split("");
            Stack<String> stack=new Stack<>();
            boolean pass=true;
            for(String in:input){
                if(in.equals(")")){
                    if(stack.isEmpty()) {
                        pass=false;
                        break;
                    }
                    else if(stack.peek().equals("(")) stack.pop();
                }
                else stack.push(in);
            }
            if(!stack.isEmpty()) pass=false;
            System.out.println(pass?"YES":"NO");
        }
    }
}
