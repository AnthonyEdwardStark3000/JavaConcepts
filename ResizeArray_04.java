import java.util.Arrays;

public class ResizeArray_04 {
    public static void main(String[] args) {
        int[] array = {5,9,3,10};
        int size = 10;
        System.out.println("Original Array : "+Arrays.toString(array)+"\n"+"Resized Array"+Arrays.toString(resizeArray(array,size)));
    }

    public static int[] resizeArray(int[] numbers, int size){
        int[] newArray = new int[size];
        for(int i=0;i<numbers.length;i++){
            newArray[i] = numbers[i];
        }
        return newArray;
    }
}
