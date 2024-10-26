package produtos;

import java.util.Objects;
import pessoas.*;

public class Produto {
	
	private String nome;
	private String descricao;
	private double valorUnitario;
	private Fornecedor fornecedor;
	
	public Produto() {}
	public Produto(String nome, String descricao, double valorUnitario, Fornecedor fornecedor) {
		this.nome=nome;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.fornecedor = fornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao, nome, valorUnitario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valorUnitario) == Double.doubleToLongBits(other.valorUnitario);
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", valorUnitario=" + valorUnitario + "]";
	}
}
