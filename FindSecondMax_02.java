import java.util.*;
public class FindSecondMax_02{
    public static void main(String[] args){
        int[] array = {13,34,2,34,33,1};
        System.out.println("Second maximum number present in the array"+Arrays.toString(array)+"is :"+secondMax(array));
    }

    public static int secondMax(int[] numbers){
        int max = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                secondMax = max;
                max = numbers[i];
            }else if(numbers[i]>secondMax && numbers[i]!=max){
                secondMax = numbers[i];
            }
        } 
        return secondMax;
    }
}