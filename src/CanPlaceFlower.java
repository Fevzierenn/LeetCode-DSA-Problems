public class CanPlaceFlower {


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {

            if (count >= n) {
                return true;
            }



            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }

        return count >= n;
    }
    }



//public class CanPlaceFlower {
////    public boolean canPlaceFlowers(int[] flowerbed, int n) {
////        int count = 0;
////        int LIST_LENGTH = flowerbed.length;
////        int index = 0;
////
////        while(index < LIST_LENGTH)
////        {
////            if(index == 0) //starter point - left is blank
////            {
////                if(flowerbed[index] == 1)
////                    index +=2;
////                else {
////                    int right = chechRight(flowerbed, index);
////                    if(right == 0){
////                        count ++;
////                    }
////                    if(right == -1 )
////                        count += flowerbed[index] == 0 ? 1 : 0;
////                    index +=2;
////                }
////            }
////            else if(index == LIST_LENGTH -1) {
////                if(flowerbed[index] == 0){
////                    int left = checkLeft(flowerbed, index);
////                    if(left == 0){
////                        count ++;
////                }
////                }
////                index +=1;
////            }
////
////            else    //represents (0, listlength-1)
////            {
////                if(flowerbed[index] == 1)
////                    index +=2;
////                else
////                {
////                    int right = chechRight(flowerbed, index);
////                    int left = checkLeft(flowerbed, index);
////
////                    if(left ==1 && right == 0)
////                        index++;
////
////                    if((left == 0 && right == 1) || (left == 1 && right == 1))
//////                        if(index +2 < LIST_LENGTH-1)
////                            index +=2;
////
////                    if(left == 0 && right == 0){
////                        count++;
////                        index+=2;
////                    }
////                }
////            }
////        }
////
////        return count >= n;
//    }
//
////    public int chechRight(int[] flowerbed, int currentIndex)
////    {
////        return currentIndex + 1 <= (flowerbed.length - 1) ? flowerbed[currentIndex+1] : -1;
////    }
////    public int checkLeft(int[] flowerbed, int currentIndex)
////    {
////        return currentIndex -1 != (-1) ? flowerbed[currentIndex-1] : -1;
////    }
//
//}
