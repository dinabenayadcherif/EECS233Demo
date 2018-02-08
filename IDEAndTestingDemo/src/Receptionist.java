import java.util.ArrayList;

public class Receptionist extends Employee {

	ArrayList<Integer> phonebook = new ArrayList<Integer>();
	
	public Receptionist(String name, int age, int salary) {
		super(name, age, salary);
	}
	
	public void addNumberToPhonebook(int number) {
		for(int i = 0; i<phonebook.size(); i++) {
			if(phonebook.get(number) != number)
				phonebook.add(number);
		}
	}
}
