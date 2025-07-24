package assertMethods;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class TestSort{
	@Test
	public void test() {
		int expected[] = {1,2,3,4,5};
		int actual[] = {1,2,3,4,5};
		assertArrayEquals(expected, actual);
	}
}