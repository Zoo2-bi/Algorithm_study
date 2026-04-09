import java.util.Scanner;

public class Main10799_2 {

    public static void main(String[] args) {
        /* ( 쇠막대기 시작
         * ) 쇠막대기 끝
         * () 절단
         * */

        /* branch: 막대 라인 수, ()가 나오면 막대 수에 더함
         * prev는 미리 하나 뽑아서 사전 설정
         *
         * )를 뽑았는데 이전이 (이면 막대 라인 수를 막대 수에 더하기
         * (를 뽑았는데 이전이 (이면 막대 라인 수+1, 막대 수+1
         * )를 뽑았는데 이전이 )이면 막대 라인 수-1
         * (를 뽑았으면 이전이 )이면 뭐든간에 무슨 상황인지 모름
         * */
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();

        int branch=0;
        int count=0;
        char prev=line.charAt(0);

        for(int i=1;i<line.length();i++) {
            if(line.charAt(i)==')') {
                if(prev=='(') count+=branch;
                else if(prev==')') branch--;
            }else {
                if(prev=='(') {
                    branch++;
                    count++;
                }
            }
            prev=line.charAt(i);
        }

        System.out.println(count);
    }

}
