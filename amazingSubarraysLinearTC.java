import java.util.*;

class amazing_Subarrays {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a name containing at least 1 vowel:");
        String A = sc.nextLine();
        int N = A.length();
        int count = 0;
        // Linear TC @ O(n)
        for (int i=0; i<N; i++) {
            if (isVowel (A.charAt(i))) {
                count += (N-(i+1))+1;
                count = count % 10003;
            }
        }           
        System.out.println("Amazing Subarrays count is - " + count);
        sc.close();
    }

    public static boolean isVowel(char v) {
        return (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U');
    }
}