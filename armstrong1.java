import java.util.*;
class armstrong1{
public static void main(String args[])
{
 int num1,num2,r,res,temp;
 Scanner sc=new Scanner(System.in);
 num1=sc.nextInt();
 num2=sc.nextInt();
while(num1<num2)
{
 res=0;
 temp=num1;
 while(temp>0)
{
 r=temp%10;
 res+=r*r*r;
 temp=temp/10;
}
if(res==num1)
{
System.out.print(res+" ");
}
num1++;
}
}
}