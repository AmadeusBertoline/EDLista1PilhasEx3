package fatec.edu.pilha.inteiro;

import java.util.EmptyStackException;

public class PilhaInt {

	private int[] pilha;
	private int topo;
	private int capacidade;

	// Construtor da pilha com capacidade inicial
	public PilhaInt(int capacidade) {
		this.capacidade = capacidade;
		pilha = new int[capacidade];
		topo = -1; // A pilha está vazia no início
	}

	// Método para verificar se a pilha está cheia
	public boolean estaCheia() {
		return topo == capacidade - 1;
	}

	// Método para verificar se a pilha está vazia
	public boolean estaVazia() {
		return topo == -1;
	}

	// Método para adicionar um elemento à pilha
	public void empilhar(int valor) {
		if (estaCheia()) {
			throw new IllegalStateException("A pilha está cheia. Não é possível empilhar mais elementos.");
		}
		pilha[++topo] = valor;
	}

	// Método para remover o elemento do topo da pilha
	public int desempilhar() {
		if (estaVazia()) {
			throw new EmptyStackException();
		}
		return pilha[topo--];
	}

	// Método para ver o elemento no topo da pilha sem removê-lo
	public int topo() {
		if (estaVazia()) {
			throw new EmptyStackException();
		}
		return pilha[topo];
	}

	// Método para obter o tamanho da pilha
	public int tamanho() {
		return topo + 1;
	}

	// Método para exibir os elementos da pilha (para debug ou visualização)
	public void exibir() {
		if (estaVazia()) {
			System.out.println("A pilha está vazia.");
			return;
		}
		for (int i = 0; i <= topo; i++) {
			System.out.print(pilha[i] + " ");
		}
		System.out.println();
	}
}
