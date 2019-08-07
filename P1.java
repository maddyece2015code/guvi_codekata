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
public class P1 {
    public static void main(String args[])
    {
        String a,res="";
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        for(int i=a.length()-1;i>=0;i--)
        {
            res=res+a.charAt(i);
        }
        System.out.println(res);
    }
}
