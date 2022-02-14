package pancha1.FileSupplier;
import java.io.*;

public class FileSupplier {



 public static StringBuilder fileRead(String filepath){

File f = new File(filepath);
StringBuilder sb = new StringBuilder("");

try {
    FileReader fr= new FileReader(filepath);
    String st="";
    BufferedReader br = new BufferedReader(fr);

    while((st=br.readLine()) != null){
        sb.append(st+"\n");
    }
} catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
try {
    f.createNewFile();
} catch (IOException e1) {
    // TODO Auto-generated catch block
    e1.printStackTrace();
}

}
    return sb;

    
 }   

public static void write(String FilePath,StringBuilder sb){

try {
    FileWriter fw= new FileWriter(FilePath);

    fw.write(sb.toString());
    fw.flush();
    fw.close();
} catch (FileNotFoundException e) {
    String dirPath = FilePath.substring(0,FilePath.indexOf("\\"));
    File fs=new File(dirPath);
    fs.mkdirs();
    File fs2=new File(FilePath);
    try {
        fs2.createNewFile();
    } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
    try {
        append(FilePath,sb);
    } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
    // TODO Auto-generated catch block
    e.printStackTrace();
}catch(Exception e){
}

}

public static void append(String FilePath,StringBuilder sb) throws IOException{
    StringBuilder data=fileRead(FilePath);
    data.append(sb.toString());
    try {
        FileWriter fw= new FileWriter(FilePath);
    


        fw.append(data.toString());
        fw.flush();
        fw.close();
    } catch (FileNotFoundException e) {
        String dirPath = FilePath.substring(0,FilePath.indexOf("\\"));
        File fs=new File(dirPath);
        fs.mkdirs();
        File fs2=new File(FilePath);
        fs2.createNewFile();
        append(FilePath,sb);
        // TODO Auto-generated catch block
        e.printStackTrace();
    }catch(Exception e){

    }
    
    }


}
