import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class primeFactors{
	public static void main(String[] args){
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int input  = scanner.nextInt();
		List<Integer> result = computePrimeFactors(input);
		System.out.println(result);
	}
	static List<Integer> computePrimeFactors(int n){
		List<Integer> result = new ArrayList<>();
		for(int i=2;i<=n;i++){
			if(n%i==0){
				result.add(i);
				n = n/i;
				i--;
			}
		}
		return result;
	}
}
