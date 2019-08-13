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
public class h11 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String out="";
        int len=s.length();
        String temp[]=s.split(" ");
         System.out.println(temp.length);
        for(String item:temp)
        {
            String res="";
           
            for(int j=item.length()-1;j>=0;j--)
            {
                res=res+item.charAt(j);
            }
            out = out + res+" ";
        }
        System.out.println(out);
        }  
}
