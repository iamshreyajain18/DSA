class Solution {
    public int totalFruit(int[] fruits) 
    {
        int left=0;
        int maxy=0;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int right=0;right<fruits.length;right++)
        {
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            

            while(mp.size()>2)
            {
                int out=fruits[left];
                mp.put(out,mp.getOrDefault(out,0)-1);
                if(mp.get(out)==0)
                {
                    mp.remove(out);
                }
                left++;         
            }
            

            maxy=Math.max(maxy,right-left+1);
        }
        return maxy;
    }
}