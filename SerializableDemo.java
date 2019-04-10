package serializable;
import java.io.*;
import java.util.*;

class SerializableDemo implements Serializable{

	String name;
	int rollNo;

	public SerializableDemo(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

   public static void main(String... ar) {

	SerializableDemo sd = new SerializableDemo("mastan",101);
   try{
	System.out.println("Serialization started....!");
	
	FileOutputStream fos = new FileOutputStream("mastan.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(sd);
	oos.close();
	
	System.out.println("Serialization ended....!");

	System.out.println("DeSerialization started....!");
	
	FileInputStream fis = new FileInputStream("mastan.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject();
	SerializableDemo sd1 = (SerializableDemo)obj;
	System.out.println(sd1.name);
	System.out.println(sd1.rollNo);
	ois.close();
	
	System.out.println("DeSerialization ended....!");
   }
   catch(FileNotFoundException fnfe) {
	fnfe.printStackTrace();
   }
   catch(IOException ioe) { 
	ioe.printStackTrace();
   }
   catch(ClassNotFoundException cnfe) {
	cnfe.printStackTrace();
  }
	
   }
}