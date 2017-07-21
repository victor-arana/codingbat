package mx.victor.arana.codingbat;

public class StringTwo {

	public static boolean endOther(String a, String b) {
		// 1. Convierte los argumentos a minúsculas.
		a = a.toLowerCase();
		b = b.toLowerCase();
		// 2. Asignar a a la cadena de mayor longitud.
		if(a.length() < b.length()){
			String c = a;
			a = b;
			b = c;
		}
		// 3. Buscar el subíndice dentro de a en donde empieza b
		int indice = a.indexOf(b);
		// 4. Obtener una subcadena del principio de a en b hasta el final de a.
		String subCadena = indice >= 0 ? a.substring(indice):"";
		// 5. Verifica que la subcadena obtenida y b sean iguales.
		boolean endOther = subCadena.equals(b);
		return endOther;
	}
	
}
