package racing_winner.utils;

import java.util.Random;

public class CommonUtils {

    public static final int RANDOM_NUMBER_RULE = 4;
    public static final int RANDOM_NUMBER_MAX = 10;
    public static final int RANDOM_NUMBER_MIN = 0;
    private static final Random RANDOM_NUMBER = new Random();

    public static int randomNumber(){
        return RANDOM_NUMBER.nextInt(RANDOM_NUMBER_MAX);
    }

    public static void checkRandomNumber(int number){
        if(number < RANDOM_NUMBER_MIN || number > RANDOM_NUMBER_MAX){
            throw new IllegalArgumentException("생성된 숫자가 0보다 작거나 10보다 큽니다");
        }
    }

    public static boolean compareNumber(int number){
        return number >= RANDOM_NUMBER_RULE;
    }

    public static boolean checkExistComma(String str){
        int length = str.length();
        if(str.equals("")){
            return true;
        }
        String splitStr = str.substring(length-2, length-1);
        return splitStr.equals(",");
    }

    public static String addComma(String str1, String str2){
        if(!str1.equals("") && !checkExistComma(str2)){
            return ", ";
        }
         return "";
    }
}
