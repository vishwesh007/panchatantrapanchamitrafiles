package downloadTool;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class downloading {

private String dirPath;

private String downloadPath;

public downloading(String dirPath){
  
  this.dirPath= dirPath;
}



 

 
	public  void main(String url, String fileName) {
 downloadPath = dirPath+fileName;
		try (BufferedInputStream inputStream = new BufferedInputStream(new URL(url).openStream());
		
		
				  FileOutputStream fileOS = new FileOutputStream(downloadPath)) {
				    byte data[] = new byte[1024];
				    int byteContent;
				    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				        fileOS.write(data, 0, byteContent);
				    }
				} catch (IOException e) {
				
				
				e.getStackTrace();
				    // handles IO exceptions
				}
 
	}
 






}
