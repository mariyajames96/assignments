import java.util.Scanner;

public class diamondWithNames{
	public static void main(String[] args){
		System.out.println("Enter the nuber of lines");
		Scanner input = new Scanner(System.in);
		String numberOfLines = input.nextLine();
		int n = Integer.parseInt(numberOfLines);
		System.out.println("Enter the name");
	        String name = input.nextLine();
		int count=1;
		for(int i=1;i<n;i++){
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			for(int k=1;k<=count;k++)
				System.out.print("*");
			count+=2;
			System.out.println();
		}
		System.out.println(name);
		for(int i=n;i>=1;i--){
			count-=2;
			for(int j=0;j<n-i+1;j++)
				System.out.print(" ");
			for(int k=1;k<=count;k++)
				System.out.print("*");
			System.out.println();
		}
	
	}
}
