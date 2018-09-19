
package lista06;
 import javax.swing.JOptionPane;
public class Lista06{
    public static void main(String[] args) {
    try{    
        int[] x = new int[10];
        for(int i=0; i < x.length; i++){
            x[i]=i;
        }//laçoparapreencheroarray
        for(int i=0; i<=x.length; i++){
            System.out.println(x[i]);
        }//laço para mostrar o array
    }
    catch(ArrayIndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(null, "Tamanho do array Incoerente!");
    }
    }
    }
   
