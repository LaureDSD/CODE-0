
public class Feiticeiro extends Guerreiro {
	private static final String RESET = "\u001B[0m", VERDE = "\u001B[32m" , AMARILLO = "\u001B[33m";

	private int poder;
	
	public Feiticeiro(String nome, int saude, int posicionX,int posicionY, int poder) {
		//Completar
		super(nome,saude,posicionX,posicionY);
		this.poder=poder;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	@Override

	public void atacar(Guerreiro inimigo) {
		//Completar
		if(inimigo.getSaude()>0) {
			System.out.println(VERDE+"[Acierto] " +RESET +this.getColor()+ this.getNome()+ " ["+this.getExercito()+"]"+ " [ATK:"+this.getPoder()+"]"
					+ " >> "
					+inimigo.getColor()+ "[HP:"+inimigo.getSaude()+"] "+ inimigo.getNome()+ " ["+inimigo.getExercito()+"]"+RESET );
			inimigo.setSaude(inimigo.getSaude() - this.poder);
		}else{
			System.out.println(AMARILLO+"[Remate] "+RESET +this.getColor()+ this.getNome()+ " ["+this.getExercito()+"]"+ " [ATK:"+this.getPoder()+"]"
					+ " >> "
					+ inimigo.getColor()+ "[HP:"+inimigo.getSaude()+"] " + inimigo.getNome()+ " ["+inimigo.getExercito()+"]"+RESET );
		}

	}
	@Override
	public String toString() {
		//Completar
		return super.toString() + "[Arma: "+ this.poder+"]";
	}
}
