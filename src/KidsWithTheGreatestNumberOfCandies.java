import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumValue = 0;
        for(int i = 0 ; i < candies.length; i++){
            if(candies[i] > maxNumValue)
                maxNumValue = candies[i];
        }

        List<Boolean> answers = new ArrayList<>();
        boolean consequence;
        for(int m=0; m < candies.length; m ++){
            consequence = candies[m] + extraCandies >= maxNumValue ? true:false;
            answers.add(consequence);
        }

        return answers;
    }



//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int maxCandies = 0;
//        for (int candy : candies) {
//            maxCandies = Math.max(candy, maxCandies);
//        }
//
//        List<Boolean> result = new ArrayList<>();
//        for (int candy : candies) {
//            result.add(candy + extraCandies >= maxCandies);
//        }
//
//        return result;
//    }
}
