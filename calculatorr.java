import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class calculatorr {
    public static void add()
    {
        System.out.println("Enter two numbers for addition");
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int b= sc.nextInt();
        int d= c + b;
        System.out.println("Add=" + d);
       
    }
    public static void Subtract()
    {
        System.out.println("Enter two numbers for subtraction");
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int b= sc.nextInt();
        int d= c - b;
        System.out.println("Subtract=" + d);
       
    }
    public static void Multiply()
    {
        System.out.println("Enter two numbers for multiplication");
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int b= sc.nextInt();
        int d= c * b;
        System.out.println("Multiply=" + d);
      
    }
    public static void Division()
    {
        System.out.println("Enter two numbers for division");
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int b= sc.nextInt();
        int d;
        if (b != 0)
    {
         d= c / b;
         System.out.println("Division = " + d);
    }
        else
        System.out.println("Divisor should not be zero");
        
        


    }
    public static void Remainder()
    {
        System.out.println("Enter two numbers to find remainder");
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();
        int b= sc.nextInt();
        int d= c % b;
        System.out.println("Remainder=" + d);
        
    }
    public static void Exit()
    {
        
       System.exit(0) ;

    }
    public static void option()
    {
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Remainder\n6.Exit");
Scanner sc= new Scanner(System.in);
System.out.println("Enter your option:-");
int a= sc.nextInt();
switch(a)
{
case 1 :
{
add();
break;
}
case 2 :
{
    Subtract();
    break;

}
case 3 :
{
    Multiply();
    break;
}
case 4 :
{
    Division();
    break;

}

case 5:
{
    Remainder();
    break;
}
case 6:
{
    Exit();
    break;
}
}


    }
    public static void calculator()
    {
        System.out.println("Welcome to mini calculator");
        option();
        while(true)
        {
            System.out.println("Mini calculator");
            option();

        }

    }
    public static void main(String [] args)
    {
        calculator();
    }
    
}
