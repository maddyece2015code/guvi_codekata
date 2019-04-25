import java.util.Scanner;
class palinNo{
public static void main(String args[]){
int num,temp=0,r,sum;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
sum=num;
while(num!=0)
{
 r=num%10;
 temp=(temp*10)+r;
 num=num/10;
}
if(temp==sum)
 System.out.println("yes");
else
 System.out.println("no");
}
}
