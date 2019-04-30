import java.util.*;
class armstrong{
public static void main(String args[])
{
 int num,r,res=0,temp;
 Scanner sc=new Scanner(System.in);
 num=sc.nextInt();
 temp=num;
 while(temp>0)
{
 r=temp%10;
 res+=r*r*r;
 temp=temp/10;
}
if(res==num)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}