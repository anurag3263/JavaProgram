package abc;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 7, 8, 4, 5, 9, 9, 8 };
		int secondLargest = findSecondLargest(nums);
		System.out.println("The second largest element is: " + secondLargest);
	}

	public static int findSecondLargest(int[] nums) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
			} else if (nums[i] > secondMax && nums[i] < max) {
				secondMax = nums[i];
			}
		}

		return secondMax;
	}
}