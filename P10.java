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
public class P10 {
     public static void main(String args[])
    {
        String s,s1;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        s1=sc.next();
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s1.charAt(i))
            {
                flag++;
            }
        }
        if(flag==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
