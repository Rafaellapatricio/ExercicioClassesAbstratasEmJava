package br.com.vainaweb.backendt1.classeabstrata;

public class DevFrontEnd extends Colaborador{

	private String habilidadeTecnica;
	
	
	public DevFrontEnd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DevFrontEnd(String nome, String cpf, int idade, String habilidadeTecnica, 
			String dataContratacao, String senioridade;) {
		super(nome,cpf, idade,habilidadeTecnica,dataContratacao,senioridade;);
	}

	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 0.5;
		
	}
	
	@Override
	public String visualizar() {
		return super.visualizar();
	}

}
