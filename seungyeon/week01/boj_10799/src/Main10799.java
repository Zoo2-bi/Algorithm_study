import java.util.Scanner;
import java.util.Stack;

public class Main10799 {
    public static void main(String[] args) {
        /*
        * ((: 막대 시작, 막대 수 +1
        * (): 막대 절단, 조각 수=기존 조각 수+막대 수
        * )): 막대 종료, 막대 수 -1
        * 기존 조각 수는 막대 수
        *
        * * 주의
        * pop을 해버리면 이전 기록이 꼬여서 막대 수를 착각하는 등 오류가 발생함
        * ex) () 팝해서 (만 남아 다음에 (가 들어왔을 때 무조건 막대 하나 추가라고 인식
        * */
        Scanner sc=new Scanner(System.in);
        String[] lines=sc.next().split("");
        Stack<String> stack=new Stack<>();
        int line_count=0; //현재 쇠막대기의 수
        int piece=0;
        for(String line:lines) {
            if(stack.isEmpty()) stack.push(line);
            else{
                String last=stack.peek();
                switch(last+line){
                    case "((": line_count++; piece++; break;
                    case "()": piece+=line_count; break;
                    case "))": line_count--; break;
                    default: break; //)(: 아무것도 아닌 경우
                }
                stack.push(line);
            }
        }
        System.out.println(piece);
    }
}
