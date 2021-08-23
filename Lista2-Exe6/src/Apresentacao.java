import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfTamanho;
	private JTextField tfValor;
	private JTextField tfPosicao;
	private VetorDeReais meuVetorObj;

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
		
		JLabel lblNewLabel = new JLabel("Qual o tamanho do vetor de reais?");
		lblNewLabel.setBounds(10, 23, 200, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfTamanho = new JTextField();
		tfTamanho.setBounds(220, 20, 39, 20);
		frame.getContentPane().add(tfTamanho);
		tfTamanho.setColumns(10);
		
		JButton btnCriar = new JButton("Criar o vetor");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meuVetorObj = new VetorDeReais(Integer.parseInt(tfTamanho.getText()));
			}
		});
		btnCriar.setBounds(279, 19, 110, 23);
		frame.getContentPane().add(btnCriar);
		
		JLabel lblNewLabel_1 = new JLabel("Valor");
		lblNewLabel_1.setBounds(10, 68, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfValor = new JTextField();
		tfValor.setBounds(63, 65, 96, 20);
		frame.getContentPane().add(tfValor);
		tfValor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Posi\u00E7\u00E3o");
		lblNewLabel_2.setBounds(190, 68, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfPosicao = new JTextField();
		tfPosicao.setBounds(233, 65, 48, 20);
		frame.getContentPane().add(tfPosicao);
		tfPosicao.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meuVetorObj.setValor(Double.parseDouble(tfValor.getText()),
									Integer.parseInt(tfPosicao.getText()));
			}
		});
		btnOK.setBounds(300, 64, 89, 23);
		frame.getContentPane().add(btnOK);
		
		JButton btnNewButton = new JButton("Quantos pares?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Quantidade de pares é "+meuVetorObj.quantosPares());
			}
		});
		btnNewButton.setBounds(10, 109, 129, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
