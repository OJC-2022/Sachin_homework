import java.util.Scanner;

// print n number which is divisible by m and number start from m
public class divisible_10 {
    public static void divisible(int m,int n )
    {
        for(int i=1;i<=n;i++)
        System.out.println(m*i);
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        divisible(a, b);
    }
}
