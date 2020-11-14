package br.com.ialsolucoes.executaveis;

import javax.swing.JOptionPane;

import br.com.ialsolucoes.classes.Aluno;
import br.com.ialsolucoes.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		/*
		 * String posicoes =
		 * JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		 * 
		 * double[] notas = new double[Integer.valueOf(posicoes)];
		 * 
		 * for (int pos = 0; pos < notas.length; pos ++) { String valor =
		 * JOptionPane.showInputDialog("Qual o valor da posição " + (pos + 1) + ": ");
		 * notas[pos] = Double.valueOf(valor); }
		 * 
		 * for (int i = 0; i<notas.length; i++) { System.out.println(notas[i]); }
		 */

		Aluno aluno = new Aluno();
		aluno.setNome("Igor");
		aluno.setNomeEscola("CSE");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplinas("JAVA");

		double[] notas = { 7.0, 6.0, 5.0, 8.0 };

		disciplina.setNotas(notas);

		aluno.getDisciplina().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplinas("LPOO");

		double[] notas2 = { 3.0, 4.5, 9.0, 10.0 };

		disciplina2.setNotas(notas2);

		aluno.getDisciplina().add(disciplina2);
		
		/*
		for (Disciplina d : aluno.getDisciplina()) {
			System.out.println("Nome da disciplina: " + d.getDisciplinas());
			for (int i = 0; i < d.getNotas().length; i++) {
				System.out.println("A nota " + (i + 1) + " é: " + d.getNotas()[i]);
			}
			System.out.println("A média do aluno é: " + d.getMediaNotas());
			System.out.println("O " + aluno.getAlunoAprovado() + " na disciplina de " + d.getDisciplinas());
			System.out.println("A maior nota do aluno foi: " + d.getMaiorNota());
			System.out.println("A menor nota do aluno foi: " + d.getMenorNota());
		}
		System.out.println("-----------------------------");
		
		System.out.println("O aluno " + aluno.getNome() + " da escola " + aluno.getNomeEscola() + " está inscrito em "
				+ aluno.getDisciplina().size() + " disciplinas.");

		System.out.println(aluno.getDisciplina().get(0).getDisciplinas());
		for (int i = 0; i < aluno.getDisciplina().get(0).getNotas().length; i++) {
			System.out.println("A nota " + (i + 1) + " é: " + aluno.getDisciplina().get(0).getNotas()[i]);
		}
		// System.out.println(aluno.getDisciplina().get(0).getNotas().toString());
		System.out.println(aluno.getDisciplina().get(0).getMediaNotas());

		System.out.println("-----------------------------");
		System.out.println(aluno.getDisciplina().get(1).getDisciplinas());
		System.out.println(aluno.getDisciplina().get(1).getNotas().toString());
		System.out.println(aluno.getDisciplina().get(1).getMediaNotas());
		*/
		//-----------------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		arrayAlunos[0] = aluno;
		for (int i = 0; i < arrayAlunos.length; i++) {
			System.out.println("O nome do aluno é: " + arrayAlunos[i].getNome());
			for(Disciplina d : arrayAlunos[i].getDisciplina()) {
				System.out.println("O nome da disciplina é: " + d.getDisciplinas());
				for(int x = 0; x< d.getNotas().length; x++) {
					System.out.println("A nota " + (x+1) + " da disciplina " + d.getDisciplinas() + " é: " + d.getNotas()[x]);
				}
			}
		}
		
		
		
		
		

	}

}
