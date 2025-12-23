// Save the file with the name of solution.java to run in localdevice
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reversednumber = 0;
        int originalvariable = x;
        while(x>0){
            
            int lastdigit =x%10;
            reversednumber = (reversednumber*10)+lastdigit;
            x=x/10;  
        }
        return originalvariable == reversednumber;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        if(sol.isPalindrome(121)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}