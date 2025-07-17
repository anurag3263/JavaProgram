package abc;

public class StringReverseWithInitCaps {

	public static void main(String[] args) {
		String string = "this is system generated code";
		String[] arr = string.split(" ");
		System.out.println(string);
		for (int i = arr.length - 1; i >= 0; i--) {
			String temp = arr[i].substring(0,1).toUpperCase();
			String rest = arr[i].substring(1);
			System.out.print(temp + rest + " ");
		}

	}

}
