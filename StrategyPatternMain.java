package iit.du.ac.bd;

public class StrategyPatternMain {
	public static void main(String[] args) {
	      Context context = new Context(new GunFight());		
	      context.executeStrategy();

	      context = new Context(new StickFight());		
	      context.executeStrategy();

	      context = new Context(new SwordFight());		
	      context.executeStrategy();
	   }

}
