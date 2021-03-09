public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCoffeeMachine machine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine machine) {
		this.machine = machine;
	}
	
	public boolean chooseFirstSelection() {
		if (machine.selectA())
		return true;
		return false;
	}
	
	public boolean chooseSecondSelection() {
		if (machine.selectB())
		return true;
		return false;
}




}