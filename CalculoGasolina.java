import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculoGasolina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double KM, Valor;
		
		try 
		{
			KM = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Quilômetros percorridos: ", 
				"QUILÔMETRAGEM", 
				JOptionPane.PLAIN_MESSAGE));
			
			Valor = KM / 8.5;
			
			JOptionPane.showMessageDialog(null, 
				"Valor gasto com combustível: " + Valor + " litros.", 
				"VALOR GASTO", 
				JOptionPane.INFORMATION_MESSAGE);
		}
		
		catch(Exception erro)
		{
			JOptionPane.showMessageDialog(null, 
					"Erro na leitura dos dados. Tente novamente.", 
					"ERRO DE LEITURA", 
					JOptionPane.ERROR_MESSAGE);
		}
		
		finally
		{
			sc.close();
		}
		
	}

}
