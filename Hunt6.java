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
public class Hunt6 {
     public static void main(String args[])
    {
           int N,rep=0;
           Scanner sc=new Scanner(System.in);
           N=sc.nextInt();
           int arr[]=new int[N];
           for(int i=0;i<arr.length;i++)
           {
               arr[i]=sc.nextInt();
           }
          // rep=arr[0];
           for(int i=0;i<arr.length;i++)
           {
               for(int j=i+1;j<arr.length;j++)
               {
                   if(arr[i]==arr[j])
                   {
                       rep=arr[i];
                       break;
                   }
               }
           }
           System.out.println(rep);
    }
}
