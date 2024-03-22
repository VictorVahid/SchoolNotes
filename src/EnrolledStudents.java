public class EnrolledStudents {
	/* Atributos */
	public String Nome;
	public float Matricula;
	public float Nota1;
	public float Nota2;
	public float Trabalho;
	public double QtdProvaFinal;


	/*Métodos*/
	public double Media() {
		double media = (Nota1 * 2.5 + Nota2 * 2.5 + Trabalho * 2) / 5;
		if (media >10) return media = 10;
		return media;
	}

	public double ProvaFinal() {
		if (Media() < 5.0) {
			QtdProvaFinal = (5 - Media());
			return QtdProvaFinal;
		} else
			return QtdProvaFinal = 0.0;
	}

	/*Construtor*/
	public EnrolledStudents() {
		Nome = Nome;
		Matricula = Matricula;
		Nota1 = Nota1;
		Nota2 = Nota2;
		Trabalho = Trabalho;
		QtdProvaFinal = QtdProvaFinal;
	}

	/*Get/set*/
	public String getNome() {
		return Nome;
	}

	public float getMatricula() {
		return Matricula;
	}

	public float getNota1() {
		return Nota1;
	}

	public float getNota2() {
		return Nota2;
	}

	public float getTrabalho() {
		return Trabalho;
	}

	public double getQtdProvaFinal() {
		return QtdProvaFinal;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
