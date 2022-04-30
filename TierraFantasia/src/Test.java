

import junit.framework.*;

public class Test {

	
	Tanquin pepe = new Tanquin((new Punto(2,2)));
	
//	@org.junit.Test
//	public void testAtacar() {
//		fail("Not yet implemented");
//	}

	@org.junit.Test
	public void testRecibirAtaque() {
		assertEquals(pepe.recibirAtaque(10), (double)280);
	}
}

//	@org.junit.Test
//	public void testDescansar() {
//		fail("Not yet implemented");
//	}
//
//	@org.junit.Test
//	public void testEstaEnRango() {
//		fail("Not yet implemented");
//	}
//
//	@org.junit.Test
//	public void testTanquin() {
//		fail("Not yet implemented");
//	}
//
//}
