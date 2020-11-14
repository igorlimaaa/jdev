package br.com.ialsolucoes.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.ialsolucoes.constantes.StatusAluno;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String serieMatriculado;
	private String nomeEscola;
	Boolean ativo;
	
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}
	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas = somaNotas + disciplina.getMediaNotas(); 
		} 
		
		return somaNotas / disciplinas.size();
	}
	
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 5.0) {
			if(media >=7.0) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}
	
	public Aluno() {
		
	}
	
	public Aluno(String nomeAluno) {
		nome = nomeAluno;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula="
				+ dataMatricula + ", serieMatriculado=" + serieMatriculado + ", ativo=" + ativo + ", disciplinas="
				+ disciplinas + "]";
	}
	
	


	
}
