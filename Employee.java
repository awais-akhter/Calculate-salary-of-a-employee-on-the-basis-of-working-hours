
public class Employee {

	public static void main(String[] args) {

		Data emData = new Data();

		emData.getInputs();

		System.out.println("\n\n_____________ Result _____________");
		System.out.println();
		System.out.println("Employee Name: " + emData.getName());
		System.out.println("Working Grade: " + emData.getWorkingGrade());
		System.out.println("Working Hours: " + emData.getWorkingHours());
		System.out.println("");
		System.out.println();
		emData.CalSalary();
		System.out.println("Your Salary is: " + emData.getSalary());

	}

}
