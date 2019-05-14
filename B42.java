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
public class B42 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l1,l2;
        String S;
        S=sc.nextLine();
        String str[]=S.split(" ");
        l1=str[0].length();
        l2=str[1].length();
        if(l1>l2)
        {
            System.out.println(str[0]);
        }
        else if(l1==l2)
        {
            System.out.println(str[1]);
        }
        else
        {
            System.out.println(str[1]);
        }
    }
}