/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MASTROROSA38;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class MASTROROSA38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dichiarazioni
        String []mesi={"GEN","FEB","MAR","APR","MAG","GIU","LUG","AGO","SET","OTT","NOV","DIC"};
        String []city={"BARI","BAT","BRINDISI","FOGGIA","LECCE","TARANTO"};
        int M[][]=null;
        int tempMax=0;
        M=generaMatrice();
        stampaMatrice(M);
        tempMax=temperaturaMax(M);
        int scelta=0;
        Scanner input = new Scanner (System.in);
         
     }
 public static int [][] generaMatrice(){
        int i=0;
        int j=0;
        Random rand=new Random();
        int M[][]=new int[6][12];
        for(i=0;i<6;i++){
            for(j=0;j<12;j++){
                M[i][j]=rand.nextInt(23)+5;
                
            }
        }
        return M;
        }

 public static void stampaMatrice(int M [][]){
         for(int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                System.out.print(M[i][j]+"\t");
                }
        System.out.print("\n");}
        }
 public static int temperaturaMax(int M[][]){
         int tMax=0;
         for(int i=0;i<6;i++){
            for(int j=0;j<12;j++){ if (tMax<M[i][j])
                   
                   tMax=M[i][j];}}
            return tMax;
 }
                   
              
               
                
            
        }
     
     
         



