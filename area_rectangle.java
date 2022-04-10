import java.util.Scanner;

public class area_rectangle {

    public static float area(float l,float b)
    {
        return l*b;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breathe= sc.nextFloat();

        float ans= area(length, breathe);
        System.out.print(ans);
    }
}
