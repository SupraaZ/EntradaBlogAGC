
/**
* Clase para manejar las entradas de un blog.
* @author Adrian Granero
* @version 27/01/202
*/

public class EntradaBlogAGC {
	//separador es el ccar�cter que separa ENTRADA DE del
	//nombre del autor

	/**
	 * Es el caracter que separa ENTRADA de 1
	 */
	
	public static char separador=':';

	
	private int id;
	
	private String texto;

	private String autor;
	

	/**
	 * Constructor de la clase.
	 * @param id Es el n�umero de entrada
	 * @param autor Nombre del autor de la entrada
	 * @param texto Texto que contiene la entrada
	 * @throws IllegalArgumentException  Si el n�mero de entrada es negativo, lanza una excepci�n.
	 */
	public EntradaBlogAGC(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * 
	 * @return Devuelve el n�mero de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * 
	 * @return Devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * 
	 * @return Devuelve el nombre del autor de la entrada en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * 
	 * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * 
	 * @param args No tiene porqu� tener argumentos.
	 */
	public static void main(String[] args) {

		EntradaBlogAGC e1=new EntradaBlogAGC (-5,"Adri�n","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}