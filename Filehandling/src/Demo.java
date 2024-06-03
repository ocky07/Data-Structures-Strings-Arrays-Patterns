import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\91901\\Videos\\Captures\\New folder\\Hi\\rock.text");
	
	//FileInputStream i=new FileInputStream(f);
	FileWriter f1=new FileWriter("");
	f1.write("ilove mom");
	//f.delete();
	System.out.println(f.createNewFile());
	//System.out.println(f.isHidden());
	//FileReader f1=new FileReader(f);

	
}



}
