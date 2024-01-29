package br.com.vainaweb.backendt1.classeabstrata;

public class Gerente extends Colaborador {

	private String habilidadeTecnica;
	
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Gerente(String nome, String cpf, int idade, String habilidadeTecnica, 
			String dataContratacao, String senioridade) {
		
		super(nome,cpf, idade,habilidadeTecnica,dataContratacao,senioridade;);
	}
	
	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 4;		
	}
	
	@Override
	public String visualizar() {
		
		return super.visualizar();
	}

}
