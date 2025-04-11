package model;

public class PilhaInt {

	// o topo armazena sempre um n�, por isso � do tipo n�
	No topo;

	// a pilha tem que inicializar com seu topo nulo
	public PilhaInt() {

		topo = null;

	}

	// verifica se a pilha est� vazia para tomar decis�es
	public boolean isEmpty() {

		if (topo == null) {

			return true;

		} else {

			return false;
		}

	}

	// se a pilha n�o tiver nenhum elemento, o novo elemento � o topo
	//
	public void push(int e) {

		No elemento = new No();

		elemento.dado = e;

		if (isEmpty()) {

			topo = elemento;

		} else {

			elemento.proximo = topo;

			topo = elemento;

		}

	}

	// se a pilha n�o estiver vazia, faz o pop do dado do n� atual
	// depois pega o n� para qual ele est� apontando "proximo" e faz
	// dele o novo topo
	public int pop() throws Exception {

		if (isEmpty()) {

			throw new Exception("N�o h� elementos para desempilhar");

		}

		int valor = topo.dado;
		topo = topo.proximo;
		return valor;

	}

	//de forma booleana, pega o dado do topo e retorna ele, se n�o estiver vazio
	public int top() throws Exception {

		if (isEmpty()) {

			throw new Exception("N�o h� elementos na pilha");

		}

		int valor = topo.dado;
		return valor;

	}

	
	//pega o topo da pilha, e partir dele, verifica quantos outros n�s ele est� apontando
	//se ele aponta para um, temos uma pilha de size 1, se aponta para 10, size 10
	//o contador incrementa toda vez que existe um proximo elemento, caso ele seja null
	//para e retorna o size, que � o valor do contador
	public int size() {

		int cont = 0;
		if (!isEmpty()) {

			No auxiliar = topo;
			cont = 1;

			while (auxiliar.proximo != null) {

				auxiliar = auxiliar.proximo;
				cont++;

			}

		}

		return cont;

	}

}
