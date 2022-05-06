package LeituraDados;

import java.util.Scanner;

/**
 *
 * @author Willian Moreira
 */
public class Teste {
    public static void main(String[] args) {
        
        Divisao divisao = new Divisao();
        Soma soma = new Soma();
        Sub sub = new Sub();
        Mult mult = new Mult();
        Dados dados = new Dados();
        
        
        Scanner operadores = new Scanner (System.in);
        
        int operacoes;
        String finalizar;
        
        dados.setPrimeiroOperador();
        dados.setSegundoOperador();
        
        System.out.println("\n1 - Para Soma\n2 - Para Subtração\n3 - Para Divisão\n4 - Para Multiplicação");
        operacoes = operadores.nextInt();
        
        if(operacoes == 1) {
            
            System.out.println("Digite '=', para confirmar sua operação.");
            finalizar = operadores.next();
            if(finalizar.equals("=")) {
                System.out.println(soma.operacao(dados.getPrimeiroOperador(), dados.getSegundoOperador()));
            }
            else {
                System.out.println("Operação inválida!");
            }
        
        }if(operacoes == 2) {
            
            System.out.println("Digite '=', para confirmar sua operação.");
            finalizar = operadores.next();
            if(finalizar.equals("=")) {
                System.out.println(sub.operacao(dados.getPrimeiroOperador(), dados.getSegundoOperador()));
            }
            else {
                System.out.println("Operação inválida!");
            }
            
        }if(operacoes == 3) {
            
            System.out.println("Digite '=', para confirmar sua operação.");
            finalizar = operadores.next();
            if(finalizar.equals("=")) {
                System.out.println(divisao.operacao(dados.getPrimeiroOperador(), dados.getSegundoOperador()));
            }
            else {
                System.out.println("Operação inválida!");
            }
            
        }if(operacoes == 4) {
            
            System.out.println("Digite '=', para confirmar sua operação.");
            finalizar = operadores.next();
            if(finalizar.equals("=")) {
                System.out.println(mult.operacao(dados.getPrimeiroOperador(), dados.getSegundoOperador()));
            }
            else {
                System.out.println("Operação inválida!");
            }
            
        } 
    
    }
    
}
