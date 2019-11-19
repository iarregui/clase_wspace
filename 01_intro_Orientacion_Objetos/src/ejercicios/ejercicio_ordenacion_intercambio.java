package ejercicios;

public class ejercicio_ordenacion_intercambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Intercambio: consiste en comparar el primer valor con el resto de las posiciones posteriores, cambiando el valor de las posiciones en caso de que el segundo sea menor que el primero comparado, después la segunda posición con el resto de posiciones posteriores.
 *  Te enseñamos un ejemplo de como funciona
 */
	//--------------METODO INTERCAMBIO CON NUMEROS, TRASPONE UN ARRAY DE MANERA QUE 
		int lista[]= {1,8,9,3,2};
		 //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
 
                }
            }
        }
    
	}

}
