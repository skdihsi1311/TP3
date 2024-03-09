/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;



import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX2 TP3
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Entrer dix elements");
        Scanner in=new Scanner(System.in);
        char[] table=new char[10];
            for(int i=0;i<10;i++){
                System.out.println("Entrer l'element : "+(i+1));
                table[i]=in.next().charAt(0);
                
            }
               for(int i=0;i<table.length;i++){
                   System.out.println("l'elem1ent "+(i+1)+" : "+table[i]);
               }
            
        }       
}
