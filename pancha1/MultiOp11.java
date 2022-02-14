package pancha1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MultiOp11 {

    //open file of distcode
public static String distcode= "1507";
//taluka code
public static String specialString="009";
//write to a file
static File f = new File("E:\\InfyJava\\pancha1\\districts"+distcode+specialString+".txt");
public static void main(String[] args){

try {
    //generate urls
    UrlGen();
   DataCleaning12helper.main(null);
} catch (Exception e) {
//dont catch exceptions
    e.printStackTrace();
}


}
public static void Filewriter(StringBuilder sb){
//write it to dedicated file
File fe = new File("E:\\InfyJava\\pancha1\\#districts"+distcode+specialString+"members.txt");
try {
    FileWriter fw = new FileWriter(fe);
    fw.write(sb.toString());
    fw.flush();
    fw.close();
} catch (IOException e) {

    e.printStackTrace();
}


}

    public static void UrlGen() throws Exception{
        try {
            FileReader fr= new FileReader(f);
String url= "";
           BufferedReader br= new BufferedReader(fr);
            
StringBuilder sb= new StringBuilder();

              try {
                while((url=br.readLine())!= null){
CookieCheck10.url=url;
sb.append(url);
log(CookieCheck10.url);
sb.append(CookieCheck10.url);
sb.append("\n"+ CookieCheck10.main() +"\n");
                  }
                  Filewriter(sb);
            } catch (IOException e) {
              
            sb.append("error");
            Filewriter(sb);
            }
      

        } catch (FileNotFoundException e) {
       
            e.printStackTrace();
        }
        
     }


    private static void log(String url) {
        System.out.println(url);
    }


}
