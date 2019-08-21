package class_360;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int row=scanner.nextInt();
        int column=scanner.nextInt();

        int [][]array=new int[row][column];
        int sum=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                array[i][j]=scanner.nextInt();
                sum+=array[i][j]*6;
            }
        }


        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {

                if(array[i][j]==0){
                    continue;
                }
                sum-=2*(array[i][j]-1);

                if(i>0){
                    sum-=Math.min(array[i][j],array[i-1][j])*2;
                }

                if(j>0){
                    sum-=Math.min(array[i][j],array[i][j-1])*2;
                }

            }
        }

        System.out.println(sum);

    }
}
