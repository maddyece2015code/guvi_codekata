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
 class B21 {
    public static void main(String args[])
    {
        float N,A,D,S;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        A=sc.nextInt();
        D=sc.nextInt();
        S= (N / 2) * (2 * A + (N - 1) * D); 
        int r=Math.round(S);
        System.out.println(r);
    }
    
}
