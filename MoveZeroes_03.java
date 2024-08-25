import java.util.Arrays;

public class MoveZeroes_03 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,4,12};
        System.out.println(Arrays.toString(moveZero(arr)));
    }

    public static int[]moveZero(int[]numbers){
        int[] newArray = new int[numbers.length];
        int start=0,end = numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]!=0){
                newArray[start] = numbers[i];
                start++;
            }else{
                newArray[end] = numbers[i];
                end--;
            }
        }
        return newArray;
    }
}
