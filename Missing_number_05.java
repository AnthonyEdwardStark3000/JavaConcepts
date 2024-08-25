public class Missing_number_05 {
    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        System.out.println(Integer.toString(missingNumber(array)));
    }

    public static int missingNumber(int[] numbers){
        int n = numbers.length+1;
        int totalSum = n*(n+1)/2;
        for(int number:numbers){
            totalSum = totalSum - number;
        }
        return totalSum;
    }
}
