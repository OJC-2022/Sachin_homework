import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class fib {
   public static int fibb (int n)
    {
        if (n==1)
        return 1;
        else if(n==2)
        return 1;
        else
        return fibb(n-1)+fibb(n-2);

    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int i=1;
        while(fibb(i)<= a)
        {
        System.out.println(fibb(i));
        i++;
        }


    }
    
}
