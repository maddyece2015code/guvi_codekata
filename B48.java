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
public class B48 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N,sum=0,avg;
        N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            sum+=a[i];
        }
        avg=sum/N;
        System.out.println(avg);
        
 
    }
}
