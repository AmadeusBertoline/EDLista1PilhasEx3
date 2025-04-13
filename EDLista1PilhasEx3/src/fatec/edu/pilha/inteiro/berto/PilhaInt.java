package fatec.edu.pilha.inteiro.berto;

public class PilhaInt {

	No topo;
	private int size = 0;

	public boolean isEmpty() {

		if (topo == null) {

			return true;

		}

		return false;

	}

	public void push(int dado) {

		if (!isEmpty()) {

			No elemento = new No();
			elemento.dado = dado;

			if (isEmpty()) {

				topo = elemento;

			} else {

				elemento.proximo = topo;
				topo = elemento;

			}

		}

		size++;

	}

	public int pop() throws Exception {

		if (isEmpty()) {

			throw new Exception("Pilha vazia");

		}

		int dado = topo.dado;

		topo = topo.proximo;

		size--;

		return dado;

	}

	public int top() throws Exception {

		if (isEmpty()) {

			throw new Exception("Pilha vazia");

		}

		return topo.dado;

	}

	public int size() {

		return size;

	}

}