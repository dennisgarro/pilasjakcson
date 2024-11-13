import java.util.Scanner;
import java.util.Stack;

public class pila {
    public static void main(String[] args) {
        metodos m = new metodos();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = m.llenarPila(6);
        m.MostrarPila(pila);
        System.out.println("ingrese el numero ");
        int numero = sc.nextInt();
        pila = m.eliminarRegistro(pila, numero);
        m.MostrarPila(pila);
    }
}
