package starpattern;

public class StarPattern2 {

	public static void main(String[] args) {
		int num=1;
		int spc=3;
		for(int i=1;i<=5;i++ ) {
			for(int j=1;j<=spc;j++) {
				System.out.print(" "+num);
			}
			System.out.println();
		}
		num++;
		spc--;

	}

}
