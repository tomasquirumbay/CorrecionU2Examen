package arbol.binario;

public class ArbolBinario {

	public Nodo raiz;

	// Constructor para iniciar un arbol vacio
	public ArbolBinario() {
		raiz = null;
	}

	// Constructor - Crea un árbol con un elemento raíz y dos ramas
	public ArbolBinario(Object raiz, ArbolBinario arbolIzquierdo, ArbolBinario arbolDerecho) {
		this.raiz = new Nodo(arbolIzquierdo.raiz, raiz, arbolDerecho.raiz);
	}

	// comprueba el estado del arbol
	boolean esVacio() {
		return raiz == null;
	}

	// Metodo para dar el nodo
	public Nodo getRaiz() {
		return raiz;
	}

	// Método para obtener subárbol izquierdo de un nodo dado
	public ArbolBinario obtenerSubarbolIzquierdo(Nodo nodo) {
		if (nodo != null && nodo.izdo != null) {
			ArbolBinario subarbolIzquierdo = new ArbolBinario();
			subarbolIzquierdo.raiz = raiz.subarbolIzdo();
			return subarbolIzquierdo;
		} else {
			return null;
		}
	}

	// Método para obtener subárbol derecho de un nodo dado
	public ArbolBinario obtenerSubarbolDerecho(Nodo nodo) {
		if (nodo != null && nodo.dcho != null) {
			ArbolBinario subarbolDerecho = new ArbolBinario();
			subarbolDerecho.raiz = raiz.subarbolDcho();
			return subarbolDerecho;
		} else {
			return null;
		}
	}

	// Método para insertar un nuevo nodo en el árbol
	public void insertar(Object dato) {
		raiz = insertarRecursivo(raiz, dato);
	}

	private Nodo insertarRecursivo(Nodo nodo, Object dato) {
		if (nodo == null) {
			return new Nodo(dato);
		} else if ((int) dato < (int) nodo.dato) {
			nodo.izdo = insertarRecursivo(nodo.izdo, dato);
		} else if ((int) dato > (int) nodo.dato) {
			nodo.dcho = insertarRecursivo(nodo.dcho, dato);
		}
		return nodo;
	}

	// Método para imprimir el árbol en preorden
	public void imprimirPreorden(Nodo nodo) {
		if (nodo != null) {
			System.out.print(nodo.dato + " ");
			imprimirPreorden(nodo.izdo);
			imprimirPreorden(nodo.dcho);
		}
	}
	
	
	// Método auxiliar para imprimir el árbol en orden
	public void imprimirEnOrden(Nodo nodo) {
		if (nodo != null) {
			imprimirEnOrden(nodo.izdo);
			System.out.print(nodo.dato + " ");
			imprimirEnOrden(nodo.dcho);
		}
	}

	// Método para imprimir el árbol en postorden
	public void imprimirPostorden(Nodo nodo) {
		if (nodo != null) {
			imprimirPostorden(nodo.izdo);
			imprimirPostorden(nodo.dcho);
			System.out.print(nodo.dato + " ");

		}
	}

	// Método para contar el número de nodos en el árbol
	public int contarNodos() {
		return contarNodosRecursivo(raiz);
	}

	private int contarNodosRecursivo(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else {
			int nodosIzquierdos = contarNodosRecursivo(nodo.izdo);
			int nodosDerechos = contarNodosRecursivo(nodo.dcho);
			return 1 + nodosIzquierdos + nodosDerechos;
		}
	}

	// Sumar nodos
	public int sumarElementos() {
		return sumarElementosRecursivo(raiz);
	}

	private int sumarElementosRecursivo(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else {
			int suma = (int) nodo.dato;
			suma += sumarElementosRecursivo(nodo.izdo);
			suma += sumarElementosRecursivo(nodo.dcho);
			return suma;
		}
	}
}