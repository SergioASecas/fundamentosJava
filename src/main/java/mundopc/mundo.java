package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class mundo {
	
	public static void main(String []args) {
		
		Monitor monitorSmasung = new Monitor("Samsung", 17.5);
		Raton   ratonOptikal	= new Raton("USB", "Optical");
		Teclado tecladoOptikal = new Teclado("USB", "Optikal");
		Computadora computadoraAsus = new Computadora("ASUS", monitorSmasung, tecladoOptikal, ratonOptikal);
		
		Monitor monitorDell = new Monitor("Dell", 17.5);
		Raton   ratonDell	= new Raton("USB", "Dell");
		Teclado tecladoDell = new Teclado("USB", "Dell");
		Computadora computadoraDell = new Computadora("ASUS", monitorDell, tecladoDell, ratonDell);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraAsus);
		orden1.agregarComputadora(computadoraDell);
		
		orden1.mostrarOrden();
		
	}

}
