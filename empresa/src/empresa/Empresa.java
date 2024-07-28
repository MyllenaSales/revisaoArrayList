package empresa;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private String telefone;
	
	public Empresa() {
		
	}
	
	public Empresa (String nome, String cnpj, String telefone) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "Empresa [nome: " + nome + ", cnpj: " + cnpj + ", telefone: " + telefone + "]";
	}
	
	
}
