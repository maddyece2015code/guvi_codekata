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
public class P9 {
    public static void main(String args[])
    {
        int i,r;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        r=sc.nextInt();
        int count=0,flag=0;
        if(i==1)
        {
            i=i+1;
        }
        for(int a=i;a<=r;a++)
        {
            for(int j=2;j<=a/2;j++)
            {
                if(a%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag!=1)
            {
                count++;
            }
            flag=0;
        }
        System.out.println(count);
    }
}

