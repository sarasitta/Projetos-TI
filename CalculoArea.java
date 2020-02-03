import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculoArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double Larg, Compr, Area, Preco;
		
		try {			
			Compr = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Digite o COMPRIMENTO do cômodo: ", 
					"LARGURA", 
					JOptionPane.PLAIN_MESSAGE));
			
			Larg = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"Digite a LARGURA do cômodo: ", 
					"LARGURA", 
					JOptionPane.PLAIN_MESSAGE));

			
			Area = Larg * Compr;
			Preco = Area * 45;
			
			JOptionPane.showMessageDialog(null, 
					"O preço para cobrir o piso é R$" + Preco);
		}
		
		catch(Exception erro)
		{
			JOptionPane.showMessageDialog(null,
					"Os dados estão incorretos. Tente novamente.", 
					"ERRO DE LEITURA",
					JOptionPane.ERROR_MESSAGE);
		}
		
		finally
		{
			sc.close();
		}
		
	}

}
