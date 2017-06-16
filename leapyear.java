import java.io.*;
import java.util.*;
public class leap
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%4==0)
System.out.println("leap year");
else
System.out.println("not a leap year");
}
}
