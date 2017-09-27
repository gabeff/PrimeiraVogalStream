package main;

public class StreamMain {

	public static boolean ehVogal(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean ehConsoante(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return false;
		} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			return true;
		else {
			return false;
		}

	}

	public static String firstChar(Stream input) {
		// string de retorno
		String retorno = "Não foi encontrada nenhuma vogal que satisfaça a condição :(";

		// primeira vogal apos uma consoante antecedida por outra vogal que nao
		// se repete no resto da stream
		char primeiraVogal = '0';
		
		// variaveis auxiliares
		char antecessorChar = '0';
		char previousChar = '0';
		char currentChar = '0';
		
		// vogais que se repetem na stream
		String excluirVogais = "0";

		if (input == null) {
			retorno = "Favor digitar uma stream valida =]";
		} else {
			//enquanto houver caractere pare ler, continuar lendo
			while (input.hasNext()) {
				char ch = input.getNext();
				//se o caractere atual for igual a vogal que acreditavamos ser a primeira
				//reseta tudo e exclui essa vogal da analise
				if (primeiraVogal == ch & ehVogal(ch)) {
					antecessorChar = '0';
					previousChar = '0';
					currentChar = '0';
					primeiraVogal = '0';
					if (excluirVogais == "0") excluirVogais = Character.toString(ch);
					else excluirVogais = excluirVogais + ch;
					retorno = "Não foi encontrada nenhuma vogal que satisfaça a condição :(";
					input.backToFirstChar();
				}
				//atribui auxiliares, caractere atual, anterior e antecessor
				if (primeiraVogal == '0') {
					if (antecessorChar == '0')
						antecessorChar = ch;
					else if (previousChar == '0')
						previousChar = ch;
					else if (currentChar == '0')
						currentChar = ch;
					else {
						antecessorChar = previousChar;
						previousChar = currentChar;
						currentChar = ch;
					}
					/*verifica se o caractere eh uma vogal, precedida de uma consoante que 
					por sua vez eh precedida de outra vogal... tb verifica se a vogal nao
					se repete no resto da stream */
					if (ehVogal(antecessorChar) & ehConsoante(previousChar) & ehVogal(currentChar) & excluirVogais.indexOf(currentChar)<0) {
						primeiraVogal = currentChar;
						retorno = Character.toString(primeiraVogal);
					}
				}
			}
		}

		// retorno
		return retorno;

	}
}