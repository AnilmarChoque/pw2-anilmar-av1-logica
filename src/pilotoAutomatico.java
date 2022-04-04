import java.util.Scanner;

public class pilotoAutomatico {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int disA;
		int disB;
		System.out.println("Informe a posição do veiculo Y: ");
		int y = ler.nextInt();
		
		System.out.println("Informe a posição do veiculo X: ");
		int x = ler.nextInt();
		
		System.out.println("Informe a posição do veiculo Z: ");
		int z = ler.nextInt();

		
		disA = y - x;
		disB = z - y;
		
		if(disA > disB)
		{
			System.out.println("DIMINUIR");
		}
		else if(disA < disB)
		{
			System.out.println("AUMENTAR");
		}
		else
		{
			System.out.println("MANTER");
		}
		
	}
	
}
