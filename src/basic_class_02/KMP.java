package basic_class_02;

/**
 * @author lmy
 * @ClassName KMP
 * @date 2019/8/17
 **/
public class KMP {


    public static void main(String[] args) {
        String str = "abcabcababaccc";
        String match = "ababa";
        System.out.println(getIndexOf(str, match));
    }


    public static int getIndexOf(String s,String m){
        if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
            return -1;
        }
        char[] ss = s.toCharArray();
        char[] ms = m.toCharArray();

        int si=0,mi=0;
        int []next=getNextArray(m.toCharArray());

        while (si<s.length()&&mi<m.length()){
            if(ss[si]==ms[mi]){
                si++;
                mi++;
            }else {
                if(next[mi]==-1){
                    si++;
                }else{
                    mi=next[mi];
                }
            }
        }
        return mi==ms.length?si-mi:-1;

    }


    public static int [] getNextArray(char []array){
        if(array.length==1){
            return new int[]{-1};
        }
        int []next=new int[array.length];
        next[0]=-1;
        next[1]=0;
        int pos=2;
        int cn=0;
        while (pos<array.length){
            if(array[pos-1]==array[cn]){
                next[pos++]=++cn;
            }else{
                if(cn>0){
                    cn=next[cn];
                }else{
                    next[pos++]=0;
                }
            }
        }
        return next;
    }
}
