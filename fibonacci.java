import java.io.*;
import java.util.*;
public class fibonacci
{
public static void main(String args[])
{
int t1=0,t2=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;++i)
{
System.out.print(t1 +" ");
int sum=t1+t2;
t1=t2;
t2=sum;
}
}
}
