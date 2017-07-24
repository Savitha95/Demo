import java.io.*;
import java.util.*;
public class reverse
{
public static void main(String args[])
{
int rev=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
rev=rev*10+(n%10);
n=n/10;
}
System.out.print(rev);
}
}
