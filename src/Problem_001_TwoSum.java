class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m-1 ;
        int n2 = n-1 ;
        int t = n+m-1 ; 
        while ( n2 >= 0){
            if ( n1 >= 0 && nums1[n1] > nums2[n2] ){
                nums1[t]=nums1[n1] ; 
                n1--;
            }
            else {
                nums1[t]=nums2[n2] ;
                n2--;
            }
            t--;
        }
    }
}