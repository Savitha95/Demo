import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
int n,r,sum=0,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println("palindrome number");
else
System.out.println("not a palindrome number");
}
}
