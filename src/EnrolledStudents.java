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
		return (Nota1 * 2.5 + Nota2 * 2.5 + Trabalho * 2) /7;
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

	}

	/*Get/set*/
	public String getNome() {
		return Nome;
	}

	public float getMatricula() {
		return Matricula;
	}




}
