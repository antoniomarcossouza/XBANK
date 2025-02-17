package ufjf.dcc025.trabalho.view;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.model.BankAccount;
import ufjf.dcc025.trabalho.model.ClientPf;
import ufjf.dcc025.trabalho.model.ClientPj;
import ufjf.dcc025.trabalho.model.User;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */
public class login extends javax.swing.JFrame {

	public login() {
		initComponents();
	}

	public void close() {
		WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jPassword = new javax.swing.JPasswordField();
		jTextEmail = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(140, 92, 242));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("XBANK");

		jButton1.setBackground(new java.awt.Color(140, 92, 242));
		jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jButton1.setForeground(new java.awt.Color(240, 240, 240));
		jButton1.setText("Entrar");
		jButton1.setBorderPainted(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel3.setText("Email");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel2.setText("Senha");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(140, 92, 242));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel4.setText("Abrir conta PF");
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(140, 92, 242));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel5.setText("Abrir conta PJ");
		jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel5MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								layout.createSequentialGroup().addGap(60, 60, 60)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(29, 29, 29)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 215,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 215,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 126, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel4,
										javax.swing.GroupLayout.PREFERRED_SIZE, 122,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(56, 56, 56)
				.addComponent(
						jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(130, 130, 130)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(33, 33, 33)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(78, 78, 78)
				.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
				.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(2, 2, 2).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		String line = new String();
		String fileName = "clients.txt";
		File file = new File(fileName);
		boolean login = false;
		boolean pf = false;

		String email = jTextEmail.getText();
		String password = jPassword.getText();

		User userPF = new ClientPf();
		User userPJ = new ClientPj();

		if (file.exists()) {
			try {
				FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferFile = new BufferedReader(fileReader);

				while (true) {
					line = bufferFile.readLine();
					if (line == null) {
						break;
					}

					if (line.startsWith("Email: ") && email.equals(line.substring(7))) {
						login = true;
						userPF.setEmail(email);
						userPJ.setEmail(email);
					}

					if (line.equals("Tipo: PF"))
						pf = true;

					if (login == true) {
						if (line.startsWith("Nome: ")) {
							userPF.setName(line.substring(6));
							userPJ.setName(line.substring(6));
						}
						if (line.equals("Acesso: ADMINISTRATOR")) {
							userPF.setAccess(User.accessType.ADMINISTRATOR);
							userPJ.setAccess(User.accessType.ADMINISTRATOR);
						}
						if (line.equals("Acesso: EMPLOYEE")) {
							userPF.setAccess(User.accessType.EMPLOYEE);
							userPJ.setAccess(User.accessType.ADMINISTRATOR);
						}
						if (line.equals("Acesso: USER")) {
							userPF.setAccess(User.accessType.USER);
							userPJ.setAccess(User.accessType.ADMINISTRATOR);
						}
						if (line.startsWith("Senha: ")) {
							userPF.setPassword(line.substring(7));
							if (password.equals(line.substring(7))) {
								close();
								if (pf == true) {
									BankAccount bank = new BankAccount(userPF, null);
									bank.getBankAcount(userPF);
									index menu = new index(bank);
									menu.setVisible(true);
								} else {
									BankAccount bank = new BankAccount(userPJ, null);
									bank.getBankAcount(userPJ);
									index menu = new index(bank);
									menu.setVisible(true);
								}

								return;
							} else {
								JOptionPane.showMessageDialog(null, "Email/Senha incorreto");
								return;
							}
						}
					}
				}
			} catch (Exception e) {
			}
		}
		JOptionPane.showMessageDialog(null, "Este usuario n�o existe.");
	}

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
		close();
		registerPF menu = new registerPF();
		menu.setVisible(true);
	}

	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
		close();
		registerPJ menu = new registerPJ();
		menu.setVisible(true);
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPasswordField jPassword;
	private javax.swing.JTextField jTextEmail;
}
