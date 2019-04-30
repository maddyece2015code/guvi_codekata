import java.util.*;
class factorial{
public static void main(String args[])
{
 int n,res=1;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
  res=res*i;
 }
System.out.print(res);
}
}
 