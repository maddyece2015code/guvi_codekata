import java.util.Scanner;
class hunt3{
public static void main(String arg[])
{
int n,flag=0,b;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
 if(a[i]==i)
 {
   flag=1;
   System.out.print(a[i]+" ");
 }
}
 if(flag==0)
 {
  b=-1;
  System.out.print(b);
 }
}
}
