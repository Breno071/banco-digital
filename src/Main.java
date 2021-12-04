import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame{
	
	public static void main(String[] args) {
		Cliente breno = new Cliente();
		breno.setNome("Breno");
		
		Conta cc = new ContaCorrente(breno, Banco.CAIXA);
		Conta poupanca = new ContaPoupanca(breno, Banco.SANTANDER);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
