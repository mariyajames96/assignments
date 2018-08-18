import java.util.Scanner;

public class printNLines {
    public static void main(String[] args){
        System.out.println("Enter the number of lines");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++)
            System.out.println("*");
    }
}
