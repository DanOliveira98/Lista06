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
public class ExcecaoAcimaDeCemException extends Exception{
    private int valor;
    public ExcecaoAcimaDeCemException(){
        
    }
    public ExcecaoAcimaDeCemException(int v){
        
        this.valor = v;
    }


    @Override
    public String toString() {
        JOptionPane.showMessageDialog(null, "Soma acima de 100");
        return "";
    }
    
}
