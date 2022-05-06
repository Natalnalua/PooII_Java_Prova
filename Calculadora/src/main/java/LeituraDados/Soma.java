package LeituraDados;

public class Soma implements Operacao{

    @Override
    public double operacao(double ope1, double ope2) {
        System.out.println("Primeiro valor:"+ope1);
        System.out.println("Segundo valor:"+ope2);
        return ope1 + ope2;
    
    }
    
}
