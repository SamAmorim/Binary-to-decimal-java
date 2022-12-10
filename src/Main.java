import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		BinaryConverter binaryConverter = new BinaryConverter();
		
		System.out.print("Digite um numero binario para converter ");
		binaryConverter.inputString(input.next());
		System.out.println(binaryConverter.toString());

	}

}
