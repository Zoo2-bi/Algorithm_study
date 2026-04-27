import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main2164 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        boolean lose=true;
        while(!q.isEmpty()){
            if(q.size()==1) break;
            if(lose){
                q.poll();
                lose=false;
            }
            else{
                q.add(q.poll());
                lose=true;
            }
        }
        System.out.println(q.poll());
    }
}
