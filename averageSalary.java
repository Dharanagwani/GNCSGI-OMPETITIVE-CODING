class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(salary[j]>salary[j+1]){
                    int temp=salary[j];
                    salary[j]=salary[j+1];
                    salary[j+1]=temp;
                }
            }
        }
        double sum=0.00;
        double average=0.00;
        for(int i=1;i<n-1;i++){
            sum=sum+salary[i];
        }
        average=sum/(n-2);
        return average;
    }
}
