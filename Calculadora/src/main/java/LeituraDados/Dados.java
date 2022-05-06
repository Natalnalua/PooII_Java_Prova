package LeituraDados;

import java.util.Scanner;

/**
 *
 * @author Willian Moreira
 */
public class Dados {
    
    Scanner operadores = new Scanner(System.in);
    
    double primeiroOperador;
    double segundoOperador;
    
    public void setPrimeiroOperador() {
        
         System.out.println("Digite o primeiro operador: ");
         primeiroOperador = operadores.nextDouble();
                
    }
    
    public double getPrimeiroOperador() {
        
        return primeiroOperador;
        
    }
    
    public void setSegundoOperador() {
        
         System.out.println("Digite o segundo operador: ");
         segundoOperador = operadores.nextDouble();
                
    }
    
    public double getSegundoOperador() {
        
        return segundoOperador;
    }
    
}
