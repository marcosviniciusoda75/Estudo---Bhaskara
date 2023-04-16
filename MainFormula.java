import java.util.Scanner;
public class MainFormula {
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		FormulaDoBhaskara bhaskara = new FormulaDoBhaskara();
		bhaskara.setPrimeiroValor(in.nextInt());
		bhaskara.setSegundoValor(in.nextInt());
		bhaskara.setTerceiroValor(in.nextInt());
		System.out.println(bhaskara.getDelta());
		System.out.println(bhaskara.getPrimeiroY());
		System.out.println(bhaskara.getSegundoY());
		in.close();
	}
}