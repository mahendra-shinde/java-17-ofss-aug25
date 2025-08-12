package demo1;

public class Main6 {

	public static void main(String[] args) {
		int [][] data2 = new int[10][];
		
		for(int i=0;i<data2.length;i++) {
			int colSize = data2.length-i;
			data2[i]=new int[colSize];
			
			System.out.println("data["+i+"] = "+colSize );
		}
	}
}
