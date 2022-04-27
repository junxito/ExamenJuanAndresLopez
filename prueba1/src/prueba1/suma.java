package prueba1;

import javax.swing.JOptionPane;

public class suma {

	public static void main(String[] args) {
		int suma = 0, 
			num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero: ")), 
			num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		suma= num1+num2;
		System.out.println("La suma de los numeros introducidos es: "+suma);

	}

}
