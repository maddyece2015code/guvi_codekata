import java.util.*;
class rev{
public static void main(String arg[])
{
int n,r,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int num=n;
while(num>0)
{
 r=num%10;
 sum=sum*10+r;
 num=num/10;
}
System.out.print(sum);
}
}