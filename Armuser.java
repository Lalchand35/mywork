import java.util.Scanner;
public class Armuser 
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    int temp=num;
    int r,sum=0;
    while(num>0)
    {
        r=num%10;
        num=num/10;
        sum=sum+r*r*r;
    }
    if(temp==sum)
    {
        System.out.println("is armstrong");
    }
    else{
        System.out.println("is not armstrong");
    }
}
}