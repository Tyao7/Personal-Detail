package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
public static void main(String[] args) throws Exception {
	FileReader r1=null;
	FileWriter w1=null;
	r1 = new FileReader("E:\\Eclipse-java\\LogicalPrograme\\src\\Logic\\StarPyramid.java");
	w1 =new FileWriter("E:\\Eclipse-java\\LogicalPrograme\\src\\Logic\\TanzeeelPy.java");
	int i ;
	while((i=r1.read())!=-1) {
		w1.write(i);
	}
	System.out.println("hey tanzeel");
	r1.close();
	w1.close();
}
}
