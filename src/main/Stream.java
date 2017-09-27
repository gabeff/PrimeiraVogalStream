package main;

public interface Stream {
	
	//le o proximo caractere da stream
	public char getNext();

	//identifica se ha algum caractere a ser lido
	public boolean hasNext();
	
	//reseta posicao da stream
	public void backToFirstChar();
}
