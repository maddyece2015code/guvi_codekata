import java.util.Scanner;
class leap{
public static void main(String args[]){
 int num;
 Scanner sc=new Scanner(System.in);
 num=sc.nextInt();
 if(num%4==0){
    System.out.println("yes"); 
  }
 else{
    System.out.println("no"); 
  }
}
}
