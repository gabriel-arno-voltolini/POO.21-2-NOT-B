import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfUF;
	private JTextField tfRendaAnual;
	private JTextField tfValorConsulta;
	private Contribuinte[] contribuintes = new Contribuinte[100];
	private int indice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setBounds(128, 11, 193, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(128, 42, 96, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 14, 122, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 45, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estado:");
		lblNewLabel_2.setBounds(10, 70, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Renda anual: R$");
		lblNewLabel_3.setBounds(10, 100, 96, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfUF = new JTextField();
		tfUF.setBounds(128, 67, 28, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		tfRendaAnual = new JTextField();
		tfRendaAnual.setBounds(128, 97, 96, 20);
		frame.getContentPane().add(tfRendaAnual);
		tfRendaAnual.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte c = new Contribuinte();
				c.setNome(tfNome.getText());
				c.setCpf(tfCPF.getText());
				c.setUf(tfUF.getText());
				c.setRendaAnual(Double.parseDouble(tfRendaAnual.getText()));
				double imposto = c.calcularImposto();
				contribuintes[indice] = c;
				indice++;
				JOptionPane.showMessageDialog(null, "Contribuinte cadastrado pagará R$"+imposto);
			}
		});
		btnCalcular.setBounds(299, 96, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		JLabel lblNewLabel_4 = new JLabel("Valor do imposto a consultar: R$");
		lblNewLabel_4.setBounds(10, 188, 185, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfValorConsulta = new JTextField();
		tfValorConsulta.setBounds(176, 185, 96, 20);
		frame.getContentPane().add(tfValorConsulta);
		tfValorConsulta.setColumns(10);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(tfValorConsulta.getText());
				for (int i=0; i < indice; i++) {
					if (contribuintes[i].calcularImposto() >= valor) {
						String str = "Contribuinte "+contribuintes[i].getNome()
									+ "\nCPF:"+contribuintes[i].getCpf()
									+ "\nEstado:"+contribuintes[i].getUf()
									+ "\nRenda: "+contribuintes[i].getRendaAnual()
									+ "\nImposto:"+contribuintes[i].calcularImposto();
						// mostrar
						JOptionPane.showMessageDialog(null, str);
					}
				}
			}
		});
		btnNewButton.setBounds(282, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
