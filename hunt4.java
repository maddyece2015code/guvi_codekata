import java.util.*;
class hunt4{
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
  
  for(int j=0;j<n;j++)
  {
 
     if(a[i]==a[j])
      {
	flag++;
      }
  }
 if(flag==1)
    {
	System.out.print(a[i]);
    }
 flag=0;
}
}
}