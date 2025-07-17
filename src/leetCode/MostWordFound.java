package leetCode;

public class MostWordFound {

	public static void main(String[] args) {
		String[] strings = { "please wait", "continue to fight", "continue to win" };
		System.out.println(mostWordsFound(strings));

	}

	public static int mostWordsFound(String[] sentences) {
		int count = 0;
		for (int i = 0; i < sentences.length; i++) {
			String[] s = sentences[i].split(" ");
			int n = s.length;
			if (n > count) {
				count = n;
			}
		}
		return count;
	}

}
