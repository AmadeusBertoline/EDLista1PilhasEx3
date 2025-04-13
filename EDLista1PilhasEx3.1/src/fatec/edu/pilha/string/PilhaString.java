package fatec.edu.pilha.string;

public class PilhaString {

	No topo;
	int size;

	public boolean isEmpty() {

		if (topo == null) {

			return true;

		}

		return false;

	}

	public void push() {

		No elemento = new No();

		if (isEmpty()) {

			topo = elemento;

		} else {

			elemento.proximo = topo;
			topo = elemento;

		}

		size++;

	}

	public String pop() throws Exception {

		if (isEmpty()) {

			throw new Exception("Pilha vazia");

		}

		String dado = topo.dado;

		topo = topo.proximo;

		size--;

		return dado;
	}

	public String top() throws Exception {

		if (isEmpty()) {

			throw new Exception("A pilha está vazia");

		}

		return topo.dado;

	}

	public int size() {

		return size;

	}

}
