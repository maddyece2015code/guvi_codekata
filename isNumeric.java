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
public class isNumeric {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.next();
        Boolean num=true;
        Double b;
        try
        {
            b=Double.parseDouble(str);
        }
        catch(NumberFormatException ex)
        {
            num=false;
        }
        if(num)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
