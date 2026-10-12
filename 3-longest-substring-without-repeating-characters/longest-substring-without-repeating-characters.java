class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int left=0,maxy=0;
        HashSet<Character> set=new HashSet<>();

        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxy=Math.max(right-left+1,maxy);
        }
        return maxy;
    }
}