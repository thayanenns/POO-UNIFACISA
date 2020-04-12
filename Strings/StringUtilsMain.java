import java.util.Arrays;

public class StringUtilsMain {
	public static void main(String []args) {
		System.out.println(StringUtils.formataAtributo("quantidade de questoes"));
		System.out.println(StringUtils.formataMetodo("get quantidade de questoes"));
		System.out.println(StringUtils.formataClasse("formatador de identificadores"));
		System.out.println(StringUtils.ordenaStrings("honda", "honda"));
		System.out.println(StringUtils.ehPalindromo("arara"));
		System.out.println(StringUtils.transformaParaCaixaAlta("PhUlaNo dEtHal"));
		System.out.println(StringUtils.contaVogais("In God We Trust"));		
		System.out.println(StringUtils.removeEspacosSuperfluos(" Hay que endurecerse, pero sin perder la ternura jamás "));
		
		int[] ocorrencia= StringUtils.ocorrencias("O doce perguntou para o doce, qual o doce mais doce?", "doce");
		System.out.println(Arrays.toString(ocorrencia));
		
		System.out.println(StringUtils.binarioPraDecimal("101110010"));
		System.out.println(StringUtils.getQtdadePalavras("programar é muito fácil"));
		
		int[] frase = StringUtils.histogramaLetras("the quick brown fox jumps over the lazy dog");
		System.out.println(Arrays.toString(frase)+"\n");
		
		
	}
}
