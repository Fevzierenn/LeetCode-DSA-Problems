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
}
