package decorator;

public abstract class Componente {
    
    protected String nome;
    protected String tipo;
    protected int grau;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
 }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
     public int getGrau() {
        return grau;
    }
    
    public void setGrau(int grau) {
        this.grau = grau;
    }
}

