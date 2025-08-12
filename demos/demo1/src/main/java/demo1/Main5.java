package demo1;

public class Main5 {
	
	public static void main(String[] args) {
		String[] funny_messages =new String[5];
		funny_messages[0]="You'll be called to a post requiring ability in handling groups of people.";
		funny_messages[1]="You will experience a strong urge to do good; but it will pass.";
		funny_messages[2]="Q:      What do you have when you have a lawyer buried up to his neck in sand?\r\n"
				+ "A:      Not enough sand.";
		funny_messages[3]="If you stand on your head, you will get footprints in your hair.";
		funny_messages[4]="You attempt things that you do not even plan because of your extreme stupidity.";
		
		// Print all statements in REVERSE ORDER using for LOOP !
		for(int i=funny_messages.length-1; i>=0; i--) {
			System.out.println(funny_messages[i]+"\n---\n");
		}
		
		int []data[]=new int[10][]; // Array of 10 Uninitialized arrays !!!
		data[0]= new int[5];
		data[1]= new int[10];
		data[2]= new int[2];
	}

}
