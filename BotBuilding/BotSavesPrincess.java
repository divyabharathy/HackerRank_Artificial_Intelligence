/*Complete the function displayPathtoPrincess which takes in two parameters - the integer N and the character array grid. The grid will be formatted exactly as you see it in the input, so for the sample input the princess is at grid[2][0]. The function shall output moves (LEFT, RIGHT, UP or DOWN) on consecutive lines to rescue/reach the princess. The goal is to reach the princess in as few moves as possible.

The above sample input is just to help you understand the format. The princess ('p') can be in any one of the four corners.

SAMPLE INPUT
3
---
-m-
p--

SAMPLE OUTPUT
DOWN
LEFT

SAMPLE INPUT 2
5                                                                                                                                             
-----                                                                                                                                         
--m--                                                                                                                                         
-----                                                                                                                                         
-p---                                                                                                                                         
----- 

SAMPLE OUTPUT 2
DOWN
DOWN
LEFT

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavesPrincess {

static void displayPathtoPrincess(int n, String [] grid){
        char[][] b=new char[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            b[i][j]=grid[i].charAt(j);
        }
    }
    int i_index_m=0,i_index_p=0,j_index_m=0,j_index_p=0,ns,ew;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(b[i][j]=='m')
            {
                i_index_m=i;
                j_index_m=j;
            }
            else if(b[i][j]=='p')
            {
                i_index_p=i;
                j_index_p=j; 
            }
        }
    }
    ns=i_index_m-i_index_p;
    ew=j_index_m-j_index_p;
    for(int i=0;i<Math.abs(ns);i++)
    {
        if(ns>0)
        {
            System.out.println("UP");
        }
        else
        {
            System.out.println("DOWN");
        }
    }
    for(int j=0;j<Math.abs(ew);j++)
    {
        if(ew>0)
        {
            System.out.println("LEFT");
        }
        else
        {
            System.out.println("RIGHT");
        }
    }
  }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}
