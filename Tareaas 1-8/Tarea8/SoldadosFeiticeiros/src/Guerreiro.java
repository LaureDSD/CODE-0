
public abstract class Guerreiro {
	private String nome;
	private int saude;
	private int posicionX;
	private int posicionY;
	//cosas mias --------------------------------------------
	private String color;
	private String exercito;
	//cosas mias ---------------------------------------------


	abstract public void atacar(Guerreiro inimigo);

	public Guerreiro(String nome, int saude, int posicionx,int posiciony) {
		this.nome = nome;
		this.saude = saude;
		this.posicionX = posicionx;
		this.posicionY = posiciony;

//cosas mias --------------------------------------------
		this.color = "\u001B[0m";
		this.exercito = "N/A";
//cosas mias --------------------------------------------

	}


	//cosas mias --------------------------------------------
	public String getExercito() {
		return exercito;
	}

	public void setExercito(String exercito) {
		this.exercito = exercito;
	}
	//cosas mias --------------------------------------------



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	//cosas mias

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSaude() {
		return saude;
	}

	public void setSaude(int saude) {
		this.saude = saude;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", saude=" + saude + ", posicion= (" + posicionX +":"+ posicionY + ")]";
	}



}
