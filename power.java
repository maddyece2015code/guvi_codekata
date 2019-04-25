import java.util.Scanner;
class power{
public static void main(String args[]){
int n,s,out=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
s=sc.nextInt();
for(int i=1;i<s;i++)
 {out+=n*n;}
System.out.println(out);
}
}