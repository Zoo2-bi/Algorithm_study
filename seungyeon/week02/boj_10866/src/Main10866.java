import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main10866 {
    static Deque<String> d=new ArrayDeque<>();

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String[] c=sc.nextLine().split(" ");
            switch(c[0]){
                case "push_front": d.addFirst(c[1]); break;
                case "push_back": d.addLast(c[1]); break;
                case "pop_front": if(check()) System.out.println(d.pollFirst()); break;
                case "pop_back": if(check()) System.out.println(d.pollLast()); break;
                case "size": System.out.println(d.size()); break;
                case "empty": if(d.isEmpty()) System.out.println(1); else System.out.println(0); break;
                case "front": if(check()) System.out.println(d.peekFirst()); break;
                case "back": if (check()) System.out.println(d.peekLast()); break;
                default: break;
            }
        }
    }

    static boolean check(){
        if(d.isEmpty()) {
            System.out.println(-1);
            return false;
        }
        return true;
    }
}
