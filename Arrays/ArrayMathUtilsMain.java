import java.util.Arrays;

public class ArrayMathUtilsMain {

	public static void main(String[] args) {	

		int[] divisores = ArrayMathUtils.calculaDivisores(32);
		System.out.println(Arrays.toString(divisores));
		
		double [] numeros = new double [] {12.4, 43.1, 4.3, 54.0, 6.7};
		System.out.println(ArrayMathUtils.computaMaior(numeros));
		
		System.out.println(ArrayMathUtils.computaMenor(numeros));
		
		System.out.println(ArrayMathUtils.computaMedia(numeros));
		
		System.out.println(ArrayMathUtils.temNumRepetido(numeros));
		
		int [][] m1 = new int [][] {{5,4},{0,2},{1,-1}}; 
		int [][] m2 = new int [][] {{0,-2},{5,-3},{-1,0}};
		ArrayMathUtils.somaMatrizes(m1, m2);
		
	}

}
