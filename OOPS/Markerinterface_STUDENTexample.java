/* 

    This java file explains Marker Interface with Serializable example ....
    
    Marker Interface : 
        Empty interface  which made on purpose(no methods, no constants)
        This is used to achieve Run-Time behaviour, Exception Handling
        It uses in-built  Java standard library  like Serializable, Cloneable, Remote, etc.,


What is Serializable ?

    Serialization is the process of conversion of the state of an object into a byte stream so that it can be saved on the disk or in a database or shared over a network



What is Deserializable?

    Deserialization is the process of converting a byte stream back into an object's state, allowing it to be saved on disk, in a database, or shared over a network.



*/


import java.io.*;    
import java.io.Serializable; 



public class Markerinterface_STUDENTexample implements Serializable{

    int id;  
	String name;  
	int marks;

	public Markerinterface_STUDENTexample(int id, String name, int marks) {  
		this.id = id;  
		this.name = name; 
		this.marks = marks; 
	}  


    public static void main(String args[]){    
		try{    
			// Serialization:
			Markerinterface_STUDENTexample s1 = new Markerinterface_STUDENTexample(1,"RAMANA", 100);    

			FileOutputStream fos = new FileOutputStream("S1_Info.txt");  

			ObjectOutputStream oos = new ObjectOutputStream(fos);    

			oos.writeObject(s1);    
			oos.flush();    
   
			oos.close();    

			System.out.println("Student Object s1 State saved in File Successfully.");    


			// Deserialization:
			FileInputStream fis = new FileInputStream("S1_Info.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);  

			Markerinterface_STUDENTexample s2 = (Markerinterface_STUDENTexample) ois.readObject();  

			System.out.println("Student Object State retrieved from File Successfully in Student Object s2.");    

			System.out.println(s2.id + " " + s2.name + " " + s2.marks);  

			ois.close();  
		}
		catch(Exception e){
			System.out.println(e);
		}    

	}   
    
}
