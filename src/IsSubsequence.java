public class IsSubsequence {

public boolean isSubsequence(String s, String t){
    if(s.length() <= 0) return true;
    int sIndex=0, tIndex =0;
    while (tIndex < t.length()){
        if (s.charAt(sIndex) == t.charAt(tIndex))
            sIndex++;

        if(sIndex == s.length()) return true;
        tIndex++;
    }
    return false;
}


//    public boolean isSubsequence(String s, String t) {
//        StringBuilder str = new StringBuilder(t);
//        if(s.length() == 0) return true;
//        int m=0;
//        for(int i=0; i<s.length(); i++){
//            char charC = s.charAt(i);
//            for( ; m<str.length();m++){
//                if(str.charAt(m) != charC){
//                    str.deleteCharAt(m);
//                    m--;
//                }
//                else{
//                    m++;
//                    break;
//                }
//            }
//        }
//
//        return s.equals(str.toString().substring(0,m));
//    }
}
