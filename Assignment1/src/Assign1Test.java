/*
 * @author Nathan Gaini
 */
public class Assign1Test {

	public static void main(String[] args) 
	{
        // Testing the Temperature class
		Temperature t1 = new Temperature();
		System.out.println(t1.getDegrees());
		t1.setDegrees(90);
		System.out.println(t1.getDegrees());
		
		Temperature t2 = new Temperature(72);
		System.out.println(t2.getDegrees());
		
		//Testing Thermostat Class

		
		Thermostat th2 = new Thermostat(130);
		th2.setTemperatureF(67);
		th2.displayFahrenheit();
		th2.displayCelsius();

		Thermostat th3 = new Thermostat(20);
		th3.increaseF(60);
		th3.displayFahrenheit();
		th3.displayCelsius();
		th3.increaseC(5);
		th3.displayFahrenheit();
		th3.displayCelsius();


	}

}
