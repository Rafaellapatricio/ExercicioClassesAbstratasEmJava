package br.com.vainaweb.backendt1.classeabstrata;

public class DevBackEnd extends Colaborador {

	public DevBackEnd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DevBackEnd(String nome, String cpf, int idade, String habilidadeTecnica, 
			String dataContratacao, String senioridade;) {
		super(nome,cpf, idade,habilidadeTecnica,dataContratacao,senioridade;);
	}

	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 2;
		
	}

	@Override
	public String visualizar() {
		
		return super.visualizar();
	}

}
