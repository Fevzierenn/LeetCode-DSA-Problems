import java.util.Arrays;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        int right;
        while(i>=0){
            while(i >= 0 && s.charAt(i) == ' '  ){
                i--;
            }
            if(i < 0)
                break;
            right=i;
            while(i >= 0 && s.charAt(i) != ' ' ){
                i--;
            }
            if(sb.length()>0)
                sb.append(" ");
            sb.append(s.substring(i+1, right+1));
        }
        return sb.toString();
    }
}
