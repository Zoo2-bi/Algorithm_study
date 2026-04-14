import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main2841 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prett=sc.nextInt();
        int count=0;

        ArrayList<Stack<Integer>> lines=new ArrayList<>();
        for(int i=1;i<=n;i++){
            lines.add(new Stack<>());
        }
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int p=sc.nextInt();
            while(!lines.get(l).isEmpty()&&lines.get(l).peek()>p) {
                lines.get(l).pop();
                count++;
            }
            if(lines.get(l).isEmpty()||lines.get(l).peek()!=p){
                lines.get(l).push(p);
                count++;
            }
        }

        System.out.println(count);
    }
}
