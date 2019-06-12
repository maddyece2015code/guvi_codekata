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
public class Hunt9 {
    public static void main(String args[])
    {
        int n,zero=1,f,s,sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        f=arr[0];
        s=arr[1];
        zero=Math.abs(f+s);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum=Math.abs(arr[i]+arr[j]);
                if(sum<=zero)
                {
                    zero=sum;
                    f=arr[i];
                    s=arr[j];
                }
                 if(zero==-1||zero==+1)
                    {
                        break;
                    }
                    
            }
        }
        System.out.println(f+" "+s);
    }
}
