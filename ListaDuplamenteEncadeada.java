public class ListaDuplamenteEncadeada {
	private NoLDE primeira = null;
	private NoLDE ultima = null;
	private int contador=0;
	
	public void Insere(Object elemento) {
		//insere no come�o da lista
		//TODO
		NoLDE no = new NoLDE(elemento,primeira);
		no.setAnterior(null);
		if(primeira != null) {
			primeira.setAnterior(no);
		}
		primeira = no;
		if(contador == 0) {
			ultima = primeira;
		}contador++;
		
	}
	public void InsereF(Object elemento) {
		//Inserir no fim da lista
		//TODO
		NoLDE no = new NoLDE(elemento,null);
		no.setAnterior(ultima);
		if(ultima != null) {
			ultima.setProximo(no);
		}
		ultima = no;
		if(contador == 0) {
			primeira = ultima;
		}contador++;
	}
		
	public Object MostraNodo(int posicao) {
		//retorna o elemento da posicao solicitada.
		//use getElemento()
		NoLDE atual = this.primeira;
		for(int i=0;i < posicao;i++) {
			atual = atual.getProximo();
			
		}
		return atual.getElemento();
	}
	
	public int Tamanho() {
		return this.contador;
	}

	public void Remove() {
		//Remove um elemento do come�o da lista.
		//TODO
		if(primeira == null) {
			throw new IllegalArgumentException("Lista Vazia.");
		}
		primeira = primeira.getProximo();
		if(primeira != null) {
			primeira.setAnterior(null);
		}else {
			ultima = null;
		}
		contador--;
	} 	
	
	public void RemoveF() {
		//TODO
	}
	
	public boolean Verifica(Object obj) {
		//Faz a busca por um elemento na lista.
		NoLDE atual = this.primeira;
		while(atual != null) {
			if(atual.getElemento().equals(obj)) {
				return true;
			}
		atual = atual.getProximo();
		}
		return false;
	}
	
	public String ShowList() {
		if (contador ==0) {
			return "[ ]";
		}
		NoLDE atual = primeira;
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i < contador;i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}

}

