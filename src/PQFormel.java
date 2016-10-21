
public class PQFormel {

	public static void main(String[] args) {
		//Var
		double p, q;
		
		//Werte zuweisen
		p = 8;
		q = 15;
		
		//Berechnung Term unter der Wurzel
		double unterDerWurzel = ((p/2)*(p/2))-q;
		
		//Berechnung Term vor der Wurzel
		double vorDerWurzel = -1 * p / 2;
		
		//Berechnung der Lösung
		double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
		double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);
		
		//Ausgabe der Lösung
		System.out.println("x1 = " + loesung1);
		System.out.println("x2 = " + loesung2);	
		
		
	}

}
