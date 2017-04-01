package paquete;

public class Comparacion {

	public static void main(String[] args) {
		
		/*
		 * Metodo compareTo()
		 * int compareTo(String cad2)--------------------------------------
		 */
		
		String c1 = "Universo Java";
		String c2 = "Universo Visual J";
		int i;
		i = c1.compareTo(c2);
		/*
		 * i toma un valor negativo, ya que el caracter 'J' de c1 es anterior
		 * al caracter 'V' de c2 y los anteriores son iguales
		 */
		"Windows".compareTo("Waterloo"); //Devuelve un valor positivo porque su segundo caracter
		// 'i' es mayor que 'a' (su codigo numerico)
		"Martin".compareTo("Martinez"); //Devuelve un valor negativo
		// coinciden pero su longitud es menor
		String ju = "Jertru";
		ju.compareTo("Jertru"); //Devuelve 0, son iguales
		String jt = "Nadia";
		jt.compareTo("nadia"); //Devuelve un valor negativo, el caracter 'N' es anterior a 'n'
		
		/*
		 * ----------------------------------------
		 * Metodos equals() y equalsIgnoreCase() devuelven true o false
		 */
		String nom = new String("Julian");
		if(nom.equals("julian")){
			System.out.println("Cadenas iguales");
		} else {
			System.out.println("Cadenas distintas");
		}
		//Imprime cadenas distintas porque compara mayusculas y minusculas
		
		String er = new String("Esperanza");
		nom.equalsIgnoreCase("esperanzA"); // true
		
		/*
		 * ------------------------------------------------
		 * Metodo regionMatches()
		 * boolean regionMatches(boolean tip, int p1, String c2, int p2, int nc)
		 */
		String dato = "Region recreativa de las jaras";
		dato.regionMatches(false, 7, "Recreo", 0, 3); //devuelve true, compara Recreo las primeras 3
		// con true compara distinguiendo de mayusculas y minusculas
	}

}
