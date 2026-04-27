import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main13417 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int t=0;t<tc;t++){
            int n=sc.nextInt();
            Deque<String> q=new ArrayDeque<>();
            q.add(sc.next());
            for(int i=0;i<n-1;i++){
                String next=sc.next();
                if(next.compareTo(q.peek())<=0) q.addFirst(next);
                else q.addLast(next);
            }
            for(String s:q){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
