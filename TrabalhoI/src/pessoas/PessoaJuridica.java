package pessoas;

import java.util.Objects;

public abstract class PessoaJuridica {

	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica() {}
	public PessoaJuridica(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cnpj, razaoSocial);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(razaoSocial, other.razaoSocial);
	}
	@Override
	public String toString() {
		return "PessoaJuridica [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}
	
}
