package decorator;

public abstract class Decorador extends Componente {
    
    private final Componente componente;
    
    public Decorador(Componente componente) {
        this.componente = componente;
    }
    public Componente getComponente() {
        return componente;
    }
    
    @Override
    public String getTipo() {
        return this.tipo + ", " + this.componente.getTipo();
    }
    
    @Override
    public String getNome() {
        return this.componente.getNome() + ", " + this.nome;
    }
    
    @Override
    public int getGrau() {
        return this.grau + this.componente.getGrau();
       
    }
}
