/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX5 TP3
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
        //rangement
            int temp;
            for(int i=0;i<T.length;i++){
                for(int j=0;j<T.length-i-1;j++){
                    temp=T[j];
                    T[j]=T[j+1];
                    T[j+1]=temp;
            
                }
            }
            System.out.println("La liste inverse");
            for(int i=0;i<T.length;i++){
                   System.out.println("l'elem1ent "+(i+1)+" : "+T[i]); 
            }
        }       
}
