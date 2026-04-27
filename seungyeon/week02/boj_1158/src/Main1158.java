import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main1158 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Queue<Integer> queue=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }

        int count=0;
        StringBuilder sb=new StringBuilder("<");
        while(!queue.isEmpty()){
            if(++count==k) {
                sb.append(queue.poll()).append(", ");
                count=0;
            }
            else queue.add(queue.poll());
        }
        sb.replace(sb.length()-2,sb.length(),">");
        System.out.println(sb);
    }
}
