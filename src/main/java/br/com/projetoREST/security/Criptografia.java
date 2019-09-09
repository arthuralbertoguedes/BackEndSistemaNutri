package br.com.projetoREST.security;

public class Criptografia {


	  public static String criptografar(String palavraOriginal) {
		  
		/* 1º passo - Converter cada letra da palavra original
		*  em sua respectiva representação ASCII;
	    * Cada letra na forma ASCII será uma posição do array */
		 int[] representacaoASCII = converterPalavraParaASCII(palavraOriginal); 
		  
		 
		 /* 2º passo - Converter cada posição de ASCII para a representação em bytes; */
		 String[] representacaoBytes = converterASCIIparaBinario(representacaoASCII);

		 /* 3º passo - Inserir 0's em cada posição do array até todas tiverem 8 bits cada */
		 String[] representacaoBytesFormatada = formatarArrayBytes(representacaoBytes);	 
		 
		 /* 4º passo - Unir todas as posições do array e acrescentar 1 ao final; */
		 String representacaoCompleta = unirArrayBytes(representacaoBytesFormatada);
		 
		 /* 5º passo - Adicionar zeros até o tamanho da String ser 448 mod 512  - (Tamanho 448)*/
		 representacaoCompleta = adicionarZeros(representacaoCompleta);
		 
		 
		 /* 6º passo - Pega o array do passo 3 e junta suas posições numa só string  
		  * Pega o tamanho do array resultante  
		  * Converte esse tamanho em bits
		  */
		 String tamanhoArrayEmBinario = getTamanhoArrayEmBinario(representacaoBytesFormatada);
		 
		 /* 7º passo - Os bits do passo anterior será acrescido de zeros
		  * até ter o tamanho de 64 caracteres
		  */
		 String tamanhoArrayEmBinario64Caracteres = adicionarZerosAte64Caracteres(tamanhoArrayEmBinario);
		 
		 /* 8º passo - Une a String do passo 5 com a String do passo 7 */
		 representacaoCompleta += tamanhoArrayEmBinario64Caracteres;
		 
		 /* 9º passo - Separa a String em 16 pedaços de 32 bits cada 
		  * O algoritmo original cria 80 pedaços (chunks) */
		 String[] arrayChunks = converterStringArray(representacaoCompleta);
		 
		 /* 10º passo - Criar 5 variáveis com 32 bits aleatórios cada
		 *  Essas variáveis passarão por várias operações lógicas bit a bit,
		 *  operações de concatenação entre elas e os chunks criados com a palavra
		 *  original - logo em seguida, formarão o hash após conversão hexadecimal
		 */
		 
		 String a = "10010101010001100101010000010110";
		 String b = "10110010000011001100100010111111";
		 String c = "10111110100010000101011010101000";
		 String d = "11010100010100001010111111000010";
		 String e = "11110010010010101010101101101101";
		 
		 /*11º passo - Operações de bitwise, de mescla e outras operações aleatórias
		  entre as variáveis inicializadas e cada chunk 
		  As operações realizadas aqui são personalizadas, 
		  diferentes das originais utilizadas pelo SHA-1*/

		 
		 /* Disjunção exclusiva exclusiva para cada posição do array
		  * seguido de mescla entre as próprias variáveis */
		 for(int i = 0; i < 16; i++) {
			 
			 a = disjuncaoExclusiva(arrayChunks[i], a);
			 b = disjuncaoExclusiva(arrayChunks[i], c);
			 c = disjuncaoExclusiva(a, b);
			 d = disjuncaoExclusiva(a, c);

			 String temp = "10011111011010111010100001101001";
			 
			 e = inverterBit(a);
			 a = disjuncaoExclusiva(b, temp);
			
	
		 }
		 
		 /*Converte as variáveis modificadas em hexadecimal e
		  *  concatena gerando a criptografia final */

		 String palavraCriptografada = "";
		 palavraCriptografada += converterParaHexadecimal(a);
		 palavraCriptografada += converterParaHexadecimal(b);
		 palavraCriptografada += converterParaHexadecimal(c);
		 palavraCriptografada += converterParaHexadecimal(d);
		 palavraCriptografada += converterParaHexadecimal(e);
		 
		 return palavraCriptografada;
	  }
	  
	  
	  private static int[] converterPalavraParaASCII(String palavraOriginal) {
		  int[] representacaoASCII = new int[palavraOriginal.length()];  
		  
		 for(int i = 0; i<palavraOriginal.length(); i++) {
			 //adiciona ao array a representação ASCII do caracter
			 representacaoASCII[i] = (int) palavraOriginal.charAt(i);
		 }
		 return representacaoASCII;		 
	  }
	  
	  
	  private static String[] converterASCIIparaBinario(int[] palavraASCII) {
		  //Inicializando o array de bytes com o tamanho do numero de letras da palavra original
		  String[] representacaoBytes = new String[palavraASCII.length];
		  
		  for(int i = 0; i<palavraASCII.length; i++) {
			  //adicionando representação em binário para cada caracter
			  String valorByte = Integer.toBinaryString(palavraASCII[i]);
			  representacaoBytes[i] = valorByte;
		  }
		  return representacaoBytes;  
	  }
	  
	  
	  //Adiciona zeros a esquerda para cada posição do array
	  private static String[] formatarArrayBytes(String[] arrayBytes) {
		  
		  for(int i = 0; i < arrayBytes.length; i++) {
			  
			  int zerosRestantes = 8 - arrayBytes[i].length();
			  
			  //Insere zeros ate cada posição do array tiver 8 bits
			  if(zerosRestantes > 0) {
				  StringBuilder builder = new StringBuilder(arrayBytes[i]);
				  for(int j = 0; j < zerosRestantes; j++) {
					  
					  builder.insert(0, '0');
					  
				  }
				  arrayBytes[i] = builder.toString();
			  }			  
		  }
		 return arrayBytes; 
	  }
	  
