/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class Questao3{
    public static void main(String args[]){
       
       int[] a = new int[10]; 
       try{
            String nume = JOptionPane.showInputDialog("Informe o valor que você quer inserir no array");
            int num = Integer.parseInt(nume);
                try{
                        String pa = JOptionPane.showInputDialog("Informe a possição na qual você quer inserir o valor no array de 0 a 9");
                        int p = Integer.parseInt(pa);
                        a[p] = num;
       }
                catch(ArrayIndexOutOfBoundsException e){
                        System.err.println(e);
                        JOptionPane.showMessageDialog(null, "Possição Incoerente!");
       }
       }
       catch(NumberFormatException e){
           System.err.println(e);
           JOptionPane.showMessageDialog(null, "Por favor, informe um valor numerico");
       }
       
    
    }
}