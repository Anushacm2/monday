package javaio;
import java.io.File;


public class Listfile {
	


	     public static void main(String a[])
	     {
	        File file = new File("C:\\");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}


