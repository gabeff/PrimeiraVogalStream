# PrimeiraVogalStream

Dada uma stream, encontre o primeiro caractere Vogal, após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita no resto da stream. O termino da leitura da stream deve ser garantido através do método hasNext(), ou seja, retorna falso para o termino da leitura da stream. Voce tera acesso a leitura da stream através dos métodos de interface fornecidos ao termino do enunciado. 

## Premissas

Uma chamada para hasNext() ir retornar se a stream ainda contem caracteres para processar.
Uma chamada para getNext() ir retornar o proximo caractere a ser processado na stream.
Não será possível reiniciar o fluxo da leitura da stream.
Não poderá ser utilizado nenhum framework Java, apenas código nativo.

### Exemplo

```
Input:  aAbBABacafe
Output: e
```
No exemplo, ‘e’ é o primeiro caractere Vogal da stream que não se repete após a primeira Consoante ‘f’o qual tem uma vogal ‘a’ como antecessora.

### Interface Java

Segue o exemplo da interface em Java

```
public interface Stream{
    public char getNext();
    public boolean hasNext();
}

public static char firstChar(Stream input) {
}
```

### Solucao

Foi implementada uma iteração sobre a Stream dada de forma a reter 3 caracteres, o atual, o anterior e o antecessor. Caso o caractere atual seja uma vogal que não se repita no resto da stream, o anterior seja uma consoante e o antecessor uma vogal, esse caractere será o retornado pelo método main.

### Testes

Na classe StreamTest foram realizados os seguintes testes

```
Stream stream1 = new StreamImpl("aAbBABacafe");
Resultado esperado = 'e'
Reultado retornado = 'e'
```

```
Stream stream2 = new StreamImpl("aAbBABacafersyeVixyz");
Resultado esperado = 'i'
Reultado retornado = 'i'
```

```
Stream stream3 = new StreamImpl("abadceferpliyipl");
Resultado esperado = 'a'
Reultado retornado = 'a'
```

```
Stream stream4 = new StreamImpl("ndisaASD32ekofsad0NJFDIS09ISu4klfsdo");
Resultado esperado = 'u'
Reultado retornado = 'u'
```

## Tecnologias Utilizadas

* [Java 8]

