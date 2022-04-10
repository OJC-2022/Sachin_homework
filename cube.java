import java.util.Scanner;

public class cube {
    public static float cube(float n)
    {
        return n*n*n;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        float ans= cube(a);
        System.out.print(ans);
    }
    
}
