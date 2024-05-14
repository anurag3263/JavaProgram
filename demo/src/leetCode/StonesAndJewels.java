package leetCode;

public class StonesAndJewels {
//
//	Example 1:
//
//		Input: jewels = "aA", stones = "aAAbbbb"
//		Output: 3
//		Example 2:
//
//		Input: jewels = "z", stones = "ZZ"
//		Output: 0
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));

	}

	public static int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
			if (jewels.indexOf(stones.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}

}
