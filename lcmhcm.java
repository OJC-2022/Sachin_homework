import java.util.Scanner;

public class lcmhcm {
    public static void lcmhcm(int m,int n)
    {
        int product= m*n;
        int k;
        do
        {
            k=n % m;
            n=m;
            m=k;

        }
        while (k != 0);
        int hcf=  n;
        int lcm= product/hcf;
        System.out.println("LCM=" + lcm + "HCF=" + hcf);

    }
    public static void main( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a<b)
        lcmhcm(a, b);
        else
        lcmhcm(b, a);
    }
    
}
