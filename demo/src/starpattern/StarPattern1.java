package starpattern;

public class StarPattern1 {

	public static void main(String[] args) {
			int num=1;
			int spc=5;
			int row=5;
			for (int i=1;i<=row; i++){
				for(int j=1;j<spc;j++){
					System.out.print(" ");
				}
				for (int j=1;j<=num;j++){
				System.out.print(num+" ");
			}
			System.out.println();
		     	spc--;
				num++;
		}

		}

}
