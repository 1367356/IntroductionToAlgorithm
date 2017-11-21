package chapter15.eleven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ClassCasting {

	public void f(String[] args) throws Exception{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(args[0]));
		List<Widget> lw2=List.class.cast(in.readObject());
	}
}
