import java.util.Scanner;
import javax.swing.JOptionPane;

class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome, conceito;
		double n1, n2, n3, n4, media;
	
		try {
			/*// vers�o em console
			System.out.println("Digite seu nome");
			nome = sc.nextLine();
			
			System.out.println("Digite sua 1� nota");
			n1 = sc.nextDouble();
			
			System.out.println("Digite sua 2� nota");
			n2 = sc.nextDouble();
			
			System.out.println("Digite sua 3� nota");
			n3 = sc.nextDouble();
			
			System.out.println("Digite sua 4� nota");
			n4 = sc.nextDouble();
			*/
			
			// vers�o em JOptionPane
			nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Nome", JOptionPane.PLAIN_MESSAGE);
			n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 1� nota: ", "1� Nota", JOptionPane.PLAIN_MESSAGE));
			n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 2� nota: ", "2� Nota", JOptionPane.PLAIN_MESSAGE));
			n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 3� nota: ", "3� Nota", JOptionPane.PLAIN_MESSAGE));
			n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 1� nota: ", "4� Nota", JOptionPane.PLAIN_MESSAGE));
			
			media = (n1 + n2 + n3 + n4) / 4;
			
			if(media < 5)
			{
				conceito = "Insuficiente";
				// System.out.println(nome + " seu conceito � " + conceito + " e sua m�dia � " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito � " + conceito + " e sua m�dia � " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(media >= 5 && media < 7)
			{	
				conceito = "Regular";
				// System.out.println(nome + " seu conceito � " + conceito + " e sua m�dia � " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito � " + conceito + " e sua m�dia � " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(media >= 7 && media < 9)
			{
				conceito = "Bom";
				// System.out.println(nome + " seu conceito � " + conceito + " e sua m�dia � " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito � " + conceito + " e sua m�dia � " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(media >= 9)
			{
				conceito = "Muito Bom";
				// System.out.println(nome + ", seu conceito � " + conceito + " e sua m�dia � " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito � " + conceito + " e sua m�dia � " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}

		}
		
		catch(Exception ex)
		{
			// System.out.println("Insira um n�mero v�lido");
			JOptionPane.showMessageDialog(null,
					"Dados incorretos", "*** ERRO ***",
					JOptionPane.ERROR_MESSAGE);
		}
		
		finally
		{
			sc.close();
		}
		

	}
}
