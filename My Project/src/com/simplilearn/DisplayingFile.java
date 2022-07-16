package com.simplilearn;
import java.io.File;
public class DisplayingFile extends CreateFile{

	void DisplayFiles(){

		File Fl=new File(path);
		File Fi[]=Fl.listFiles();
		if(Fi.length==0) {
			System.out.println("Repository is Empty");
		}
		else {

		for(File Fm : Fi) {


			System.out.println(Fm.getName());
			}
	}
	}

}
