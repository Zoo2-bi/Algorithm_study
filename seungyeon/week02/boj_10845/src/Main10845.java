import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main10845 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayDeque<String> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            String[] command=sc.nextLine().split(" ");
            switch(command[0]){
                case "push": q.add(command[1]); break;
                case "pop":
                    if (q.isEmpty()) System.out.println(-1);
                    else System.out.println(q.poll());
                    break;
                case "size":
                    System.out.println(q.size()); break;
                case "empty":
                    if(q.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if(q.isEmpty()) System.out.println(-1);
                    else System.out.println(q.peek());
                    break;
                case "back":
                    if(q.isEmpty()) System.out.println(-1);
                    else System.out.println(q.getLast());
                    break;
                default: break;
            }
        }
    }
}
