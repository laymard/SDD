
public class NoeudMoins extends NoeudBinaire {
	
	
	
	public NoeudMoins(Noeud fg, Noeud fd) {
		super(fg,fd);
	}

	public void visiter(){
		System.out.print("-");
		this.filsG.visiter();
		this.filsD.visiter();
		
	}

}
