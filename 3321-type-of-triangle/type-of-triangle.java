class Solution {
    public String triangleType(int[] nums) {
        int i = 0;
        int a = nums[i], b = nums[i+1], c = nums[i+2];
        
        // 1. Check if it's a valid triangle FIRST
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        
        // 2. Then check the triangle types
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}