import java.util.Stack;

public class metodos {
    public Stack<Integer> llenarPila(int n) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < n; i++) {
            pila.push((int) (Math.random() * 50 + 1));
        }
        return pila;
    }

    public void MostrarPila(Stack<Integer> pila) {
        System.out.println(pila);
    }

    public Stack<Integer> eliminarRegistro(Stack<Integer> pila, int numero) {
        Stack<Integer> pilaAux = new Stack<>();
        int n = pila.size();
        for (int i = 0; i < n; i++) {
            if (pila.peek().equals(numero)) {
                pila.pop();
            } else {
                pilaAux.push(pila.pop());
            }

        }
        n = pilaAux.size();
        for (int i = 0; i < n; i++) {
            pila.push(pilaAux.pop());
        }

        return pila;
    }
}
