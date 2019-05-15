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
public class B45 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N,count=0;
        N=sc.nextInt();
        if(N==0)
        {
            count=1;
            System.out.println(count);
        }
        else
        {
         while(N>0)
          {
            N=N/10;
            count++;
          }
          System.out.println(count);
        }
    }
}
