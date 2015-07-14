package ultimateWarrior;

public class ultimateMain {

	public static void main(String[] args) {
			
		
		//set up a match
		WarriorType wt = new WarriorType("ISIS"); //samurai, indian, conquistador, we load up the warrior with types of weapons
		Warrior warrior1 = new Warrior(wt); // of type ISIS
		
		WarriorType wtus = new WarriorType("US Marine");
		Warrior warrior2 = new Warrior(wtus);
		
		Match m = new Match(warrior1, warrior2);
		
		//m.setScenario(warrior2.onAttackWithTactic("groundAssault"), warrior1.onDefenseWithTactic("IED"));
		
		m.setSides(warrior1(13000), warrior2(1500));
		
		//m.play();//assume that when one team takes a position, the other responds accordingly
		
		for(int i = 0; i < 50000; i++)
		{
			m.play();//assume that when one team takes a position, the other responds accordingly
			
		}

	}

}
