class Solution {
    public String reverseWords(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(i>=0 && s.charAt(i)==' ' || i==s.length()-1){
                int j=0;
                if(i==s.length()-1) j=i;
                else j=i-1;
                while(j>=0 && s.charAt(j)!=' '){
                    str=str+s.charAt(j);
                    j--;
                }
            }
            if(s.charAt(i)==' '){
                str=str+" ";
            }
        }
        return str;
    }
}
