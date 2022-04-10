import java.io.*;
import java.util.Scanner;
public class even_odd{
    public static void even_od(int n)
    {
        if(n % 2 ==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        even_od(a);
    }
}
