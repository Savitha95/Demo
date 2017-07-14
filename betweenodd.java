import java.io.*;
import java.util.*;
public class betweenodd
{
public static void main(String args[])
{
int n;
int i,j;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(i=a;i<=b;i++)
{
if(i%2!=0)
System.out.println(i);
}
}
}
