import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfTamanho;
	private JTextField tfValor;
	private JTextField tfPosicao;
	private VetorDeReais meuVetorObj,
						 outroVetorObj;

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
		frame.setBounds(100, 100, 449, 381);
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
		
		JButton btnGuardar = new JButton("Guardar vetor");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outroVetorObj = meuVetorObj;
				JOptionPane.showMessageDialog(frame, "Vetor atual foi guardado");
			}
		});
		btnGuardar.setBounds(279, 109, 110, 23);
		frame.getContentPane().add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 177, 379, 119);
		frame.getContentPane().add(scrollPane);
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VetorDeReais resultDivisao = meuVetorObj.divide(outroVetorObj);
				textArea.setText("Divisão entre os objetos de VetorDeReais\n");
				textArea.append("\nVetor A:"+meuVetorObj.exibir());
				textArea.append("\nVetor B:"+outroVetorObj.exibir());
				textArea.append("\nVetor Resultante:"+resultDivisao.exibir());
			}
		});
		btnDividir.setBounds(10, 143, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resultado = meuVetorObj.multiplica(outroVetorObj);
				textArea.setText("Multiplicação entre os objetos de VetorDeReais\n");
				textArea.append("\nVetor A:"+meuVetorObj.exibir());
				textArea.append("\nVetor B:"+outroVetorObj.exibir());
				textArea.append("\nM = "+resultado);
			}
		});
		btnMultiplicar.setBounds(121, 143, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnInverter = new JButton("Inverter");
		btnInverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Inversão do VetorDeReais\n");
				textArea.append("\nVetor original:"+meuVetorObj.exibir());
				meuVetorObj.inverte();
				textArea.append("\nVetor após inversão:"+meuVetorObj.exibir());
			}
		});
		btnInverter.setBounds(219, 143, 89, 23);
		frame.getContentPane().add(btnInverter);
		
		JButton btnDiferenca = new JButton("Diferen\u00E7a");
		btnDiferenca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Maior diferença é "+meuVetorObj.maiorDiferencaEntreConsecutivos());
				textArea.append("\nVetor :"+meuVetorObj.exibir());
			}
		});
		btnDiferenca.setBounds(318, 143, 89, 23);
		frame.getContentPane().add(btnDiferenca);
		
		
		

	}
}
