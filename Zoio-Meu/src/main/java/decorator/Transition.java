package decorator;

public class Transition extends Decorador{

	public Transition(Componente componente) {
		super(componente);
		this.nome = "Transition";
		this.tipo = "Escurecer a lente ao entrar em contato com os raios do sol";
	}
}

