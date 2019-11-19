package testbeans;

import beans.Cliente;
import beans.Pedido;

public class TestPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Pedido ped1 = new Pedido(1, "tornillo", 1, true, Cliente.dameCliente());
		System.out.println("Idpedido: "+ ped1.getIdPedido());
		System.out.println("pedido: "+ ped1.getDescripcion());
		System.out.println("Nombre cliente que hizo el pedido: "+ ped1.getCliente().getNombre().toUpperCase());
		
		
	}

}
