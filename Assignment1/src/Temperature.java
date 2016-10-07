
public class Temperature {
	private int degrees;
	private int LOWER_LIMIT = 30;
	private int UPPER_LIMIT = 120;
	//default constructor
	Temperature()
	{
		degrees = 32;
	}
	
	// parameterized constructor that initializes a different value to the degree data member
	Temperature(int newDegree)
	{
		degrees = newDegree;
		
	}
	//Setter method set degrees value to newDegree
	void setDegrees(int newDegree)
	{
		//If the newDegree value lies within the boundary limit specified execute this block of code
		if((newDegree<=UPPER_LIMIT)&&(newDegree>=LOWER_LIMIT))
		{
			degrees=newDegree;
		}
		// if newDegree violates the boundary limit specified by the problem
		else
		{
			System.out.println("Since "+ newDegree +" value was out of bounds the temperature remains unchanged");
		}
		
	}
	
	//getter method to get the value of degrees
	int getDegrees()
	{
		return degrees;
	} 
	

}

