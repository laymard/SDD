
public class NoeudValeur extends Noeud {
	private int val;
	
	
	
	public NoeudValeur(int val) {
		super();
		this.val = val;
	}



	public void visiter(){
		System.out.print(this.val);
	}

}
