
public class pilotoAutomatico {
	public static void main(String[] args) {
		int y = 15;
		int x = 10;
		int z = 5;
		int disA;
		int disB;
		
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
