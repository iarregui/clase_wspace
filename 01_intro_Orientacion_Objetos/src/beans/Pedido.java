package beans;

public class Pedido {
	
	private int idPedido ;
	private String descripcion;
	private double importe;
	private boolean conIva ;
	private Cliente cliente;
	
	//  GETTER AND SETTER
	/**
	 * @return the idPedido
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the importe
	 */
	public double getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}
	/**
	 * @return the conIva
	 */
	public boolean isConIva() {// EN LO BOOLEAN NO HAY GET  EN SU LUGAR ESTA "IS " DEVULEVE TRUE O FALSE
		return conIva;
	}
	/**
	 * @param conIva the conIva to set
	 */
	public void setConIva(boolean conIva) {
		this.conIva = conIva;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	// TO STRING
	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", descripcion=" + descripcion + ", importe=" + importe + ", conIva="
				+ conIva + ", cliente=" + cliente + "]";
	}

	
	// METODOS CONSTRUCTORES
	
	public Pedido() {
		super();
	}
	
	
	public Pedido(int idPedido, String descripcion, double importe, boolean conIva, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.descripcion = descripcion;
		this.importe = importe;
		this.conIva = conIva;
		this.cliente = cliente;
	}
	// OTROS METODOS 
	
	public double  totalImporte (int iva) {
		if (!conIva)  // equivale a (conIva == False) o (conIva !=true)
			return importe ;
		else
			return importe * 1 + (double) iva  / 100 ; // al poner un casting del iva que es esntero,  el resultado iva/100 devuelve un decimal y no unn entero
	
	}
	
	
	

}
