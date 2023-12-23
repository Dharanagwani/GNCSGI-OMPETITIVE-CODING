class Solution {
    public int balancedStringSplit(String s) {
        int count1=0, count2=0, max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                count1++;
            }
            else{
                count2++;
            }
            if(count1==count2){
                max++;
            }
        }
        return max;
    }
}
