package downloadTool;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

private String url;
private String path;


public void Main(String url,String downloadpath){
  
  
  this.url = url;
  this.path = downloadpath;
  
}


public static void main (String[] args){
  
  String parent ="/storage/emulated/0/JavaNIDE/dump/";
  downloading d = new downloading (parent);
  //https://doc-08-60-docs.googleusercontent.com/docs/securesc/f6rj167onoklu4he83713gr3l6osj359/j7t7l5c0706hgqg0rnt6b189cqq617t3/1597986300000/10905081979715115279/11318367635809310999Z/1q3DVyNFJp7ta6fCbQNfhJQ3fh32NlvWJ?e=download
  
  //https://drive.google.com/file/d/1q3DVyNFJp7ta6fCbQNfhJQ3fh32NlvWJ/view''
  
  String url = "https://drive.google.com/file/d/1q3DVyNFJp7ta6fCbQNfhJQ3fh32NlvWJ/view?usp=drivesdk";
  
  String filename = "3.pdf";
  
  
  d.main(url,filename);
  
}



}