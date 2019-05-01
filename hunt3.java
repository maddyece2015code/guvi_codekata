import java.util.Scanner;
class hunt3{
public static void main(String arg[])
{
int n;
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
   System.out.print(a[i]+" ");
 }
}
}
}