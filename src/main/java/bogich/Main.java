package bogich;

import java.io.File;
import java.net.URL;

public class Main {

	URL fnUrl = Main.class.getResource("csaladnevek.txt");
	File familyName = new File(fnUrl.getFile());

	URL menUrl = Main.class.getResource("ferfinevek.txt");
	File menNames = new File(menUrl.getFile());

	URL womenUrl = Main.class.getResource("noiinevek.txt");
	File womenNames = new File(womenUrl.getFile());
	
	public static void main(String[] args) {

		

		
	}

}
