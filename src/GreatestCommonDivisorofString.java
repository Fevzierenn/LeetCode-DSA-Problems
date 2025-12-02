public class GreatestCommonDivisorofString {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1))
            return "";
        int ebob = ebob(str1.length(), str2.length(),1);
        return str1.substring(0, ebob);

    }


//    public String gcdOfStrings(String str1, String str2) {
//        StringBuilder sb = new StringBuilder("");
//        boolean condition = true;
//        int index=0;
//        String smallString = str2.length() < str1.length() ? str2 : str1;
//        String bigString = str2.length() >= str1.length() ? str2 : str1;
//
//        while (condition && index < smallString.length()){
//            sb.append(smallString.charAt(index));
//            if(!(bigString.charAt(index) == smallString.charAt(index)))
//                return "";
//            index++;
//        }
//
//        int ebob = ebob(bigString.length(), smallString.length(),1);
//        int counter = 0; int start=0;
//        String sb2 = sb.substring(0, ebob);
//        while (counter < bigString.length()/ebob)
//        {
//            if(!bigString.substring(start, (start + ebob)).equals(sb2))
//                return "";
//            start += ebob;
//            counter++;
//        }
//
//        return sb2.toString();
//    }


    public int ebob(int num1, int num2, int ebobValue)
    {
        int smallNum = num1 < num2 ? num1 : num2;
        for(int i=2; i<=smallNum; i++) {
            if(num1%i == 0 && num2%i==0)
                return ebob(num1/i, num2/i, ebobValue * i);}
        return ebobValue;
    }
}
