package iit.du.ac.bd;

public class Context {
	private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public void executeStrategy(){
		   strategy.fight();
	   }

}
