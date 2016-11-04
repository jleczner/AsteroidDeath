package leczner.jon.AsteroidsAreDopeServer;

import leczner.jon.AsteroidsAreDopeServer.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTests {

	@Test
	public void appTest() {
		HomeController hc = new HomeController();
		assertEquals("Welcome", hc.home());
	}

}
