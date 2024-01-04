class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else if(nums[mid]<=nums[end]){
                if(nums[mid]<ans){
                    ans=nums[mid];
                }
                end=mid-1;
            }
        }
        return ans;
    }
}
