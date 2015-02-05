package designpatternsjava.behavioral.strategy;

public class FuzzyControlStrategy implements INegativeFeedbackControlStrategy
{
	public float calculateAcceleration(float currentSpeed)
	{
		System.out.println("Using the Fuzzy Control Strategy");
		
		// ... complicated calculations occur here ...
		
		return 0.0f;
	}
}
