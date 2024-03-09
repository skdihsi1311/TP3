/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX7 TP3
public class Mavenproject2 {

    public static void main(String[] args) {
                
        int N;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("Entrer la taille: ");
            N=in.nextInt();
        }while(N<=0 );
        int[] tableau=new int[N];
                //remplissage 
                System.out.println("\nRemplissage\n");
                 for(int i=0;i<tableau.length;i++){
                System.out.println("Entrer l'element : "+(i+1));
                tableau[i]=in.nextInt();
            }
        //la somme
        System.out.println("\nLa somme\n");
        int somme=0;
        for(int i=0;i<tableau.length;i++){
            somme+=tableau[i];
        }
        System.out.println("La somme : "+somme);
        //la moyenne
        System.out.println("\nmoyenne\n");
        int moyenne=somme/N;
        System.out.println("La moyenne : "+moyenne);
        //copiage:
        System.out.println("\ncopiage\n");
        int[] T2=new int[N];
         for(int i=0;i<tableau.length;i++){
            T2[i]=tableau[i];
         }
        for(int i=0;i<tableau.length;i++){
            System.out.println("l'element "+(i+1)+" : "+T2[i]);
        }
        //classification dans un ordre croissant
        int temp;
        System.out.println("\nclassification\n");
        for(int i=0;i<tableau.length;i++){
            for(int j=0;j<tableau.length-i-1;j++){
                    if(tableau[j]>tableau[j+1]){
                        temp=tableau[j];
                        tableau[j]=tableau[j+1];
                        tableau[j+1]=temp;
                    }
            }
        }
         for(int i=0;i<tableau.length;i++){
                   System.out.println("l'element "+(i+1)+" : "+tableau[i]); 
                            
                    }
        }       
}
