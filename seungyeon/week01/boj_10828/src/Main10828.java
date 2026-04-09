import java.util.Scanner;
import java.util.Stack;

class Main10828{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<n;i++){
            String command=sc.next();
            switch(command){
                case "push": s.push(sc.nextInt()); break;
                case "pop": {
                    if(s.size()==0) System.out.println(-1);
                    else System.out.println(s.pop());
                    break;
                }
                case "size": System.out.println(s.size()); break;
                case "empty": {
                    if(s.size()==0) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "top": {
                    if(s.size()==0) System.out.println(-1);
                    else System.out.println(s.peek());
                    break;
                }
                default:
                    System.out.println("잘못된 명령어"); break;
            }
        }
    }
}