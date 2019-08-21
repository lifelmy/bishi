package class_09;


import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String temp=scanner.nextLine();

        char []c=temp.toCharArray();

        int left=0,right=c.length-1;
        while (left<right){
            char ch=c[left];
            c[left]=c[right];
            c[right]=ch;
            left++;
            right--;
        }
        System.out.println(new String(c));

    }
}
