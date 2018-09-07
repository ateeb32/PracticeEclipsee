
public class Runner {

	public static void main(String[] args) {
		
		Person james = new Person("James", 20, "Business Analyst");
		
		
		Person sarah = new Person("Sarah", 10, "Receptionist");
		
		
		System.out.println("Name: " + james.getName());
		System.out.println("Age: " + james.getAge());
		System.out.println("Job: " + james.getJobTitle());
		
		System.out.println("");
		
		System.out.println("Name: " + sarah.getName());
		System.out.println("Age: " + sarah.getAge());
		System.out.println("Job: " + sarah.getJobTitle());

	}

}
