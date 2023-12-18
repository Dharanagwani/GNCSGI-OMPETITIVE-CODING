class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int []tempA=new int[n];
        for(int i=0;i<n;i++){
            tempA[i]=heights[i];
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(heights[j]>heights[j+1]){
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(heights[i]!=tempA[i])
            {
                count++;
            }
        }
        return count;
    }
}
