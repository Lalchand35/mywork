import java.util.Scanner;
public class prim2 
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    int temp=0;
    //int i;
    for(int i=2;i<=num-1;i++)
    {
        if(num%i==0){
         temp=temp+1;
    }
    }
     if(temp==0)
    {
     System.out.println("is prime"+num);
    }
    else{
        System.out.println("no is not prime"+num);
    }
    sc.close();
}
}