import java.util.Scanner;
import javax.swing.JOptionPane;

class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome, conceito;
		double n1, n2, n3, n4, media;
	
		try {
			/*// versão em console
			System.out.println("Digite seu nome");
			nome = sc.nextLine();
			
			System.out.println("Digite sua 1ª nota");
			n1 = sc.nextDouble();
			
			System.out.println("Digite sua 2ª nota");
			n2 = sc.nextDouble();
			
			System.out.println("Digite sua 3ª nota");
			n3 = sc.nextDouble();
			
			System.out.println("Digite sua 4ª nota");
			n4 = sc.nextDouble();
			*/
			
			// versão em JOptionPane
			nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Nome", JOptionPane.PLAIN_MESSAGE);
			n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 1ª nota: ", "1ª Nota", JOptionPane.PLAIN_MESSAGE));
			n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 2ª nota: ", "2ª Nota", JOptionPane.PLAIN_MESSAGE));
			n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 3ª nota: ", "3ª Nota", JOptionPane.PLAIN_MESSAGE));
			n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 1ª nota: ", "4ª Nota", JOptionPane.PLAIN_MESSAGE));
			
			media = (n1 + n2 + n3 + n4) / 4;
			
			if(media < 5)
			{
				conceito = "Insuficiente";
				// System.out.println(nome + " seu conceito é " + conceito + " e sua média é " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito é " + conceito + " e sua média é " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(media >= 5 && media < 7)
			{	
				conceito = "Regular";
				// System.out.println(nome + " seu conceito é " + conceito + " e sua média é " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito é " + conceito + " e sua média é " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(media >= 7 && media < 9)
			{
				conceito = "Bom";
				// System.out.println(nome + " seu conceito é " + conceito + " e sua média é " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito é " + conceito + " e sua média é " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(media >= 9)
			{
				conceito = "Muito Bom";
				// System.out.println(nome + ", seu conceito é " + conceito + " e sua média é " + media);
				JOptionPane.showMessageDialog(null, nome + " seu conceito é " + conceito + " e sua média é " + media, conceito, JOptionPane.INFORMATION_MESSAGE);
			}

		}
		
		catch(Exception ex)
		{
			// System.out.println("Insira um número válido");
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
