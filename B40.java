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
public class B40 {
    public static void main(String args[])
    {
        int f1=1,f2=1,f3,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(f1+" ");
        System.out.print(f2+" ");
        for(int i=0;i<n-2;i++)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+" ");
        }
    }
    
}
