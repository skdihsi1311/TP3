/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX8 TP3
public class Mavenproject2 {

    public static void main(String[] args) {
                
        int N;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("Entrer la taille: ");
            N=in.nextInt();
        }while(N<=0);
        int[] tableau=new int[N];
                //remplissage 
                System.out.println("\nRemplissage\n");
                 for(int i=0;i<tableau.length;i++){
                System.out.println("Entrer l'element : "+(i+1));
                tableau[i]=in.nextInt();
            }
        int max=tableau[0],min=tableau[0];
        for(int i=0;i<tableau.length;i++){
            if(min>tableau[i])
                min=tableau[i];
            if(tableau[i]>max)
                max=tableau[i];
        }
        System.out.println("L'ecart est : "+(max-min)); 
                            
                    }
        }       

