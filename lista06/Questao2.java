/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package lista06;

import javax.swing.JOptionPane;

    public class Questao2 {
        public static void main(String Args[]) throws ExcecaoAcimaDeCemException{
        int n=0;
        int a = 0;
        do{
           try{
           String n1 = JOptionPane.showInputDialog("Informe o Valor a ser somado");
           n = n + (Integer.parseInt(n1));
           a++;
           JOptionPane.showMessageDialog(null, n);
           
           }
           catch(NumberFormatException e){
               System.err.println(e);
               JOptionPane.showMessageDialog(null, "Erro: entre com um numero");
           }
           if(n>100){
           float media = n / a ;
           JOptionPane.showMessageDialog(null,"A quantidade de numeros somados foram: "+a);
           JOptionPane.showMessageDialog(null, "A media dos Numeros Somados é: "+ media);
               throw new ExcecaoAcimaDeCemException();
           }
        } while(n<=100);
        }
    }
