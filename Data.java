
import java.util.Scanner;

public class Data {
	private String Name;
	private int Salary;
	private int WorkingHours;
	private int WorkingGrade;

	Scanner input = new Scanner(System.in);

	public String getName() {
		return Name;
	}

	private void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	private void setSalary(int salary) {
		Salary = salary;
	}

	public int getWorkingHours() {
		return WorkingHours;
	}

	private void setWorkingHours(int workingHours) {
		WorkingHours = workingHours;
	}

	public int getWorkingGrade() {
		return WorkingGrade;
	}

	public void setWorkingGrade(int workingGrade) {
		WorkingGrade = workingGrade;
	}

	public void getInputs() {
		System.out.println("Enter Your Name: ");
		String eName = input.nextLine();
		setName(eName);

		System.out.println("Enter your working grade: ");
		int eWorkingGrade = input.nextInt();
		setWorkingGrade(eWorkingGrade);

		System.out.println("Enter your working hours: ");
		int eWorkingHours = input.nextInt();
		setWorkingHours(eWorkingHours);

	}

	public void CalSalary() {
		if (WorkingHours > 50) {
			setSalary(60000);

		} else if (WorkingHours > 40) {
			setSalary(50000);

		} else if (WorkingHours > 30) {
			setSalary(35000);

		} else if (WorkingHours < 30) {
			setSalary(20000);

		}

	}

}
