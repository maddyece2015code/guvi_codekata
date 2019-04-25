import java.util.Scanner;
class sumofN{
public static void main(String args[]){
int N,sum=0;
Scanner in=new Scanner(System.in);
N=in.nextInt();
for(int i=1;i<=N;i++)
 sum+=i;
System.out.println(sum);
}
}