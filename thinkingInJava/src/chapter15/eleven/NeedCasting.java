package chapter15.eleven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class NeedCasting {

	public void f(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(args[0]));
		List<Widget> shapes=(List<Widget>)in.readObject();
	}
	
}
