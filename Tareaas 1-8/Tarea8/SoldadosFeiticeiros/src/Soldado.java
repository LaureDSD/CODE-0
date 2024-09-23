
public class Soldado extends Guerreiro {

	private static final String RESET = "\u001B[0m", VERDE = "\u001B[32m" , AMARILLO = "\u001B[33m" , GRIS = "\u001B[37m";
	private Arma arma;

	public Soldado(String nome, int saude, int posicionX, int posicionY, Arma arma) {
		//Completar
		super(nome,saude,posicionX,posicionY);
		this.arma=arma;
	}

	public Arma getArma() {
		return arma;
	}


	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public void atacar(Guerreiro inimigo) {
		//Completar
		if (inimigo.getPosicionX() == this.getPosicionX()   &&  inimigo.getPosicionY() == this.getPosicionY()) {
			if (inimigo.getSaude() > 0) {
				System.out.println(VERDE+"[Acierto] "+RESET
						+this.getColor()+ this.getNome()+ " ["+this.getExercito()+"]"+ " [ATK:"+this.arma.getDano()+"]"
						+ " >> "
						+inimigo.getColor()+ "[HP:"+inimigo.getSaude()+"] " + inimigo.getNome()+ " ["+inimigo.getExercito()+"]"+RESET );
				inimigo.setSaude(inimigo.getSaude() - this.arma.getDano());
			} else {
				System.out.println(AMARILLO+"[Remate] "+RESET
						+this.getColor()+ this.getNome()+ " ["+this.getExercito()+"]"+ " [ATK:"+this.arma.getDano()+"]"
						+ " >> "
						+inimigo.getColor()+ "[HP:"+inimigo.getSaude()+"] " + inimigo.getNome()+ " ["+inimigo.getExercito()+"]"+RESET );
			}
		}else{
			System.out.println(GRIS+"[???] "+RESET
					+this.getColor() + this.getNome()+ " ["+this.getExercito()+"]"+ " [ATK:"+this.arma.getDano()+"]"
					+ " >> "
					+inimigo.getColor()+ "[HP:"+inimigo.getSaude()+"] "+ inimigo.getNome()+ " ["+inimigo.getExercito()+"]" +RESET  );
		}
	}


	@Override
	public String toString() {
		return super.toString() + "[Arma: "+ this.arma+"]";
	}
}
