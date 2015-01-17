
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
		Noeud v3 = new NoeudValeur(3);
		Noeud v4 = new NoeudValeur(4);
		Noeud v5 = new NoeudValeur(5);
		Noeud v6 = new NoeudValeur(6);
		Noeud v7 = new NoeudValeur(7);
		
		Noeud m1 = new NoeudMoins(v1,v2);
		Noeud m2 = new NoeudMoins(v3,v4);
		Noeud p4 = new NoeudPlus(m1,m2);
		
		
		
		
		Arbre a = new Arbre("ta mere",p4);
		a.visiter();
	}

}
