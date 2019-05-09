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
public class B29 {
    public static void main(String args[])
    {
        int min,t,r;
        Scanner sc=new Scanner(System.in);
        min=sc.nextInt();
        if(min>=60)
        {
            t=min/60;
            r=min%60;
            System.out.println(t+" "+r);
        }
        else
        {
            t=0;
            r=min;
             System.out.println(t+" "+r);
        }
    }
    
}
