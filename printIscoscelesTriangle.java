import java.util.Scanner;

public class printIscoscelesTriangle{
	public static void main(String[] args){
		System.out.println("Enter the nuber of lines");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count=1;
		for(int i=1;i<=n;i++){
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			for(int k=1;k<=count;k++)
				System.out.print("*");
			count += 2;
			System.out.println();
		}
	}
}
