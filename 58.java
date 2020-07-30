/**
 * Created by gentle-hu on 2019/3/16 23:24.
 * Email:me@gentlehu.com
 */
public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        int r = new LengthOfLastWord_58().lengthOfLastWord("a");
        System.out.println(r);
    }
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                ++count;
            }else{
                break;
            }
        }
        return count;
    }
}
