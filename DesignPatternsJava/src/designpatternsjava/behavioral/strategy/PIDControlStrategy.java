package designpatternsjava.behavioral.strategy;

public class PIDControlStrategy implements INegativeFeedbackControlStrategy
{
	public float calculateAcceleration(float currentSpeed)
	{
		System.out.println("Using the PID Control Strategy");
		
		// ... complicated calculations occur here ...
		
		return 0.0f;
	}
}
