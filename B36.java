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
public class B36 {
    public static void main(String args[])
    {
        String str;
        int count=0,count1=0;
        Scanner sc=new Scanner (System.in);
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
          if(Character.isDigit(str.charAt(i))||Character.isAlphabetic(str.charAt(i)))
          {
            count++;   
          }
          else
          {
              count1++;
          }
        }
        System.out.println(count1);
        }
    }

