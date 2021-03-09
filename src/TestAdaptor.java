import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAdaptor {

	@Test
	void test() {
		
		OldCoffeeMachine myCoffeeM = new OldCoffeeMachine();
		
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(myCoffeeM);
		
		assertEquals(adapter.chooseFirstSelection(), true);
		assertEquals(adapter.chooseFirstSelection(), true);
		
	}

}
