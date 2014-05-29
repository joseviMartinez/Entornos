
public class Clientes {
private String NombreClientes;
private String ApellidoClientes;
private String Direccion;
private float PrecioClientes;
private int FechaEnvio;
private int Numero;
private int Puerta;
private String Letra;
	public Clientes() {
		//inicializacion
		NombreClientes="";
		ApellidoClientes="";
		Direccion="";
		PrecioClientes=0;
		FechaEnvio=0;
		Numero=0;
		Puerta=0;
		Letra="";
	}

	
	//creamos los metodos
	
	public void guardarNombre(String Nom){
		NombreClientes=Nom;
	}
	public String CogerNombre(){
		return NombreClientes;
	}
	public void guardarApellido(String Apellido){
		ApellidoClientes=Apellido;
	}
	public String CogerApellido(){
		return ApellidoClientes;
	}
	public void guardarDireccion(String direc){
		Direccion=direc;
	}
	public String cogerDireccion(){
		return Direccion;
	}
	public void guardarprecio (float precio){
		PrecioClientes=precio;
	}
	public float cogerprecio (){
		return PrecioClientes;
	}
	public void guardarfecha(int fecha){
		FechaEnvio=fecha;
	}
	public int cogerfecha(){
		return FechaEnvio;
	}
	public void guardarnumero(int num){
		Numero=num;
	}
	public int cogernumero(){
		return Numero;
	}
	public void guardarpuerta(int puert){
		Puerta=puert;
	}
	public int cogerpuerta(){
		return Puerta;
	}
	public void guardarletra(String letr){
		Letra=letr;
	}
	public String cogerletra(){
		return Letra;
	}
	public String toString(){
		return NombreClientes;
	}
}
