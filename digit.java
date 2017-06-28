import java.io.*;
import java.util.*;
class digit
{
public static void main(String args[])
{
int n,count=0,r;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
r=n%10;
count++;
n=n/10;
}
System.out.println("no.of digits=" +count);
}
}
