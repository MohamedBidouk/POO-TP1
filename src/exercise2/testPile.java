package exercise2;

public class testPile {
	public static void main(String[]args){
		PileListe p = new PileListe();
		for(int i = 0 ; i < 10 ; i++)
		p.empiler(new Integer(i));
		while(!p.estVide()){
		System.out.println((Integer) p.dernier());
		p.depiler();
		}

	}

}
