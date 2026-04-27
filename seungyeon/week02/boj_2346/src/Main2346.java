import java.util.*;

public class Main2346 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Deque<int[]> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            q.add(new int[]{i+1,sc.nextInt()});
        }
        ArrayList<Integer> array=new ArrayList<>();
        int[] next=q.pollFirst();
        array.add(next[0]);
        int move=next[1];
        while(!q.isEmpty()){
            if(q.isEmpty()) break;
            for(int i=1;i<Math.abs(move);i++){
                if(move>0) q.addLast(q.pollFirst());
                else if(move<0) q.addFirst(q.pollLast());
            }
            if(move<0) q.addFirst(q.pollLast());
            next=q.poll();
            array.add(next[0]);
            move=next[1];
        }
        StringBuilder sb=new StringBuilder();
        for(int a:array){
            sb.append(a+" ");
        }
        sb.replace(sb.length()-1,sb.length(),"");
        System.out.println(sb);
    }
}
