import java.util.*;
class hunt1
{
public static void main(String args[])
{
int n,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
 for(int j=i+1;j<n;j++)
 {
  if(a[i]==a[j])
  {
   System.out.print(a[j]+" ");
  }
 }
}
}
}