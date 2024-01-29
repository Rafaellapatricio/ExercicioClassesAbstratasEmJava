package br.com.vainaweb.backendt1.classeabstrata;

public class Designer extends Colaborador {

	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Designer(String nome, String cpf, int idade, String habilidadeTecnica, 
			String dataContratacao, String senioridade;) {
		super(nome,cpf, idade,habilidadeTecnica,dataContratacao,senioridade;);
	}
	
	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 0.1;
		
	}
	
	@Override
	public String visualizar() {
		// TODO Auto-generated method stub
		return super.visualizar();
	}

}
