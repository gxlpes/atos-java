
public class Questao9 {

	public static void main(String[] args) {

		float values[] = {2, 8, 5, 9, 6};
		int i = values.length;
		float media=0;
		
		do {
			media += values[i-1];
			i--;
		} while (i>0);
		media = media / values.length;
		System.out.println("media do vetor: " + media);

		
	}

}
