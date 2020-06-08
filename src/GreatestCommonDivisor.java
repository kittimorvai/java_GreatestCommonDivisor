public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor (int first, int second){
            int maxTempFirst = 0;
            int maxTempSecond = 0;


        if ( first < 10 || second < 10){
            return -1;
        }


        if (first < second){
            if(second % first == 0){
                return first;
            }
            for (int i = 1; i <= first/2; i++){
                if (first % i == 0 && second % i == 0){
                    maxTempFirst = i;
                }
            }
            return maxTempFirst;
        }
        else {
            if (first % second == 0){
                return second;
            }
            for (int j = 1; j <= second/2; j++){
                if(first % j == 0 && second % j ==0){
                    maxTempSecond = j;
                }
            }
            return maxTempSecond;
        }
    }
}

