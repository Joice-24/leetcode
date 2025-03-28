package leetcode;

public class reverseinteger {
    public static void main(String[] args) {
        int x = 120; 
        int reversed = reverse(x); 
        System.out.println("Reversed Integer: " + reversed); 
    }
    
    public static int reverse(int x) {
        int reversed = 0;
        
       
        while (x != 0) {
            int digit = x % 10; 
            reversed = reversed * 10 + digit; 
            x /= 10;
        }
        
        return reversed;
    }
}
