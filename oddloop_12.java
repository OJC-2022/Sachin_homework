import java.util.Scanner;

public class oddloop_12 {
    public static void odd(int n,int m)
    {
        for (int i= n;i<=m;i++)
        if(i % 2 != 0)
        System.out.println(i);


    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        odd(a,b);
    }
}
