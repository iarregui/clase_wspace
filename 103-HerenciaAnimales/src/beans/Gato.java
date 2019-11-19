package beans;

public class  Gato extends Animal{//IMPORTANTE : EXTEND INDICA QUE ES UNA CLASE QUE HEREDA DE OTRA
		private int vidas;
	
	
	
	
		// getter and setter
		

		public Gato(String color, int vidas) { // parametros que recoge ( los propios y los que hereda.
			super(color);// atributos que hereda  y pasa hacia arriba
			this.vidas = vidas;
		}
		
		public Gato() {}
		
		
		

		// ----------to string ( reescrito para usat el propio y no le heredado ojo deben estar los atributos en protected
	
		@Override
		public String toString() {
			return "Gato [vidas=" + vidas + ", color=" + color + "]";
		}
	
		//-------------METODOS PROPIOS
	 
		public int getVidas () {
			return vidas;
		}

	

		public void mostrarDatos () {
			System.out.println("vidas: " + vidas);	
			System.out.println("color : " + this.getColor());// funciona con geteer por si no hay acceso protegido ( funciona con atributi private)
			System.out.println("color : " + color); //solo lo veria si el atributo fuera protected en la clase del padre
			
		}
		
		
		public void trepar() {
			
			System.out.println(" trepo que flipas");
		}

		


		// otros metodos heredados sobrescritos con Source -->Override
		
//----- METODOS HEREDADOS ( DEBO INCLUIRLOS SI QUIERO QUE SE EJECUTEN LOS DEL 
		@Override
		public void saludar() {
			// TODO Auto-generated method stub
			//super.saludar();// lo borro y debajo escribo mi codigo que seejecutaria en vez del heredado.
			
			System.out.println("este mensaje saludo es de gato");
			
		}




	
	
	
}
