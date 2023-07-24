package arbol.binario;

public class Nodo {
	
	protected Object dato;
	protected Nodo izdo;
	protected Nodo dcho;
	
	public Nodo(Object valor){
		dato = valor;
		izdo = dcho = null;
	}
	
	public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho){
		dato= valor;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}
	
	// operaciones de acceso 
	public Object valorNodo(){ 
		return dato;
	}
	
	public Nodo subarbolIzdo(){ 
		return izdo;
	}
	
	public Nodo subarbolDcho(){ 
		return dcho;
	}
	
	public void nuevoValor(Object d){
		dato = d;
	}
	
	public void ramaIzdo(Nodo n){
		izdo = n;
	}
	
	public void ramaDcho(Nodo n){
		dcho = n;
	}
	
	//--método adicional para implementar el recorrido de un arbol binario
	public void visitar(){
		System.out.print(dato + " ");
	}
}
