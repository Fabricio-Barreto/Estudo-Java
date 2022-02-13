
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicional.");

		int num = 0;
		int idade = 8;

		while (true) {
			if (idade > 18) {
				System.out.println("Você tem mais de 18 anos!");
			} else {
				System.out.println("Você não tem mais de 18 anos!");
			}
			
			if (idade > 18 || num >= 1) {
				System.out.println("Testando o OU");
			} 
			
			if (idade > 18 && num >= 1) {
				System.out.println("Testando o AND");
			}

			num++;
			idade += 10;

			if (num > 2)
				break;
		}

	}
}
