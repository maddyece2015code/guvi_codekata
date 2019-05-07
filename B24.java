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
class B24 {
    public static void main(String args[])
    {
        int N,temp;
        Scanner sc=new Scanner (System.in);
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
          for(int i=0;i<N;i++)
        {
         System.out.print(arr[i]+" ");
        }
    }
    
}

