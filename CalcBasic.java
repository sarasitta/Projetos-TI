import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalcBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, n2, resul;
		String operador;
		
		try 
		{
			/*
			System.out.print("Digite um n�mero: ");
			n1 = sc.nextDouble();
			
			System.out.print("Digite outro n�mero: ");
			n2 = sc.nextDouble();
			
			System.out.print("Digite a opera��o mate�tica desejada: ");
			operador = sc.next();
			*/
			
			n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um n�mero: ", "1� N�mero", JOptionPane.PLAIN_MESSAGE));
			n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro n�mero: ", "2� N�mero", JOptionPane.PLAIN_MESSAGE));
			operador = JOptionPane.showInputDialog(null, "Digite a opera��o matem�tica desejada: ", "Operador", JOptionPane.PLAIN_MESSAGE);
			
			if(operador.equals("+"))
			{
				resul = n1 + n2;
				//System.out.println(n1 + " " + operador + " " + n2 + " = " + resul);
				JOptionPane.showMessageDialog(null, n1 + " " + operador + " " + n2 + " = " + resul, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(operador.equals("-"))
			{
				resul = n1 - n2;
				//System.out.println(n1 + " " + operador + " " + n2 + " = " + resul);
				JOptionPane.showMessageDialog(null, n1 + " " + operador + " " + n2 + " = " + resul, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(operador.equals("/"))
			{
				if(n2 != 0)
				{
					resul = n1 / n2;
					//System.out.println(n1 + " " + operador + " " + n2 + " = " + resul);
					JOptionPane.showMessageDialog(null, n1 + " " + operador + " " + n2 + " = " + resul, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				}
				
				else {
					//System.out.println("N�o pode dividir um n�mero por 0");
					JOptionPane.showMessageDialog(null, "N�o pode dividir um n�mero por 0", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
			if (operador.equals("*") || operador.equals("x") || operador.equals("X"))
			{
				resul = n1 * n2;
				//System.out.println(n1 + " " + operador + " " + n2 + " = " + resul);
				JOptionPane.showMessageDialog(null, n1 + " " + operador + " " + n2 + " = " + resul, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
			
			else 
			{
				//System.out.println("Digite um operador v�lido");
				JOptionPane.showMessageDialog(null, "Digite um operador v�lido", "Erro", JOptionPane.ERROR_MESSAGE);
			}			
			
		}
		
		catch(Exception erro)
		{
			//System.out.println(erro.getMessage());
			JOptionPane.showMessageDialog(null, erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
		finally
		{
			sc.close();
		}
		
		
	}

}
