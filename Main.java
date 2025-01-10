class Engine {
void start()
{
	System.out.println("Engine is starting");
}
}
class Car
{
	private Engine engine;
	public Car()
	{
		engine=new Engine();
	}
	void startCar()
	{
		engine.start();
		System.out.println("car is moving");
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Car Car=new Car();
		Car.startCar();
	}
}
