package leetCode;

public class Merge_sorted_aaray {
		
		/*
		 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
		 * [1,2,2,3,5,6] Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
		 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
		 * from nums1.
		 */
		
		public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i = m - 1; // this line represents the last index of nums1
	        int j = n - 1; // Last index of nums2
	        int k = m + n -1; // last index of merged array

	        //Iterate through a while loop that will perform the merging of this 2 arrays nums1 and nums2
	        while (i >= 0 && j>=0){
	            if (nums1[i] >= nums2[j]){
	                nums1[k] = nums1[i];
	                i--; 
	            } else {
	                nums1[k] = nums2[j];
	                j--;
	            }
	            k--;
	        }

	        //Copy the remaining elements from nums2, if any
	        while (j >= 0) {
	            nums1[k] = nums2[j];
	            j--;
	            k--;
	        }
	    }
	    public static void main(String[] args){
	        int[] nums1 = {1, 2, 3, 0, 0, 0};
	        int m = 3;
	        int[] nums2 = {2, 5, 6};
	        int n = 3;

	        Merge_sorted_aaray solution = new Merge_sorted_aaray(); //Create an instance of the Solution class
	        solution.merge(nums1, m, nums2, n); // Call the merge method on the instance

	        for (int num : nums1) {
	            System.out.print(num + " ");
	        }
	    }
}
