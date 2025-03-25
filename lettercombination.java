
package leetcode;
import java.util.ArrayList;
import java.util.List;

public class lettercombination {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        String[] digitToChar = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), result, digitToChar);
        
        return result;
    }
    private void backtrack(String digits, int index, StringBuilder currentCombination, List<String> result, String[] digitToChar) {
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = digitToChar[digit - '0']; 
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter); 
            backtrack(digits, index + 1, currentCombination, result, digitToChar); 
            currentCombination.deleteCharAt(currentCombination.length() - 1); 
        }
    }
    public static void main(String[] args) {
        lettercombination l1= new lettercombination();
        System.out.println(l1.letterCombinations("23"));
    }
}
