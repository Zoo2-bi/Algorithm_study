import java.util.Scanner;
import java.util.Stack;

public class Main10773 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            int next_num=sc.nextInt();
            if(next_num==0) stack.pop(); //0일 경우 지울 수 있는 수가 있음이 보장됨, 유효성 검사 필요X
            else stack.push(next_num);
        }
        int total=0;
        for(Integer i:stack){
            total+=i;
        }
        System.out.println(total);
    }
}
