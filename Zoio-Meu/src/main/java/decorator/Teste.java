package decorator;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        
        Scanner inputb = new Scanner(System.in);
        int tipo;
        
        System.out.println("1: Para Visão Simples\n2: Para Visão multifocal\nInforme o tipo de lente desejado:");      
        tipo=inputb.nextInt();
        
        
        Scanner inputd = new Scanner(System.in);
        int trat;
        
        System.out.println("Você deseja que seu óculos tenha tratamento extra?\n1: Para Transition\n2: Para Antirreflexo\n3: Para os dois tipos\n4: Nenhum");      
        trat=inputd.nextInt();
        
        Scanner inputc = new Scanner(System.in);
        int grau;
        
        System.out.println("Você deseja que seu óculos tenha grau?\n1: Para Sim\n2: Para Não");      
        grau=inputc.nextInt();
        
        if(tipo == 1) {
            
            Componente o = new VisaoSimples();
            
            if(trat == 1) {
                o = new Transition(o);
            }if (trat == 2) {
                o = new Antirreflexo(o);
            }if (trat == 3){
                o = new Transition(o);
                o = new Antirreflexo(o);
            }else {
               
            }
            
            if(grau == 1) {
            
                Scanner input = new Scanner(System.in);
                String valorgrau;
        
                System.out.println("Informe o grau: ");
                valorgrau=input.next();
        
                System.out.println("Grau:" + valorgrau);
        
        }
            
            System.out.println(o.getNome());
            System.out.println(o.getTipo());
            
        }else {
            Componente o = new VisaoMult();
            
            if(trat == 1) {
                o = new Transition(o);
            }if (trat == 2) {
                o = new Antirreflexo(o);
            }if (trat == 3){
                o = new Transition(o);
                o = new Antirreflexo(o);
            }else {
               
            }
            
            if(grau == 1) {
            
                Scanner input = new Scanner(System.in);
                String valorgrau;
        
                System.out.println("Informe o grau: ");
                valorgrau=input.next();
        
                System.out.println("Grau:" + valorgrau);
        
        }
            
            System.out.println(o.getNome());
            System.out.println(o.getTipo());
        
        }
       
    }
    
}