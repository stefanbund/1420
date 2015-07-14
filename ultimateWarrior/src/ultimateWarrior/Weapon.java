package ultimateWarrior;

public class Weapon {
	
	public String weaponName;
	private int lethality; //how dangerous is this item, tactically?
	
	public Weapon(String w)
	{
		this.weaponName = w; //takes the name of the input weapon, then runs it through our specifier
		this.lethality = determineMortalFeasibility(w);
		
	}

	private int determineMortalFeasibility(String w) 
	{
		int lethality = 0;
		
		if(w.equalsIgnoreCase("rifle"))
		{
			lethality = 8;
		}
		return lethality;
	}

}
