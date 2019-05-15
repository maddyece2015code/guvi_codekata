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
public class B50 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N,f=0;
        N=sc.nextInt();
        while(N!=0)
        {
            if(N%2==0)
            {
                f=1;
            }
            else
            {
                f=0;
            }
            N=N/2;
        }
        if(f==0)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
    }
}