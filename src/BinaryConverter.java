
public class BinaryConverter {

	private int resultado = 0;

	public BinaryConverter() {
	}

	public void inputString(String BinaryString) {
		int reverse = 0;
		if (analyse(BinaryString) == true) {

			int[] binaryArray = new int[BinaryString.length()];

			for (int i = BinaryString.length() - 1; i >= 0; i--) {
				char analyseChar = BinaryString.charAt(i);
				// System.out.print("[" + analyseChar + "]");
				binaryArray[reverse] = Character.getNumericValue(analyseChar);
				// System.out.print("[" + binaryArray[i] + "]");
				reverse++;
			}
			binaryToInteger(binaryArray);

		} else {
			System.out.println("nao existe ");
		}

	}

	public void binaryToInteger(int[] bArray) {
		int result = 0;
		for (int i = 0; i < bArray.length; i++) {
			result += (Math.pow(2, i) * bArray[i]);
		}
		this.resultado = result;
	}

	public String toString() {
		return "o resultado e " + resultado;
	}

	@SuppressWarnings("unused")
	private boolean analyse(String analyse) {

		for (int i = 0; i < analyse.length(); i++) {
			char analyseChar = analyse.charAt(i);
			if (analyseChar != '0' && analyseChar != '1') {
				return false;
			}
		}
		return true;
	}
}
