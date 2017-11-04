
public class Person {
	
	//private instance variables/fields
	
	private int _age;
	private boolean _isValid = false;

	//Get accessor method
	public int getAge() {
		return this._age;
	}

	//get accessor method for isValid //its a read only property
		public boolean getIsValid() {
			return _isValid;
		}
		
	//set / mutator method
	public void setAge(String ageString) {
		
		try {
			int age = Integer.parseInt(ageString);

			if(age <= 0)
			{
				System.out.println("Please enter a positive number > 0");
			}
			else
			{
				this._age = age;
				this._isValid = true;
			}
				
			}
		catch(Exception e)
		{
			System.out.println("Please enter a valid integer value ");
			
		}
	}
	//empty constructor
	Person(){}

	//@overriding the toString method()
	public String toString()
	{
		return String.format("\nYour age: %d", this._age);
	}
	
	
}
