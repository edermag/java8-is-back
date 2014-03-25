package br.com.yaw;


/**
 * Exemplo da nova API de Stream com Lambda e Collections do Java.
 * 
 * 
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
public class TesteFiltrosEntregaLambda {

	public static void main(String[] args) {
		//testar runtime
		/*List<String> nomes = Arrays.asList("Claudia", "Danilo", "Fernanda", "Paula", "Andre", "Bruna");
		
		List<Person> people = peopleDAO.find("London"); 
		
		// Using anyMatch and method reference 
		List<Person> anyMatch = people.stream().filter(p -> (names.stream().anyMatch(p.name::contains))).collect(Collectors.toList()); 
		  
		// Using reduce 
		List<Person> reduced = people.stream().filter(p -> names.stream().reduce(false, (Boolean b, String keyword) -> b || p.name.contains(keyword), (l, r) -> l | r)).collect(Collectors.toList());*/
	}
	
}
