import java.util.Locale;
import java.util.Scanner;

public class TestStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		EnrolledStudents Students = new EnrolledStudents();
		System.out.println("Digite a sua matricula: ");
		Students.Matricula = sc.nextFloat();
		System.out.println("Nome: ");
		Students.Nome = sc.next();
		System.out.println("Digite sua nota da N1: ");
		Students.Nota1 = sc.nextFloat();
		System.out.println("Digite sua nota da N2: ");
		Students.Nota2 = sc.nextFloat();
		System.out.println("Digite sua nota do Trabalho: ");
		Students.Trabalho = sc.nextFloat();

		System.out.println("O aluno da matricula: " + Students.getMatricula());
		System.out.println("Nome: " + Students.getNome());
		System.out.printf("Media Final: %.2f%n", Students.Media());
		System.out.printf("Quantidade para Prova Final: %.2f%n", Students.ProvaFinal());
		sc.close();
	}
}
