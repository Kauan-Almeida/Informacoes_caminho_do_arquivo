package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: "); 
		String strPath = sc.nextLine(); // Mostrar o caminho.
		
		File path = new File(strPath); // Receper o argumento.
		
		System.out.println("getName: " + path.getName()); // Imprimir o nome do arquivo.
		System.out.println("getParent: " + path.getParent()); // Imprimir o caminho, mas o nome do arquivo n ira mostrar.
		System.out.println("getPath: " + path.getPath()); // Imprimir todo o caminho, inclusive o nome do arquivo.
		
		sc.close();
	}
}