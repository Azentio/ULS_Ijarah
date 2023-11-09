package tests;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		String path="C:\\Users\\ININDC00076\\Downloads";
		 File file= new File(path);
		 File[] listOfFiles = file.listFiles();
		 for(File lOF:listOfFiles)
		 {
			 System.out.println("File Name : "+lOF.getName());
			 if(lOF.getName().contains("RETADV_RET"))
			 {
				 lOF.delete();
				 System.out.println("File Dleted");
			 }
		 }

	}

}
