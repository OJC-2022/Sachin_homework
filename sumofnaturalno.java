import java.util.Scanner;

public class sumofnaturalno {
    public static int sum(int n)
    {
        int s=0;
        for(int i=1;i<=n;i++)
        s=s + i;
        return s;

    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int ans= sum(a);
        System.out.println(ans);
    }
    
}
