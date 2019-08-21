package class_liulishuo;

import java.util.Scanner;

/**
 * @author lmy
 * @ClassName Solution1
 * @date 2019/8/19
 **/
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();

        if(count==1){
            System.out.println(1);
        }

        long []res=new long[count];
        res[0]=1;
        res[1]=2;
        for (int i = 2; i <count ; i++) {
            res[i]=res[i-1]+res[i-2];
        }

        System.out.println(res[count-1]);
    }
}
