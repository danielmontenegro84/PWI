package menus;

public enum ItensMenu {
	
	CC(1, "Cadastrar Carrinho"),
	LISTPRODASC(2, "Listar Produtos do Carrinho"),
	LISTNOMEPROD(3, "Listar Produtos pelo Nome"),
	REMPROD(4, "Remove Produtos do Carrinho"),
	HIST(5, "Mostrar Histórico"),
	SAIR(6, "Sair");
	
	private int codigo;
	private String descricao;
	
	ItensMenu(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
