package menus;

import produtos.*;
import compras.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Menu_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			  switch(montaMenu()) {
			  case 1: // cadastrar um carrinho
				  Carrinho carrinho = new Carrinho();
			  }
			  case 2: // listar todos os produtos do carrinho - menor/maior
				  Carrinho.getTotalProdutos();
				  
		public static int montaMenu() {
			String menu = "";
			for (ItensMenu item : ItensMenu.values()) {
				menu += item.getItem()+"\n";
			}
			return Integer.parseInt(JOptionPane.showInputDialog(menu));
		}
	}

}
