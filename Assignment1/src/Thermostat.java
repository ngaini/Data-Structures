
public class Thermostat 
{
	private Temperature currentTemperature;
	private int LOWER_LIMIT = 30;
	private int UPPER_LIMIT = 120;
	
	//default constructor
	Thermostat() 
	{
	//setting current temperature to default value 32
		currentTemperature = new Temperature(32);
	}
	

	//parameterised constructor taking degree as input
	Thermostat(int degree)
	{
		currentTemperature = new Temperature();

		//checking is the degree value lies in the boundary defined in the problem
		//if degree is within the boundary limit, set current temperature to the parameter value
		if((degree<=UPPER_LIMIT)&&(degree>=LOWER_LIMIT))
		{
			this.currentTemperature = new Temperature(degree);

		}
		// if the boundary limit is exceeded set it to default value
		else
		{
			System.out.println("Since"+ degree +" value was out of bounds the temperature remains unchanged");

			this.currentTemperature = new Temperature();
			
			
		}
		
	}
	
	//set the temperature value for currentTemperature
	void setTemperatureF(int degreesF)
	{
		currentTemperature.setDegrees(degreesF);
		 
	}
	
	//converts the temperature from celcius to fahrenheit and sets the current temperature to the fahrenheit value that is obtained after conversion from celcius to fahrenheit
	void setTemperatureC(int degreesC)
	{
		int degreesFahrenheit =  ((degreesC * 9)/5) + 32;
		currentTemperature.setDegrees(degreesFahrenheit);
	}
	
	//displaying the temperature in Fahrenheit 
	void displayFahrenheit()
	{
		System.out.println("\nDisplaying temperature in Fahrenheit\n\tValue of degrees : "+currentTemperature.getDegrees()+" fahrenheit");
	}
	
//	convert degrees from fahrenheit to celcius
	 float fahrenheitToCelcius(int degreesF)
	 {

		 int degreesC= ((5* (degreesF -32))/9);
		 return degreesC; 
	 }
	
	//displaying the value of temperature in celcius, by converting the temperature from fahrenheit to celcius
	void displayCelsius()
	{
				System.out.println("\nDisplaying temperature in celcuis\n\tValue of degrees : "+this.fahrenheitToCelcius(currentTemperature.getDegrees())+" Celcius.");
	}
	
	//decrement the value of temperature by the parameter value
	void reduceF(int degrees)
	{
		currentTemperature.setDegrees(currentTemperature.getDegrees()-degrees);
	}
	
	//decrement the value of temperature (in celcius) by the parameter value
	void reduceC(int degreesC)
	{
		int degreesF= ((degreesC * 9)/5)+32;
		int reducedF=currentTemperature.getDegrees()-degreesF;
		currentTemperature.setDegrees(reducedF);
	}
	
	//increment the value of temperature by the parameter value 
	void increaseF(int degrees)
	{
		currentTemperature.setDegrees(currentTemperature.getDegrees()+degrees);
	}
	
	//increment the value of temperature (in celcius) by the parameter value
	void increaseC(int degreesC)
	{
		int degreesF= ((degreesC * 9)/5)+32;
		int increasedF= currentTemperature.getDegrees()+degreesF;
		currentTemperature.setDegrees(increasedF);
	}
}
 