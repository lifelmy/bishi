package class_09;


import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s=scanner.nextLine();

        String fin=s.substring(1,s.length()-1);

        String []c=fin.split(",");

        int []array=new int[c.length];
        for (int i = 0; i <c.length ; i++) {
            array[i]=Integer.valueOf(c[i].trim());
        }

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            min=array[i]<min?array[i]:min;
            max=array[i]>max?array[i]:max;
        }

        int []res=new int[max-min+1];

        for (int i = 0; i <res.length ; i++) {
            res[i]=Integer.MAX_VALUE;
        }

        res[0]=min;
        res[max-min]=max;

        for (int i = 0; i <array.length ; i++) {
            res[array[i]-min]=array[i];
        }
        int mLen=1;
        int len=1;

        for (int i = 1; i <res.length ; i++) {
            if(res[i]==res[i-1]+1){
                len++;
                mLen=Math.max(len,mLen);
            }else {
                len=1;
            }
        }

        System.out.println(mLen);
    }
}
