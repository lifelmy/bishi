package class_09;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String second=scanner.nextLine();
        s=s.replaceAll(" ","");
        if(s.length()<=5){
            return;
        }
        String fin=s.substring(1,s.length()-1);
        String []temp=fin.split(",");
        if(temp.length<2){
            return;
        }
        int []chars=new int[temp.length];
        for (int i = 0; i <chars.length ; i++) {
            chars[i]=Integer.valueOf(temp[i].trim());
        }

        int target=Integer.valueOf(second.trim());

        int first=0,last=chars.length-1;

        while (first<last){
            int sum=target-chars[first]-chars[last];
            if(sum==0){
                System.out.println(chars[first]+","+chars[last]);
                first++;
                last--;
            }else if(sum>0){
                first++;
            }else {
                last--;
            }
        }
    }
}
