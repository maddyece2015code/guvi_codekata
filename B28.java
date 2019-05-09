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
public class B28 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int N;
         N=sc.nextInt();
         int arr[]=new int[N];
         for(int i=0;i<N;i++)
         {
             arr[i]=sc.nextInt();  
         }
         for(int i=0;i<N;i++)
         {
             System.out.println(arr[i]+" "+i);
         }
     }
}
