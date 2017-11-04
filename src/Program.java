import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Person person = new Person();
		String prompt = "";
		
		do
		{
			System.out.println("Please make a selection: ");
			System.out.println("......................................");
			System.out.println("1. Enter your age");
			System.out.println("2. Exit");
			System.out.println("......................................");
			
			Scanner input = new Scanner(System.in);
			prompt = input.nextLine();
			switch(prompt) {
			
			case "1": 
				setAge(person);
				break;
			case "2":
				break;
			}
			
		}
		while (!prompt.equals("2"));
		
	}

	private static void setAge(Person person) {
		while(!person.getIsValid())		
		{
			
				Scanner input = new Scanner(System.in);
				

				System.out.println("Enter your age: ");
				person.setAge(input.nextLine());
				
				if(person.getIsValid())
				{
					System.out.println(person.toString());
				}
				else
				{
					System.out.println();
				}
		
		}
		
	}

}
