/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX3 TP3
public class Mavenproject2 {

    public static void main(String[] args) {
                
          
        int N;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("Entrer la taille (comprise entre 10 et 50) : ");
            N=in.nextInt();
        }while(N<10 || N>50 );
        char[] table=new char[N]; 
            for(int i=0;i<table.length;i++){
                System.out.println("Entrer l'element : "+(i+1));
                table[i]=in.next().charAt(0);
            }
            for(int i=0;i<table.length;i++){
                   System.out.println("l'elem1ent "+(i+1)+" : "+table[i]); 
            }
        }       
}
