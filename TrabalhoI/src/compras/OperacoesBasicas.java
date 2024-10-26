package compras;

public interface OperacoesBasicas <T>{
	
	boolean cadastrar(Object obj);
	String formatar();
	int totalizar();
	boolean pesquisar(Object obj);
	boolean remover(Object obj);	
}
