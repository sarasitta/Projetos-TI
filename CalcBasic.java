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
			System.out.print("Digite um número: ");
			n1 = sc.nextDouble();
			
			System.out.print("Digite outro número: ");
			n2 = sc.nextDouble();
			
			System.out.print("Digite a operação mateática desejada: ");
			operador = sc.next();
			*/
			
			n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: ", "1º Número", JOptionPane.PLAIN_MESSAGE));
			n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro número: ", "2º Número", JOptionPane.PLAIN_MESSAGE));
			operador = JOptionPane.showInputDialog(null, "Digite a operação matemática desejada: ", "Operador", JOptionPane.PLAIN_MESSAGE);
			
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
					//System.out.println("Não pode dividir um número por 0");
					JOptionPane.showMessageDialog(null, "Não pode dividir um número por 0", "Erro", JOptionPane.ERROR_MESSAGE);
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
				//System.out.println("Digite um operador válido");
				JOptionPane.showMessageDialog(null, "Digite um operador válido", "Erro", JOptionPane.ERROR_MESSAGE);
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
