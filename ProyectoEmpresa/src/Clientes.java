
public class Clientes {
private String NombreClientes;
private String ApellidoClientes;
private String Direccion;
private float precio;
private int fecha;

	public Clientes() {
		//inicializacion
		NombreClientes="";
		ApellidoClientes="";
		Direccion="";
		precio=0;
		fecha=0;
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
}
