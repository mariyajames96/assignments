import java.util.Scanner;

public class printIscoscelesTriangle{
	public static void main(String[] args){
		System.out.println("Enter the nuber of lines");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			for(int k=1;k<i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
