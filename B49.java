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
public class B49 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[2];
        int sum;
        for(int i=0;i<2;i++)
        {
            a[i]=sc.nextInt();
        }
        sum=a[0]+a[1];
        System.out.println(sum);
    }
}
