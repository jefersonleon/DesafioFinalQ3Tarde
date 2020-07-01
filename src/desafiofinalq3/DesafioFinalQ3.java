/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiofinalq3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class DesafioFinalQ3 {

    /**
     * Elaborar um algoritmo que, dada a idade de um nadador, classifique-o em
     * uma das seguintes categorias: (usar o switch case nesta atividade)
     * infantil A = 5 - 7 anos infantil B = 8-10 anos juvenil A = 11-13 anos
     * juvenil B = 14-17 anos adulto = maiores de 18 anos
     */
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do nadador:"));
        
        if(idade<5){
             JOptionPane.showMessageDialog(null,"Não pertence a nenhuma Categoria" );
        }else if(idade>=5 && idade<=7){
            JOptionPane.showMessageDialog(null, "Categoria: Infantil A");
        }else if(idade>=8 && idade<=10){
            JOptionPane.showMessageDialog(null, "Categoria: Infantil B");
        }else if(idade>=11 && idade<=13){
            JOptionPane.showMessageDialog(null, "Categoria: Juvenil A");
        }else if(idade>=14 && idade<=17){
            JOptionPane.showMessageDialog(null, "Categoria: Juvenil B");
        }else{
             JOptionPane.showMessageDialog(null,"Categoria: Adulto");
        }
/*
        switch (idade) {
            case 5:
            case 6:
            case 7:
                JOptionPane.showMessageDialog(null, "Categoria: Infantil A");
                break;
            case 8:
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "Categoria: Infantil B");
                break;
            case 11:
            case 12:
            case 13:
                JOptionPane.showMessageDialog(null, "Categoria: Juvenil A");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                JOptionPane.showMessageDialog(null, "Categoria: Juvenil B");
                break;
            
            default:
                if(idade<18){
                   JOptionPane.showMessageDialog(null,"Não pertence a nenhuma Categoria" );
                }else{
                    JOptionPane.showMessageDialog(null,"Categoria: Adulto");
                }
                
        }//fim do switch
*/
    }

}
