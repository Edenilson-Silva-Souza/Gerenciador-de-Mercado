package Model;

import DTO.DtoUser;

public class Cliente extends Pessoa {
	
	public Cliente(DtoUser pessoa) {
		super(pessoa);
	}

	
	public void createUsuario(Pessoa person) {
		// criar um usuario cliente
	}

	
	public boolean deleteUsuario(Pessoa person) {
		// Deletar um usuario
		return false;
	}


	public Pessoa readUsuario(Pessoa pessoa) {
		//ler um Usuario 
		return null;
	}


	public void updateUsuario() {
		// atualizar um usuario cliente do sistema
		
	}


}
