/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeituraDados;

/**
 *
 * @author Willian Moreira
 */
public class Mult implements Operacao{

    @Override
    public double operacao(double ope1, double ope2) {
        System.out.println("Primeiro valor:"+ope1);
        System.out.println("Segundo valor:"+ope2);
        return ope1*ope2;
    
    }
    
}
