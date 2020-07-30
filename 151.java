/**
 * Created by gentle-hu on 2019/3/17 2:53.
 * Email:me@gentlehu.com
 */
public class Reverse_Words_in_a_String_151 {
    public static void main(String[] args) {
        String s = new Reverse_Words_in_a_String_151().reverseWords("the sky is blue");
        System.out.println(s);
    }
    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");
        String t;
        for(int i=0;i<ss.length/2;i++){
            t = ss[i];
            ss[i] = ss[ss.length-1-i];
            ss[ss.length-1-i] = t;
        }
        return String.join(" ",ss);
    }
}
