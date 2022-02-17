import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("qual seu primeiro nome?");
	String primeiroNome = s.next();
	System.out.println(primeiroNome);
	s = new Scanner(System.in);
	System.out.println("qual sua idade?");
	int idade = s.nextInt();
	System.out.println(idade);
	s = new Scanner(System.in);
	System.out.println("qual o nome completo da sua mãe?");
	String nomeCompletoMae = s.nextLine();
	System.out.println(nomeCompletoMae);
	}
}
