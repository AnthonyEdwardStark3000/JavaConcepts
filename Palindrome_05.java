public class Palindrome_05 {
    public static void main(String[] args) {
        String word = "MADARM";
        System.out.println(Palindrome(word));
    }

    public static String Palindrome(String s){
        String ans = "Palindrome";
        int start = 0,end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return "Not Palindrome";
            }
            start++;end--;
        }
        return ans;
    }
}
