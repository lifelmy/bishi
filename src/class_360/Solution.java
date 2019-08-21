package class_360;


import java.util.*;

public class Solution {


   static class Node{
        int row;
        int column;
        int value;
        Node(int row,int column,int value){
            this.row=row;
            this.column=column;
            this.value=value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int [][]array=new int [n][n];
        int []first=new int[n];
        int []second=new int[n];
        for (int i = 0; i <n ; i++) {
            first[i]=scanner.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            second[i]=scanner.nextInt();
        }
        PriorityQueue<Node> priorityQueue=new PriorityQueue<>((a,b)->b.value-a.value);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                array[i][j]=(first[i]+second[j])%m;
                priorityQueue.add(new Node(i,j,array[i][j]));
            }
        }

        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
            while (!priorityQueue.isEmpty()&&list.size()<n){
                Node node=priorityQueue.poll();
                if(!set.contains(node.row)&&!set2.contains(node.column)){
                    list.add(node.value);
                    set.add(node.row);
                    set2.add(node.column);
                }
            }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
