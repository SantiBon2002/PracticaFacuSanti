package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class jfrmInicio extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfrmInicio frame = new jfrmInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jfrmInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 411);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("ABM");
		mnCliente.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Buscar");
		mnCliente.add(mntmNewMenuItem_2);
		
		JMenu mnVenta = new JMenu("Venta");
		menuBar.add(mnVenta);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("ABM");
		mnVenta.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Buscar");
		mnVenta.add(mntmNewMenuItem_3);
		
		JMenu mnProducto = new JMenu("Producto");
		menuBar.add(mnProducto);
	}
}
