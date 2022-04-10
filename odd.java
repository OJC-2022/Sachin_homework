import java.util.Scanner;

public class odd {
    public static void  odd(int n)
    {
        int i=1;
        for(int j=1;j<=n;j++)
        {
            System.out.println(i);
            i=i+2;


    }
}
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        odd(a);
    }
    
}
