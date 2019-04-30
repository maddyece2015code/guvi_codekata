import java.util.Scanner;
class primeint{
public static void main(String args[]){
int n1,n2,flag,temp;
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();

while(n1<n2)
{
 flag=0;
  for(int i=2;i<=n1/2;i++)
   {
	if(n1%i==0)
	{
	  flag=1;
	  break;
	}
    }
   if(flag==0)
	{
	  System.out.print(n1+" ");
        }
 n1++;
} 
}
}