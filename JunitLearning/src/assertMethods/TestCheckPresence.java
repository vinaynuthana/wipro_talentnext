package assertMethods;
import org.junit.Test;
import static org.junit.Assert.*;
import assertMethods.CheckPresence;
public class TestCheckPresence {
	@Test
	public void testTrue() {
		CheckPresence ck = new CheckPresence();
		assertTrue(ck.CheckPresence("Vinay", "nay"));
	}
	@Test
	public void testFalse() {
		CheckPresence ck = new CheckPresence();
		assertFalse(ck.CheckPresence("Vinay","Kumar"));
	}
}
