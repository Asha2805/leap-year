import java.util.*;
public class leap
{
public static void main(String args[])
{
int ye;
Scanner e=new Scanner(System.in);
ye=e.nextInt();
if(ye%4==0 && ye%100!=0||ye%400==0)
{
System.out.println("THE leap Year);
}
else
{
System.out.print("Not Leap Year");
}
}
}
