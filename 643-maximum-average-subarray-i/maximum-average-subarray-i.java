class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        long sum=0;
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        long maxsum=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            if(sum>maxsum)
            {
                maxsum=sum;
            }

        }
        
    
    return (double) maxsum/k;

    }
}