package Model;



import DTO.DtoUser;

public abstract class Pessoa{
	private String nome;
	private String cpf;
	private String cnpj;
	private String senha;
	private String email;
	private String telefone;
	private String nascimento;
	private Sexo sexo;
	
	public Pessoa(DtoUser pessoa) {
		this.cpf = getCpf();
		this.sexo = getSexo();	
		this.nome = getNome();
		this.cnpj = getCnpj();
		this.email = getEmail();
		this.senha = getSenha();
		this.telefone = getTelefone();
		this.nascimento = getNascimento();
	}
	
	public Pessoa() {
		
	}
	public abstract void criarUser(Pessoa user);
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	
	}
			
}
