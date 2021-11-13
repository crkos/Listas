import java.util.Scanner;

public class Lista {

	Nodo head;
	
	public Lista() {
		head = null;
	}
	
	public void crearLista() {
		Scanner t1 = new Scanner(System.in);
		String s;
		Nodo q = new Nodo();
		do {
			Nodo p = new Nodo();
			Scanner t = new Scanner(System.in);
			System.out.println("Inserta un dato en el nodo: ");
			int num = t.nextInt();
			p.setDato(num);
			p.setSig(null);
			if(head == null){
				head = p;
			}else{
				q.setSig(p);
			}
			q = p;
			System.out.println("Quieres insertar otro nodo?: ");
			s = t1.nextLine().toUpperCase();
		} while (s.equals("SI"));
		

	}
	
	public void recorrerLista() {
		Nodo p = new Nodo();
		if(head != null){
			p = head;
			while(p != null){
				System.out.println("Dato en nodo: "+ p.getDato());
				p = p.getSig();
			}
		}else{
			System.out.println("Lista vacia");
		}

	}
	
	public int tamanioLista() {
		Nodo p = new Nodo();
		int tam = 0;
		if(head != null){
			p = head;
			tam = 1;
			while(p.getSig() != null){
				tam++;
				p = p.getSig();
			}
		}else{
			System.out.println("Lista vacia");
		}
		
		return tam;
		
	}

	public void insertarAlInicio(){
		Nodo p = new Nodo();
		Scanner t = new Scanner(System.in);
		System.out.println("Inserta un dato en el nodo: ");
		int num = t.nextInt();
		p.setDato(num);
		p.setSig(head);
		head = p;
	}

	public void insertarAlFinal(){

		Nodo p = new Nodo();
		Nodo q;
		Scanner t = new Scanner(System.in);
		System.out.println("Inserta un dato en el nodo: ");
		int num = t.nextInt();
		p.setDato(num);
		p.setSig(null);
		if(head != null){
			q = head;
			while(q.getSig() != null){
				q = q.getSig();

			}
			q.setSig(p);
		}else{
			head = p;
		}

	}

	public void insertarEnPosicion(int pos){
		Nodo p = new Nodo();
		Nodo q = new Nodo();
		p = head;
		int c = 0;
		while ( p != null) {
			p = p.getSig();
			c++;
		}
		if (pos > 0 && pos <= c+1) {
			p = new Nodo();
			Scanner t = new Scanner(System.in);
			System.out.println("Inserta un dato en el nodo: ");
			int num = t.nextInt();
			p.setDato(num);
			if(pos == 1){
				p.setSig(head);
				head = p;
			}else{
				q = head;
				for (int i = 1; i <= pos-1; i++) {
					q = q.getSig();
				}
				p.setSig(q.getSig());
				q.setSig(p);
			}
		}else{
			System.out.println("Posicion incorrecta");
		}
				
	}
	
}

