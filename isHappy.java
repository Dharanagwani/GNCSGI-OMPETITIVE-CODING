class Solution {
    public boolean isHappy(int n) {
        int lastdigit=0;
        
        while(n>=10){
            int sum=0;
            while(n>0){
                lastdigit=n%10;
                sum=sum+lastdigit*lastdigit;
                n=n/10;
            }
            n=sum;
        }
        if(n==1 || n==7) return true;
        else return false;

    }
}
