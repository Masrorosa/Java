/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mastrorosa_matrix;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Mastrorosa_Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int scelta=0;
         Scanner input= new Scanner (System.in);
                 int y=0;
                int x=0;
                          int [][] mastro=null;
                          boolean gen=false;
                          int max=0;
                          int min=0;
         do{
             System.out.println("opzioni scelta\n1.Genera e stampa matrice\n2.MaxMin\n3.SommaRiga\n4.Confronta\n5.Esci");
             System.out.println("Inserisci scelta:");
             scelta=input.nextInt();
             
             switch (scelta){
                 case 1:
                    do{
                     System.out.println("inserisci righe della matrice maggiore di 1");
                     x=input.nextInt();
                     System.out.println("inserisci colonne della matrice maggiore di 1");
                     y=input.nextInt();
                    }while((x<=1)||(y<=1));
                     mastro=Genera(x,y);
                     gen=true;
                    break;
                 case 2:
                     if(gen=true){
                         maxmin(mastro);
                     }
                     else 
                         System.out.println("devi prima generare la matrice");
                     break;
                 case 3:
                     if(gen=true){
                     sommariga(mastro);}
                     else 
                         System.out.println("devi prima generare la matrice");
                     break;
                case 4:
                    if(gen=true){}
                     else 
                         System.out.println("devi prima generare la matrice");
                     break;
                case 5:
                    if(gen=true){}
                     else 
                         
                     break;
                            } 
         }while(scelta!=5);
    
    
    
    
    
   
         
       }
  

 public static int [][]Genera(int x,int y){
     Scanner input= new Scanner (System.in);
     Random rand=new Random();
 int [][] star= new int[x][y];
 for(int i=0;i<x;i++){
 for(int j=0;j<x;j++){
      star[i][j]=rand.nextInt(51);
      }
  }
 for(int i=0;i<x;i++){
 for(int j=0;j<x;j++){
     System.out.println(star[i][j]);
 }}
 return star;
 }
 public static void maxmin( int [][]mastro){
     int rigmax=0;
     int colmax=0;
     int colmin=0;
     int rigmin=0;
     int max=mastro[0][0];
     int min=mastro[0][0];
     for(int i=0;i<mastro.length;i++){
     for(int j=0;j<mastro[i].length;j++){
         if(mastro[i][j]>max){
             max=mastro[i][j];
             rigmax=i; colmax=j;
        }
         if(mastro[i][j]<min){
             min=mastro[i][j];
             rigmin=i; colmin=j;
         }
     }
 }System.out.println("stampa min "+min+"alla colonna "+colmin+"alla riga "+rigmin);
 System.out.println("stampa max "+max+"alla colonna "+colmax+"alla riga "+rigmax);
 }
 public static void sommariga( int [][]mastro){
               int []sr= new int[mastro.length];
               int somma=0;
               for(int i=0;i<mastro.length;i++){
               for(int j=0;j<mastro[i].length;j++){
               somma=somma+mastro[i][j];
               sr[i]=somma;
               
               }somma=0;} 
               for(int i=0;i<sr.length;i++){
               System.out.println(sr[i]+"|");}
 }
 
public static void contaMatrici(int [][]mastro){
     Scanner input= new Scanner (System.in);
     int i=0;
     int j=0;
     String [][] matriceConfronto= new String [mastro.length] [mastro[i].length];
     Random rand=new Random();
 int [][] ringo= new int[mastro.length] [mastro[i].length];
 for(int i=0;i<mastro.length;i++){
 for(int j=0;j<mastro[i].length;j++){
      ringo[i][j]=rand.nextInt(51);
      }
 }
 }}
 return contaMatrici;
 }
}
