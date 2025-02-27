package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import VIEW.TelaADM;
import VIEW.TelaLogin;
import VIEW.TelaNovaContaADM;
import VIEW.TelaNovoFornecedor;

public class OuvinteADM implements ActionListener, MouseListener, WindowListener, Ouvinte {
	private Ouvinte frame;
	private Ouvinte ouvinteBnt;

	/**
	 * 
	 * @param telaPraAbrir: Use esse parametro para abrir a próxima tela
	 * @param frame:        use esse parametro para fechar a tela atual
	 */
	public OuvinteADM(Ouvinte telaPraAbrir, Ouvinte frame) {
		this.frame = frame;
		ouvinteBnt = telaPraAbrir;
	}

	public void actionPerformed(ActionEvent e) {
		JFrame frame = (JFrame) this.frame;

		if (frame instanceof TelaLogin) {
			//Não entendi muito bem. Pode fazer essa parte para acessar os dados do xml?
			
			if(e.getActionCommand().equals("Acessar")) {
				TelaLogin frameTela = (TelaLogin) frame;
				String email = frameTela.getInpEmail().getText();
				String senha = frameTela.getInpSenha().getText();
				
				if(email.equals("User") && senha.equals("123")) {
					frame.dispose();
					Ouvinte t = new TelaADM();
					t.desenharTela();
					System.out.println("Bem-Vindo ADM");
				}else {
					System.out.println("Senha incorreta");
				}
			}
			
		} else if (frame instanceof TelaNovaContaADM) {
					frame.dispose();
			
				if(e.getActionCommand().equals("<< Voltar")) {
					Ouvinte t = new TelaLogin();
					t.desenharTela();
				}
				else if(e.getActionCommand().equals("Cadastrar >>")) {
					Ouvinte t = new TelaLogin();
					t.desenharTela();

					TelaNovaContaADM frameTela = (TelaNovaContaADM) frame;
					String nome = frameTela.getInpNome().getText();
					String email = frameTela.getInpEmail().getText();
					String senha = frameTela.getInpSenha().getText();
					
					System.out.println(nome);
					System.out.println(email);
					System.out.println(senha);
				}
				
			
		} else if (ouvinteBnt instanceof TelaLogin) {

			 Ouvinte t = new TelaLogin();
			 t.desenharTela();
		}
		else if (frame instanceof TelaNovoFornecedor) {
			
			if(e.getActionCommand().equals("Cadastrar")) {
				TelaNovoFornecedor frameTela = (TelaNovoFornecedor) frame;
				String nome = frameTela.getInpNome().getText();
				String Telefone = frameTela.getInpTelefone().getText();
				String cnpj = frameTela.getInpCNPJ().getText();
				String cidade = frameTela.getInpCidade().getText();
				String horaFunci = (String) frameTela.getInpHorarioFuncionamento().getSelectedItem();
				String descri = frameTela.getInpDescricao().getText();
				System.out.println(horaFunci);
				System.out.println(descri);
			}
			
			
		}
		else if(frame instanceof TelaADM) {
			
			if(e.getActionCommand().equals("Novo Fornecedor")) {
				frame.dispose();
				 Ouvinte t = new TelaNovoFornecedor();
				 t.desenharTela();
			}
			
		}
		
		

	}

	public void mouseClicked(MouseEvent e) {
		JFrame frame = (JFrame) this.frame;

		if (ouvinteBnt instanceof TelaNovaContaADM) {
			
				TelaLogin frameTela = (TelaLogin) frame;
				frameTela.dispose();
				
				Ouvinte t = new TelaNovaContaADM();
				t.desenharTela();
				
			}
			else if(e.getSource().equals("Cadastrar >>")) {
				//Ouvinte t = new TelaADM();
				//t.desenharTela();
				//frame.dispose();
			}
			
		}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {

		int escolha = JOptionPane.showConfirmDialog((JFrame) frame, "Voltar para a tela de Login?", "Fechar Janela",
				JOptionPane.YES_NO_OPTION);

		if (escolha == JOptionPane.YES_OPTION) {
			JFrame frame = (JFrame) this.frame;
			frame.dispose();

			TelaLogin t = new TelaLogin();
			t.desenharTela();
		}

	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public Ouvinte getOuvinteBnt() {
		return ouvinteBnt;
	}

	public void desenharTela() {

	}
}
