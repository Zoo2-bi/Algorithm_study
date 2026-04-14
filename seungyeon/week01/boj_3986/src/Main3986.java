import java.util.Scanner;
import java.util.Stack;

public class Main3986 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            Stack<String> s=new Stack<>();
            String[] word=sc.next().split("");
            for (String string : word) {
                if (s.isEmpty()) s.push(string);
                else if (s.peek().equals(string)) s.pop();
                else s.push(string);
            }
            if(s.isEmpty()) count++;
        }
        System.out.println(count);
    }
}
