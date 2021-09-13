import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfUF;
	private JTextField tfRendaAnual;
	private JTextField tfValorConsulta;
	private HashMap<String, Contribuinte> contribuintes = new HashMap<>();
	private JTextField tfCPFConsulta;

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
				contribuintes.put(c.getCpf(), c);
				JOptionPane.showMessageDialog(null, "Contribuinte cadastrado pagar� R$" + imposto);
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
				
				for (Contribuinte c: contribuintes.values()) {
					if (c.calcularImposto() >= valor) {
						String str = "Contribuinte " + c.getNome() + "\nCPF:" + c.getCpf()
								+ "\nEstado:" + c.getUf() + "\nRenda: "
								+ c.getRendaAnual() + "\nImposto:" + c.calcularImposto();
						// mostrar
						JOptionPane.showMessageDialog(null, str);
					}
				}
			}
		});
		btnNewButton.setBounds(282, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_5 = new JLabel("CPF a consultar:");
		lblNewLabel_5.setBounds(10, 225, 96, 14);
		frame.getContentPane().add(lblNewLabel_5);

		tfCPFConsulta = new JTextField();
		tfCPFConsulta.setBounds(116, 222, 96, 20);
		frame.getContentPane().add(tfCPFConsulta);
		tfCPFConsulta.setColumns(10);

		JButton btnConsultaCPF = new JButton("Consultar CPF");
		btnConsultaCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte contribPesquisado = contribuintes.get(tfCPFConsulta.getText());
				String str;
				
				if (contribPesquisado == null) {
					str = "CPF n�o localizado";
				} else {
					str = "Contribuinte " + contribPesquisado.getNome() + "\nCPF:" + contribPesquisado.getCpf()
							+ "\nEstado:" + contribPesquisado.getUf() + "\nRenda: " + contribPesquisado.getRendaAnual()
							+ "\nImposto:" + contribPesquisado.calcularImposto();
				}
				JOptionPane.showMessageDialog(null, str);
			}
		});
		btnConsultaCPF.setBounds(232, 221, 114, 23);
		frame.getContentPane().add(btnConsultaCPF);
		
		JButton btnEstados = new JButton("% dos estados");
		btnEstados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totSC, totPR, totRS, totGeral;
				totSC = totPR = totRS = totGeral = 0;
				
				for (Contribuinte contrib: contribuintes.values()) {
					double imposto = contrib.calcularImposto();
					totGeral += imposto;
					if (contrib.getUf().equals("SC")) {
						totSC += imposto;
					}
					else if (contrib.getUf().equals("PR")) {
						totPR += imposto;
					}
					else if (contrib.getUf().equals("RS")) {
						totRS += imposto;
					}
				}
				String str = "Participa��o % dos estados\n";
				str += "\nSC = "+totSC+" = "+(totSC/totGeral*100)+"%";
				str += "\nRS = "+totRS+" = "+(totRS/totGeral*100)+"%";
				str += "\nPR = "+totPR+" = "+(totPR/totGeral*100)+"%";
				str += "\nTotal geral = "+totGeral;
				JOptionPane.showMessageDialog(frame,str);
			}
		});
		btnEstados.setBounds(249, 146, 122, 23);
		frame.getContentPane().add(btnEstados);
	}
}
