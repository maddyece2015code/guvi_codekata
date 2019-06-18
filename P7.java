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
public class P7 {
    public static void main(String args[])
    {
        String s;
        String res="";
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char temp;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i=i+2)
        {
           temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            res+=arr[i];
        }
        System.out.println(res);
    }
}
