/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mastrorosa0701;

import java.util.Random;
import java.util.Scanner;
 //Realizzare una battaglia navale con sottoprogrammi:
 //- Funzione per generare Matrice (necessariamente quadrata)
 //-Funzione per piazzare le navi 
 //- Funzione per colpire le navi
/**
 *
 * @author ospite
 */
public class Mastrorosa0701 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int x=0;
         Scanner input= new Scanner (System.in);
                          int [][] mastro=null;
        do{System.out.println("inserisci la misura della matrice (minimo 5)");
        x=input.nextInt();
    }
    while (x<=5);
    char [][] schema= new char [x][x];
    genera(x);
    }
     public static void genera(int x) {
     Scanner input= new Scanner (System.in);
     Random rand= new Random();
     char [][] schema= new char [x][x];
     for(int i=0;i<x; i++){
         for(int j=0;j<x; j++){
        schema [i][j]0"-"; 
         }}
     do{for( int i=0;i<x;i++) {
         for (int j=0;j++){
             schema [i][j]="-";
         }
     }
      do{for(int j=0;j=4;j)
     
     
     }
     
}
