package javaio;
import java.io.File;
import java.io.FilenameFilter;

public class Test {
	
	    public static void main(String[] args) {
	        File file = new File("C:\\Program Files (x86)\\Lenovo\\LenovoNow\\x86");

	        // Filter files that end with ".py"
	        String[] fList = file.list(new FilenameFilter() {
	            @Override
	            public boolean accept(File dir, String name) {
	                if (name.toLowerCase().endsWith(".dll")) {
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });

	        // Print the filtered file names
	        for (String f : fList) {
	            System.out.println(f);
	        }
	    }
	}


