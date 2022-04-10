import java.util.Scanner;

public class prime {
    public static void prime(int n)
    {
        int factor=0;
        for(int i=2;i<n;i++)
        if(n % i == 0)
        factor ++;
        if(factor>0)
        System.out.println("Not prime");
        else if(factor == 0)
        System.out.println("Prime ");


    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prime(a);
    }
    
}
