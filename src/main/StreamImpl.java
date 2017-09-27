package main;

public class StreamImpl implements Stream {

	// variavel que recebera a stream ser lida
	private String stream = null;

	// variavel auxiliar de qual caractere sera lido
	private int charPosition = 0;

	// construtor que inicializa as variaveis;
	public StreamImpl(String stream) {
		if (stream != null && stream.trim().length() > 0) {
			this.stream = stream;
		}
		this.charPosition = 0;
	}

	@Override
	public char getNext() {
		if (hasNext()) {
			charPosition++;
			return stream.charAt(charPosition - 1);
		}
		return '/';
	}

	@Override
	public boolean hasNext() {
		if (charPosition >= stream.length()) {
			return false;
		}
		return true;
	}

	@Override
	public void backToFirstChar() {
		charPosition = 0;
	}

}
