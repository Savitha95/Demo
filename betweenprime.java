import java.io.*;
import java.util.*;
public class betweenprime
{
public static void main(String args[])
{
int s1,s2,flag=0,i,j;
Scanner sc=new Scanner(System.in);
 s1=sc.nextInt();
 s2=sc.nextInt();
  for(i=s1;i<=s2;i++)
  {
    for(j=2;j<i;j++)
        {
          if(i%j==0)
          {
            flag=0;
            break;
          }
          else
          {
            flag=1;
          }
        }
          if(flag==1)
          {
            System.out.println(i);
          }
        }
        }
        
