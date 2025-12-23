class Solution {
    public int reverse(int x) {
        int n=x ; //creating a copy
        int rev=0;
        if(n>0){
        while(n>0){
            int d=n%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)){
            return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)){
            return 0;
            }
            rev= rev*10+d;
            n=n/10;
            }
        }else{
            n*=(-1);
            while(n>0){
            int d=n%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)){
            return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)){
            return 0;
            }
            rev= rev*10+d;
            n=n/10;
            }
            rev*=-1;
        }
        return rev; //reverse will store your reversed number 
    }
}