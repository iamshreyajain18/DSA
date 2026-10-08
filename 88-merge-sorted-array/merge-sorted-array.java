class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, k = 0;
        //int n1=nums1.length,n2=nums2.length;

        //int mid=low+(high-low)/2;
        //int low=0,high=mid+1;
        int size = m + n;
        int[] temp = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            temp[k] = nums1[i];
            i++;
            k++;

        }
        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }
        for (int z = 0; z < temp.length; z++) {
            nums1[z] = temp[z];
        }

    }
}