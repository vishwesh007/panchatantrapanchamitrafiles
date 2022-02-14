package pancha1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class districtwisetalukaGenertor2 {
   public static File f= new File("E:\\InfyJava\\pancha\\districts1516.txt");
    public static void main(String[] args)throws Exception{

FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
String line="";

//StringBuilder sb2 = new StringBuilder("table table tab;a >table <table table table table table");
StringBuilder sb = new StringBuilder(line);
while((line=br.readLine()) != null){
   sb.append(line+"\n");
}

       
//Log(sb.toString());
Op(sb);
        fileWrite(sb);
    }


    public static StringBuilder Op(StringBuilder sb) throws Exception {
int pos = sb.indexOf("table");
      //  sb.delete(start, end)
pos = sb.indexOf("<td align=\"left\"><a href=MainMenu.aspx");
sb.delete(0, pos);
int posend =sb.indexOf("</table");
if(posend != -1)
sb.delete(posend, sb.length()-1);
Log(pos);
Log(sb.toString());
    
        return sb;
        
    }

    public static void fileWrite(StringBuilder sb)throws Exception{

        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        fw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static void Log(Object string) {
        System.out.println(string);
    }
}
