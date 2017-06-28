import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
int n,i,f=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
System.out.print("prime");
f=1;
break;
}
if(f!=1)
System.out.println("not a prime");
}
}
