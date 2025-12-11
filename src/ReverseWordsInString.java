import java.util.Arrays;

public class ReverseWordsInString {

    public String reverseWords(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder sb2 = new StringBuilder();
        for (int i = words.length-1; i>=0 ; i--){
            sb2.append(words[i]);
            if(sb2.length() > 0)
                sb2.append(" ");
            }



            return sb2.toString();
    }



//    public String reverseWords(String s) {
//        StringBuilder sb = new StringBuilder();
//        int i = s.length()-1;
//        int right;
//        while(i>=0){
//            while(i >= 0 && s.charAt(i) == ' '  ){
//                i--;
//            }
//            if(i < 0)
//                break;
//            right=i;
//            while(i >= 0 && s.charAt(i) != ' ' ){
//                i--;
//            }
//            if(sb.length()>0)
//                sb.append(" ");
//            sb.append(s.substring(i+1, right+1));
//        }
//        return sb.toString();
//    }
}
