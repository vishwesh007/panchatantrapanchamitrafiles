package pancha1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class operator8 {
    public static File f= new File("E:\\InfyJava\\pancha\\districts1528006.txt");

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
//writing sbr data 
sb=Op(sb);
        fileWrite(sb);
    }


    public static StringBuilder Op(StringBuilder sb) throws Exception {
int pos = sb.indexOf("href=");
int start =0;
int end=0;
int next=0;
StringBuilder sbr = new StringBuilder("");
for (int i=0;i<30;i++){
    pos = sb.indexOf("href=",end);
    end = sb.indexOf(">",pos);
    sbr.append("https://panchatantra.kar.nic.in/panchamitra/");
sbr.append(sb.substring(pos+5,end)+"\n");
next=end;

}
Log(sbr.toString());
//Log(sb.toString());
    
        return sbr;
        
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
