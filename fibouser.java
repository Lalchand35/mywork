import java.util.Scanner;
public class fibouser 
{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1 number");
int a=sc.nextInt();
System.out.println("enter the 2 number");
int b=sc.nextInt();
while(b<=10)
{
    System.out.println(b);
    b=a+b;
    a=b-a;
}

}
}