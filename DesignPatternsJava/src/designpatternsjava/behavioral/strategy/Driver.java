package designpatternsjava.behavioral.strategy;

/**
 * Example Context:
 * 
 * A simulated car-like mobile robot with four wheels 
 *  such as the one shown here:
 *  
 *  http://en.wikipedia.org/wiki/ActivMedia_Robotics#mediaviewer/File:Pioneer_3-AT_in_Gazebo.png
 *
 * 	has a cruise control mechanism so that it can maintain
 * 	a certain speed at all times in spite of fluctuations
 * 	in the grade of the ground on which it is traversing.
 * 
 * A researcher would like to compare and contrast various forms of
 * 	negative feedback control including Fuzzy Control
 * 	and Proportional-Integral-Derivative (PID) Control.
 *
 * To facilitate this, each type of control 
 * 	algorithm has been encapsulated into Strategies.
 * 
 * This way, the algorithms can be easily changed.
 * 
 * Note: Details about Fuzzy Control and PID Control
 * 	are beyond the scope of this example.
 */
public class Driver 
{
	public static void main(String args[])
	{
		Driver driver = new Driver();
		driver.doMainLoop();
	}
	
	public void doMainLoop()
	{
		// For this example, Fuzzy Control has been selected.
		//	However, any of the other strategies can be used.
		INegativeFeedbackControlStrategy strategy = 
			new FuzzyControlStrategy();

		float output = 0.0f;
		
		// The feedback loop never stops.
		while (true)
		{
			// ... Get the current state of the robot with something like this ... 
			float currentSpeed = getCurrentSpeed();
			
			// ... Calculate the new acceleration with something like this ... 
			output = strategy.calculateAcceleration(currentSpeed);
			
			// ... Change the acceleration of the robot ... 
			// ... omitted ...
		}		
	}
	
	private float getCurrentSpeed()
	{
		return 10.0f; // Sample value.
	}
}
