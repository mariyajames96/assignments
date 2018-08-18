import java.util.Scanner;

public class printNAsteriks {
    public static void main(String[] args){
        System.out.println("Enter the number of asteriks");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++)
            System.out.print("*");
    }
}
