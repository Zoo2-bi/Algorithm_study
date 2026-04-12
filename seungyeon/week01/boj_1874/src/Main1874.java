import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main1874 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        ArrayList<Boolean> command=new ArrayList<>();

        int n=sc.nextInt();
        int next_num=sc.nextInt();
        int count_num=0;
        int count=0;
        while(count_num<n&&count<=n){
            //count가 n보다 작거나 같아야 함
            //count_num이 n보다 작아야 함(해당하는 수면 오르고 종료=같을 필요 없음)

            //필요한 수가 최상단인 경우
            if(!stack.isEmpty()&&stack.peek()==next_num) {
                stack.pop();
                command.add(false);
                if(++count_num==n) break;
                next_num=sc.nextInt();
            }
            //최상단이 아닌 경우
            else{
                stack.push(++count);
                command.add(true);
            }
        }

        //stack에 숫자가 남아있으면 불가능
        if(stack.isEmpty()){
            for(Boolean b:command){
                if(b) System.out.println("+");
                else System.out.println("-");
            }
        }else{
            System.out.println("NO");
        }
    }
}
