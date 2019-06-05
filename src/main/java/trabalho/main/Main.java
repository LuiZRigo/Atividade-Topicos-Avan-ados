package trabalho.main;

import java.io.File;

import trabalho.conversor.ConversorXML;
import trabalho.model.Aluno;
import trabalho.model.Disciplina;
import trabalho.model.Turma;

public class Main {

	public static void main(String[] args) {

		ConversorXML<Turma> conversor = new ConversorXML<>(Turma.class);
		int n = 2;
		double[] v = new double[n];
		int i;
		Turma turma = conversor.gerarObj(new File("exercicio.xml"));
		Double soma = 0.0;
		for (Aluno aluno : turma.getAlunos().getAlunos()) {
			System.out.println("Aluno: " + aluno.getNome());
			for (Disciplina disciplina : aluno.getDisciplinas().getDisciplina()) {
				for (i = 0; i < n; i++) {
					v[i] = disciplina.getNota();
					soma = soma + v[i];

				}
				System.out.println("Notas: " + soma);
			}

		}

	}

}
