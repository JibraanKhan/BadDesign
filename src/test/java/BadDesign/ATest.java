package BadDesign;

import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ATest
{
	A v;
	A.B h;
	A.B f;
	A.B m;

	@Before
	public void setUp() throws Exception
	{
		v = new A();
		h = v.new B("John", 5, 35);
		f = v.new B("Steve", 12, 59, "c");
		h.set("s");
		m = v.new B("Chris", 10, 50);
		m.set("h");
		m.set2(45);
		v.m(h);
		v.m(f);
		v.m(m);
	}

	@Test
	public void test()
	{
		double[] a = new double[] {200, 708, 475};
		
		assertTrue(Arrays.equals(a, v.z()));
	}

}
