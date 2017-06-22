import java.io.*;
import java.util.Scanner;
public class Codekata {
    public static void main(String args[])
    {
        String str1,str2;
        int i;
        Scanner s=new Scanner(System.in);
        str1=s.nextLine();
        str2=s.nextLine();
        char p1[]=str1.toCharArray();
        char p2[]=str2.toCharArray();
        int p[]=new int[p1.length];
        int pp[]=new int[p2.length];
        int a[]=new int[p1.length];
        int aa[]=new int[p2.length];
        char c[]=new char[p1.length];
        char cc[]=new char[p2.length];
        for(i=0;i<p1.length;i++)
        { 
            p[i]=(int)p1[i];
        
           // System.out.println(p[i]);
           a[i]=p[i]+10;
           c[i]=(char)a[i];
           System.out.print(c[i]);
        }
           System.out.print(p2[0]);
        
            for(i=1;i<p2.length-1;i++)
        { 
            pp[i]=(int)p2[i];
            
        
           // System.out.println(p[i]);
           aa[i]=pp[i]+10;
           if(aa[i]>122)
            {aa[i]=aa[i]-122;
            aa[i]=96+aa[i];
            }
           cc[i]=(char)aa[i];
          System.out.print(cc[i]);
        } 
           System.out.print(p2[p.length-1]);
           }}
    
