class Solution {
    public String removeDigit(String number, char digit) {
       String maxResult = "";
        
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                // Remove the digit at index i
                String newNumber = number.substring(0, i) + number.substring(i + 1);
                
                // Update max result if newNumber is greater
                if (newNumber.compareTo(maxResult) > 0) {
                    maxResult = newNumber;
                }
            }
        }

        return maxResult;  
    }
}