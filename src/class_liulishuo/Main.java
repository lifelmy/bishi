package class_liulishuo;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author lmy
 * @ClassName Main
 * @date 2019/8/19
 **/
public class Main {

    static  class  Node{
        public int come;
        public int out;
        Node(int come,int out){
            this.come=come;
            this.out=out;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String come=scanner.nextLine();
        String out=scanner.nextLine();

        String []c=come.split(" ");
        String []o=out.split(" ");

        int []cInt=new int[c.length];
        int []oInt=new int[o.length];
        int size=0;
        PriorityQueue <Node> priorityQueue=new PriorityQueue<>((a,b)->a.out-b.out);
        for (int i = 0; i <c.length ; i++) {

            Node node=new Node(Integer.valueOf(c[i]),Integer.valueOf(o[i]));
            while (!priorityQueue.isEmpty()&&priorityQueue.peek().out<node.come){
                priorityQueue.poll();
            }
            priorityQueue.offer(node);
            size=Math.max(size,priorityQueue.size());
        }

        System.out.println(size);


    }
}
