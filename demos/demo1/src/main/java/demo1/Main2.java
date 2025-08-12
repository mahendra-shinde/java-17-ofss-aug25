package demo1;

public class Main2 {

	public static void main(String[] args) {
		{
			int i = 10;        // Implicit Type casting (Type promotion)
			byte n = (byte)i;	// Explicit Type casting 
			System.out.println("INNER BLOCK1 i = "+i);
		}
		{
			int i = 15;
			System.out.println("INNER BLOCK2 i = "+i);
		}
		int i=23;
		System.out.println("OUTER BLOCK i = "+i);
	}
}
