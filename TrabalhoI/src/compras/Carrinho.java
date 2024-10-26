package compras;

import produtos.*;
import java.util.*;

public final class Carrinho<T> implements OperacoesBasicas<T>{
	
	private double total;
	private static int totalProdutos;
	List<Produto>produtos;

	public Carrinho() {}
	public Carrinho(double total, int totalProdutos, List<Produto>produtos) {
		this.total = total;
		this.totalProdutos = totalProdutos;
		this.produtos = produtos;
	}
	
	@Override
	public boolean cadastrar(Object obj) {
		return true;
	}
	
	@Override
	public String formatar() {
		return ;
	}
	
		
	public double calcularTotal() {
		double x;
		x =+ total;
		return x;
	}
	
	public void exibirHistorico() {
		System.out.println("total de items do carrinho: " + totalProdutos);
		System.out.println("total de itens no fechamento da compra: " + total);
		System.out.println("n° de itens descartados do carrinho: " + (totalProdutos - total));
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public static int getTotalProdutos() {
		return totalProdutos;
	}
	public static void setTotalProdutos(int totalProdutos) {
		Carrinho.totalProdutos = totalProdutos;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	@Override
	public int totalizar() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean pesquisar(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remover(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
}
