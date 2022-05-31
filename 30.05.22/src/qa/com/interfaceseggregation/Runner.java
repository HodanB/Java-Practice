package qa.com.interfaceseggregation;

import qa.com.interfaceseggregation.*;

public class Runner {
	public static void main(String[] args) {
	
		Dodo dd = new Dodo();
	
		Falcon ff = new Falcon();
	
	EggLayingCreature Dodo = new EggLayingCreature (dd);
	EggLayingCreature Falcon = new EggLayingCreature (ff);
	
	System.out.println(Falcon.layEggs()) ;
	
	}
	
}
