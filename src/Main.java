import java.util.Scanner;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		
		Lista miLista = new Lista(); 
		int menu = -1;
		Scanner t = new Scanner(System.in);
		while(menu != 0) {

			//Menu
			menu = Integer.parseInt(JOptionPane.showInputDialog(null,"< - > Menu Listas - Nodos < - >\n"
					+ "1.- Crear Lista\n"
					+ "2.- Recorrer Lista e imprimir\n"
					+ "3.- Imprimir el tamaño de la lista \n"
					+ "4.- Insertar dato al inicio de la lista \n"
					+ "5.- Insertar dato al final de la lista\n"
					+ "6.- Insertar dato en cualquier posicion de la lista\n"
					+ "0.- Salir\n"
					+ "< - > Menu Listas - Nodos < - >", "Ingresa una opcion"));

			switch(menu) {

			case 1:
				miLista.crearLista();
				break;
			case 2:
				System.out.println("Nodos en la lista:");

				miLista.recorrerLista();
				break;
			case 3:
				System.out.println("El tamaño de la lista es: "+miLista.tamanioLista());
				break;
			case 4:
				
				miLista.insertarAlInicio();
				break;
			case 5:
				miLista.insertarAlFinal();
				break;
			case 6:
				System.out.println("Inserta en que posicion: ");
				int pos;
				pos = t.nextInt();
				miLista.insertarEnPosicion(pos);
				break;
			default:
				break;		
			}

		}
	}
}