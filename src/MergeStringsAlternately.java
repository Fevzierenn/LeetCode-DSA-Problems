public class MergeStringsAlternately {




    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder("");
        int index = 0;
        // "abcd", "efghj"
        while(index<word1.length() || index < word2.length() )
        {
            if(index<word1.length())
                sb.append(word1.charAt(index));

            if(index<word2.length())
                sb.append(word2.charAt(index));
            index++;
        }

        return sb.toString();
    }


//    public String mergeAlternately(String word1, String word2) {
//        int smallIndex =0;
//        int longIndex = 0;
//        String longValue = "";
//        String value = "";
//        if(word1.length() == word2.length()){
//            smallIndex = word1.length();
//            longIndex = word2.length();
//        }
//        if(word1.length() > word2.length()){
//            smallIndex = word2.length();
//            longIndex = word1.length();
//            longValue = word1;
//        }
//        if(word1.length() < word2.length()){
//            smallIndex = word1.length();
//            longIndex = word2.length();
//            longValue = word2;
//        }
//
//        int m ;
//        for(m=0 ; m<smallIndex;m++){
//            value += String.valueOf(word1.charAt(m));
//            value += String.valueOf(word2.charAt(m));
//        }
//        int k = longIndex - m ;
//        if(k != 0)
//        {
//            for(k=longIndex - k ; k<longIndex ; k++)
//            {
//                value += String.valueOf(longValue.charAt(k));
//            }
//        }
//
//        return value;
//
//    }
}
