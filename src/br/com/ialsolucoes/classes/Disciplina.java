package br.com.ialsolucoes.classes;

import java.util.Arrays;

public class Disciplina {

	private double[] notas = new double[4];
	String Disciplinas;

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getDisciplinas() {
		return Disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		Disciplinas = disciplinas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Disciplinas == null) ? 0 : Disciplinas.hashCode());
		result = prime * result + Arrays.hashCode(notas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (Disciplinas == null) {
			if (other.Disciplinas != null)
				return false;
		} else if (!Disciplinas.equals(other.Disciplinas))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [notas=" + notas + ", Disciplinas=" + Disciplinas + "]";
	}

	public double getMediaNotas() {

		double somaNotas = 0.0;

		for (int i = 0; i < notas.length; i++) {
			somaNotas = somaNotas + notas[i];
		}

		return somaNotas / notas.length;

	}

	public double getMaiorNota() {
		double maiorNota = 0.0;

		for (int i = 0; i < notas.length; i++) {
			if(maiorNota < notas[i]) {
				maiorNota = notas[i];
			}
		}
		return maiorNota;
	}
	
	public double getMenorNota() {
		double menorNota = 10.0;
		
		for (int i = 0; i < notas.length; i++) {
			if(menorNota > notas[i]) {
				menorNota = notas[i];
			}
		}
		
		return menorNota;
	}

}
