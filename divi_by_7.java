import java.util.Scanner;

public class divi_by_7 {
    public static void divi_by_7(int n)
    {
        if (n % 7 ==0)
        System.out.println("Divisible");
        else
        System.out.println("Not Divisible");

    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        divi_by_7(a);

    }
    
}
