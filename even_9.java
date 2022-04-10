import java.util.Scanner;

public class even_9 {
public static void even(int n)
{
    if(n % 2 == 0)
    for(int i = n;i>0;i=i-2)
    System.out.println(i);
    else
    System.out.println("Input number is not even");

}   
public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    even(a);
} 
}
