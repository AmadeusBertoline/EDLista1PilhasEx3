package fatec.edu.pilha.string;

import java.util.EmptyStackException;

public class PilhaString {

	private String[] pilha;
	private int topo;
	private int capacidade;

	// Construtor da pilha com capacidade inicial
	public PilhaString(int capacidade) {
		this.capacidade = capacidade;
		pilha = new String[capacidade];
		topo = -1; // A pilha est� vazia no in�cio
	}

	// M�todo para verificar se a pilha est� cheia
	public boolean estaCheia() {
		return topo == capacidade - 1;
	}

	// M�todo para verificar se a pilha est� vazia
	public boolean estaVazia() {
		return topo == -1;
	}

	// M�todo para adicionar um elemento � pilha
	public void empilhar(String valor) {
		if (estaCheia()) {
			throw new IllegalStateException("A pilha est� cheia. N�o � poss�vel empilhar mais elementos.");
		}
		pilha[++topo] = valor;
	}

	// M�todo para remover o elemento do topo da pilha
	public String desempilhar() {
		if (estaVazia()) {
			throw new EmptyStackException();
		}
		return pilha[topo--];
	}

	// M�todo para ver o elemento no topo da pilha sem remov�-lo
	public String topo() {
		if (estaVazia()) {
			throw new EmptyStackException();
		}
		return pilha[topo];
	}

	// M�todo para obter o tamanho da pilha
	public int tamanho() {
		return topo + 1;
	}

	// M�todo para exibir os elementos da pilha (para debug ou visualiza��o)
	public void exibir() {
		if (estaVazia()) {
			System.out.println("A pilha est� vazia.");
			return;
		}
		for (int i = 0; i <= topo; i++) {
			System.out.print(pilha[i] + " ");
		}
		System.out.println();
	}
}
