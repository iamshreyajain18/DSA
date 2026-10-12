
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        long maxsum = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

        }
        if(mp.size()==k)
        {
            maxsum=sum;

        }
        
        for (int right = k; right < nums.length; right++) {
            
            int out=nums[right-k];
            sum = sum - out + nums[right];
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);
            mp.put(out,mp.get(out)-1);
            if(mp.get(out)==0)
            {
                mp.remove(out);
            }

            
            if (mp.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }

        }
        return maxsum;
    }
}
