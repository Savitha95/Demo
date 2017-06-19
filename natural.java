import java.io.*;
import java.util.*;
public class natural
{
public static void main(String args[])
{
int sum=0,n,r;
Scanner sc=new Scanner(System.in);
n=sc.nextInt(0;
while(n>0)
{
r=r%10;
sum=sum+r;
n=n/10;
}
System.out.println(sum);
}
}
