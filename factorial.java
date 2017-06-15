import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int factorial=n;
for(int i=(n-1);i>1;i--)
{
factorial=(factorial*i);
}
System.out.println("factorial number is" +factorial);
}









