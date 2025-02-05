class Solution {
    public String reverseVowels(String s) {
         String vowels = "aeiouAEIOU";
        int i = 0, j = s.length() - 1; // `j` should start at s.length() - 1
        char[] charArr = s.toCharArray(); // Correct method to convert string to char array

        while (i < j) {
            // Move `i` forward until a vowel is found
            while (i < j && vowels.indexOf(charArr[i]) == -1) {
                i++;
            }
            // Move `j` backward until a vowel is found
            while (i < j && vowels.indexOf(charArr[j]) == -1) {
                j--;
            }
            // Swap the vowels
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;

            i++;
            j--;
        }

        return new String(charArr);
    }
}