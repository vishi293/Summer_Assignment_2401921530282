class Solution {
    public boolean isPalindrome(String s) {
       
        int l = 0;
        int r = s.length() - 1;
        
        while (l < r) {
            // Move left pointer right if character is not alphanumeric
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            // Move right pointer left if character is not alphanumeric
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            
            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            
            // Move both pointers inward after a successful match
            l++;
            r--;
        }
        
        return true;
    }
}
        
    
