import java.util.*;
public class Array_01{
    public void printArray(int[] array){
        int len = array.length;
        for(int i=0;i<len;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Array_01 arr = new Array_01();
        int[] array = new int[5];
        arr.printArray(array);    
    }
}