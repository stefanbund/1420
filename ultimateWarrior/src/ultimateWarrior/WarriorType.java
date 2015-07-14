package ultimateWarrior;

import java.util.ArrayList;

public class WarriorType {

//	public Weapon weaponry = new Weapon();
	public ArrayList<Weapon> weaponry = new ArrayList<Weapon>();
	public String warriorType;
	
	
	/**
	 * 
	 * 
	 * @param statedType in supplied, to request a type of warrior (many can be supplied to form a team)
	 */
	public WarriorType(String statedType) 
	{
		this.warriorType = statedType;
		loadUpThisWarrior();
	}


	private void loadUpThisWarrior() 
	{
		if(this.warriorType.equalsIgnoreCase("ISIS"))
		{
			 //he gets ISIS-specific tools and features, some of which are random
		}
		
		else if(this.warriorType.equalsIgnoreCase("US Marine"))
		{
			 //he gets marine -type features
			Weapon w1 = new Weapon("rifle");
			this.weaponry.add(w1); //assumes that we increase the lethality of the warrior in question
		}
		
	}
	
	

}
