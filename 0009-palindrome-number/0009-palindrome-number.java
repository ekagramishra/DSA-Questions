class Solution {
    public boolean isPalindrome(int x) {

        int n=x ; //creating a copy
        int rev=0;
        if(n<0){
            return false;
        }
        if(x==0){ //the test case i could not figure out
            return true;
        }
        if(n%10==0){ //if the last digit turns out to be zero
            return false;
        }
        while(n>0){
            int d=n%10;
            //checking whether the number lies in the range or not
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)){
            return false;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)){
            return false;
            }
            rev= rev*10+d;
            n=n/10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}