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
public class B47 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N,high,low;
        N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        low=a[0];
        high=a[0];
        for(int i=0;i<N;i++)
        {
            if(a[i]<low)
            {
                low=a[i];
            }
            else if(high<a[i])
            {
                high=a[i];
            }
        }
        System.out.println(low+" "+high);
    }
}