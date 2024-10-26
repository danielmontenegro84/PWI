package pessoas;

public class Fornecedor extends PessoaJuridica implements Comparable <Fornecedor>{

	private String endereco;
	private String telefone;
	private String email;
	
	public Fornecedor() {}
	public Fornecedor(String razaoSocial, String cnpj, String endereco, String telefone, String email) {
		super(razaoSocial, cnpj);
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int compareTo(Fornecedor o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
