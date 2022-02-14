package pancha1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class operator6 {
    public static File f= new File("E:\\InfyJava\\pancha\\districts1529017.txt");

    static int del =1;
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
int pos = sb.indexOf("gpname");

if(pos == -1){
    f.delete();
    sb.delete(0,sb.length()-1);
}

      //  sb.delete(start, end)
pos = sb.indexOf("ContentPlaceHolder2_Panel1");
if(pos != -1)
sb.delete(0, pos);
int posend =sb.indexOf("</table");
if(posend ==-1){
Log(f.delete());
}
else{
sb.delete(posend, sb.length()-1);

}
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
        if(del ==1)
        System.out.println( f.delete());
    }
    private static void Log(Object string) {
        System.out.println(string);
    }
}
