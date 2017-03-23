class Helloworld{
	static void main(String[] args){
		new File("test.txt").eachLine{
			line ->println "$line"; 
		}
		new File("test.txt").withWriter('utf-8'){
			writer -> writer.writeLine("line 4");
		}
		File file = new File("test.txt");
		file.append('Line 5');
		//println(file.txt);
		println(file.length());
		println(file.isFile());
		println(file.isDirectory());
		
		def newFile = new File("test2.txt");
		newFile << file.text;
		
		newFile.delete();
		
		def dirFiles = new File("").listRoots();
		dirFiles.each{
			item -> println file.absolutePath;
		}
	}

}