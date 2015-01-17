
public class Arbre {
	private String nom;
	private Noeud racine;
	
	
	
	public Arbre(String nom, Noeud racine) {
		super();
		this.nom = nom;
		this.racine = racine;
	}

	

	public void visiter(){
		System.out.print("Visite de l'arbre : "+this.nom+" ");
		this.racine.visiter();
	}
	
	public static void main(String[] args) {
		Noeud v1 = new NoeudValeur(1);
		Noeud v2 = new NoeudValeur(2);
		Noeud p1 = new NoeudPlus(v1,v2);
		
		Arbre a = new Arbre("ta mere",p1);
		a.visiter();
	}

}
