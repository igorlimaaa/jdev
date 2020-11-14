package br.com.ialsolucoes.executaveis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.ialsolucoes.classauxiliares.FuncAutenticar;
import br.com.ialsolucoes.classes.Aluno;
import br.com.ialsolucoes.classes.Disciplina;
import br.com.ialsolucoes.classes.Secretario;
import br.com.ialsolucoes.constantes.StatusAluno;
import br.com.ialsolucoes.interfaces.PermitirAcesso;

public class FirstCode {

	public static void main(String[] args) {

		try {

			String login = JOptionPane.showInputDialog("Informe o login:");
			String senha = JOptionPane.showInputDialog("Informe a senha:");

			PermitirAcesso permitirAcesso = new Secretario(login, senha);

			if (new FuncAutenticar(permitirAcesso).autenticarCursoJava()) {

				List<Aluno> alunos = new ArrayList<Aluno>();
				// List<Aluno> alunos = null;

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
					/*
					 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
					 * rg = JOptionPane.showInputDialog("Qual o RG do aluno?"); String cpf =
					 * JOptionPane.showInputDialog("Qual o CPF do aluno?"); String dataMatricula =
					 * JOptionPane.showInputDialog("Qual a data de matrícula do aluno?"); String
					 * nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?"); String
					 * nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?"); String
					 * serieMatriculado =
					 * JOptionPane.showInputDialog("Qual a serie em que o aluno será matriculado?");
					 * String dataNascimento =
					 * JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
					 */

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);
					/*
					 * aluno1.setIdade(Integer.valueOf(idade)); aluno1.setRegistroGeral(rg);
					 * aluno1.setCpf(cpf); aluno1.setDataMatricula(dataMatricula);
					 * aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
					 * aluno1.setAtivo(true); aluno1.setSerieMatriculado(serieMatriculado);
					 * aluno1.setDataNascimento(dataNascimento);
					 */
					for (int pos = 1; pos <= 2; pos++) {

						String nomeDisciplina = JOptionPane.showInputDialog("Informo nome da disciplina " + pos + ": ");
						String valorNota = JOptionPane.showInputDialog("Informo valor da nota " + pos + ": ");
						Disciplina disciplina = new Disciplina();

						disciplina.setDisciplinas(nomeDisciplina);
						//disciplina.setNotas(Double.valueOf(valorNota));

						aluno1.getDisciplina().add(disciplina);
					}

					int escolhe = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolhe == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {

							String disciplinaRemover = JOptionPane.showInternalInputDialog(null,
									"Qual disciplina deseja remover? 1, 2, 3, 4");
							aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar remover");
						}

					}
					alunos.add(aluno1);

				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("----------Lista de aprovados--------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out
							.println("O aluno " + aluno.getNome() + " foi aprovado com média: " + aluno.getMediaNota());
				}

				System.out.println("----------Lista de Reprovados-------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"O aluno " + aluno.getNome() + " foi reprovado com média: " + aluno.getMediaNota());
				}

				System.out.println("----------Lista de Recuperação------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"O aluno " + aluno.getNome() + " está em recuperação com média: " + aluno.getMediaNota());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não autorizado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//Esse bloco será executado se der erro ou não. Sem meio termos
			
		}
	} // aqui
}