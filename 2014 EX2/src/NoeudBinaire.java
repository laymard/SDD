
public abstract class NoeudBinaire extends Noeud{
	protected Noeud filsG;
	protected Noeud filsD;
	
	
	
	public NoeudBinaire(Noeud filsG, Noeud filsD) {
		super();
		this.filsG = filsG;
		this.filsD = filsD;
	}



	public void visiter(){
		this.filsD.visiter();
		this.filsG.visiter();
		
	}

}