	  // Faz o join do array e adiciona o bit 1 ao final
	  private static String unirArrayBytes(String[] arrayOriginal) {
		  StringBuilder sb = new StringBuilder();
		  for(String iterator : arrayOriginal) {
			  sb.append(iterator);	  
		  }
		  return sb.append("1").toString();
	  }
	  
	  
	  //Adiciona zeros a direita
	  private static String adicionarZeros(String representacao) {
		  while(representacao.length() % 512 != 448) {
			  representacao += "0";
		  }
		 return representacao; 
	  }
	  
	  // Faz o join do array e converte seu tamanho em binário
	  private static String getTamanhoArrayEmBinario(String[] arrayString){
		  StringBuilder sb = new StringBuilder();
		  for(String iterator : arrayString) {
			  sb.append(iterator);	  
		  }
		  return Integer.toBinaryString(sb.toString().length());
	  }
	  
	  //Adiciona zeros a esquerda até a string ter 64 caracteres
	  private static String adicionarZerosAte64Caracteres(String tamanhoArrayMenor) {
		  StringBuilder sb = new StringBuilder(tamanhoArrayMenor);
		  while(sb.toString().length() < 64) {
			  sb.insert(0,"0");
		  }
		  return sb.toString();		  
	  }
	  
	  private static String[] converterStringArray(String stringCompleta) {
		  String[] arrayChunks = new String[16];
		  int inicioSubstring = 0;
		  int fimSubstring = 32;
		  int i = 0;
		  StringBuilder sb = new StringBuilder(stringCompleta);
		  while(fimSubstring <= 512) {
			  
			  arrayChunks[i] = sb.substring(inicioSubstring, fimSubstring);
			  
			  if(inicioSubstring == 0)
				  inicioSubstring = 32;
			  else
				  inicioSubstring += 32;
			  
			  fimSubstring += 32;
			  i++;
		  }

		  return arrayChunks;
	  }	
	  
	  /* Recebe duas String de 32 bits e realiza operações bit a bit de acordo com
	   * a tabela verdade de disjunção exclusiva;
	   * A primeira String eh algum chunk da palavra Original e a segunda é a palavra
	   * aleatória declarada
	   * Como retorno apenas uma string que substituirá a palavra declarada original;
	   */
	  private static String disjuncaoExclusiva(String chunk, String palavraDeclarada) {
		  StringBuilder sb = new StringBuilder(palavraDeclarada);
		  for(int i = 0; i < 32; i++) {
			  if(chunk.charAt(i) == palavraDeclarada.charAt(i)) {	
				  String novoBit = "0";
				  sb.setCharAt(i, novoBit.charAt(0));			  
			  }
			  else {
				  String novoBit = "1";
				  sb.setCharAt(i, novoBit.charAt(0));
			  }
		  }

		  return sb.toString();
	  }
	  
	  // Inverte os bits da palavra original
	  private static String inverterBit(String palavra) {
		  StringBuilder sb = new StringBuilder(palavra);
		  for(int i = 0; i < 32; i++) {
			  if(palavra.charAt(i)== new String("1").charAt(0))
				  sb.setCharAt(i, new String("0").charAt(0));
			  else
				  sb.setCharAt(i, new String("1").charAt(0));
		  }
		  return sb.toString();
	  }
	  
	  private static String converterParaHexadecimal(String stringOriginal) {
		  Long i = Long.parseLong (stringOriginal, 2);
		  return String.format ("%08X", i);
	  }
}	


