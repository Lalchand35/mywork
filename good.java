
interface good 
{
public void display();
}
class dell implements good
{
    public void display()
    {
        System.out.println("hello");
    }

public static void main(String[]args)
{
    dell d =new dell();
    d.display();
}
}
