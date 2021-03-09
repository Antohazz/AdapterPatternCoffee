
public class NewMachine {

	public static void main(String[] args) {
		
		OldCoffeeMachine myCoffeeM = new OldCoffeeMachine();
		
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(myCoffeeM);
		
		myCoffeeM.selectA();
		myCoffeeM.selectB();
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
		
	}
	
	
}
