package decorator;

public class Antirreflexo extends Decorador{

	public Antirreflexo(Componente componente) {
		super(componente);
		this.nome = "Antirreflexo";
		this.tipo = "Evita que o usuário do óculos seja ofuscado por reflexos de luz";
	}
}
