class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int remainder;
        int reversedNum = 0;
        if(x<0)
        return false;
        while (x !=0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x = x/10;
        }
        if(originalNum == reversedNum)
        return true;
        else
        return false;
    }
}