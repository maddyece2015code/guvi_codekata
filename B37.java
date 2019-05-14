/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madhavan
 */
import java.util.*;
    public class B37 {
    public static void main(String args[])
    {
        int n1,n2,temp;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1+" "+n2);
    }
    
}
