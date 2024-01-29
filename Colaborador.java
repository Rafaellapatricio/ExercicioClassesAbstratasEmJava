package br.com.vainaweb.backendt1.classeabstrata;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private int idade;
	private boolean isAtivo = true;
	private double salario;
	private String habilidadeTecnica; // refatorado
	private String dataContratacao; 
	private String senioridade; 

	
	/*
	 * Número de matricula dos Colaboradores, Gênero, Data de Contratação, FGTS,
	 * 13° Salário (Caso CLT), Modelo de contratação (CLT ou PJ), 
	 * Cálculos como Vale transporte, alimentação e refeição e a 
	 * Senioridade (Estágio, Junior Pleno, Sênior).*/
	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, int idade, String habilidadeTecnica, 
			String dataContratacao, String senioridade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.habilidadeTecnica= habilidadeTecnica;
		this.dataContratacao=dataContratacao;
		this.senioridade=senioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isAtivo() {

		return isAtivo;
	}

//	public void setAtivo(boolean isAtivo) {
//		this.isAtivo = isAtivo;
//	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}

	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	

	// Métodos
	public String visualizar() {
		return "[ " + this.nome + ", " + this.idade + " ]" + "\n CPF: " + this.cpf 
				+ "\nEstá ativo ?: " + this.isAtivo + "\nHabilidades Tecnicas: " + this.habilidadeTecnica
				+ "\nData de Contratação: " + this.dataContratacao + "\nSenioridade: " + this.senioridade;
	}
	
	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deseja desvincular " + this.nome + " da empresa ?");
		Character resposta = sc.next().charAt(0);
		Character.toLowerCase(resposta);
		
		if (resposta.equals('s')) {
			System.out.println(this.nome + " está demitido(a)");
			this.isAtivo = false;
		}
		sc.close();
	}

	public abstract void receberAumento(double porcentagem);

}
