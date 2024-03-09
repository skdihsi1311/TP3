/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX6 TP3
public class Mavenproject2 {

    public static void main(String[] args) {
                
        int N;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("Entrer la taille: ");
            N=in.nextInt();
        }while(N<=0 );
        int[] T=new int[N]; 
        //remplissage 
            for(int i=0;i<T.length;i++){
                System.out.println("Entrer l'element : "+(i+1));
                T[i]=in.nextInt();
            }
        //affichage    
            for(int i=0;i<T.length;i++){
                   System.out.println("l'elem1ent "+(i+1)+" : "+T[i]); 
            }    
        // les valeurs positifs
            //la taille de la liste positive
            System.out.println("\nLa liste positive\n");
            int taillepos=0;
            for(int i=0;i<T.length;i++){
                    if(T[i]>0)
                        taillepos++;
            }
            int[] pos=new int[taillepos];
            for(int i=0,j=0;i<T.length;i++){
                    if(T[i]>0){
                        pos[j]=T[i];
                        j++;
                    }
            }
            for(int i=0;i<pos.length;i++){
                   System.out.println("l'elem1ent "+(i+1)+" : "+pos[i]); 
            }  
            
            //les valeurs negatifs
                //la taille de la liste negative
                System.out.println("\nLa liste negative\n");
            int tailleneg=0;
            for(int i=0;i<T.length;i++){
                    if(T[i]<0)
                        tailleneg++;
            }
            int[] neg=new int[tailleneg];
            for(int i=0,j=0;i<T.length;i++){
                    if(T[i]<0){
                        neg[j]=T[i];
                        j++;
                    }
            }
            for(int i=0;i<neg.length;i++){
                   System.out.println("l'element "+(i+1)+" : "+neg[i]); 
            }
        }       
}
