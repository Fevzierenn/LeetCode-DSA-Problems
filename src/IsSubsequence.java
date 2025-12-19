public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        StringBuilder str = new StringBuilder(t);
        if(s.length() == 0) return true;
        int m=0;
        for(int i=0; i<s.length(); i++){
            char charC = s.charAt(i);
            for( ; m<str.length();m++){
                if(str.charAt(m) != charC){
                    str.deleteCharAt(m);
                    m--;
                }
                else{
                    m++;
                    break;
                }
            }
        }

        return s.equals(str.toString().substring(0,m));
    }
}
