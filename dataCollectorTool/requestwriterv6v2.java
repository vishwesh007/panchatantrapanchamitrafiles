package dataCollectorTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;
import java.util.HashMap;
import java.util.Map.*;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;

public class requestwriterv6v2 {


static String dirName ="setcalling";
public static String Main ="/storage/emulated/0/HttpCanary/download/"+dirName+"/";

public static String outputforbin ="";
  static String path = Main+"request.json";
  static String bpath =
      Main+"request_body.json";
static String bin =
      Main+"request_body.bin";
  static StringBuilder b;
  public static String msg = "";
  
  static  String in ="";
static int flagByte =0;
  public  requestwriterv6v2() {

    b = new StringBuilder("\n");
    path = this.path;
    int zaa = path.indexOf("request.json");
    bpath = path.substring(0, zaa) + "request_body.json";
    
    
    
  }
  
public static   String outputFileName="";

public static void binPatch(){

log("binpatch");
if (flagByte == 1){
  
  String compare ="urlParameters =";
  int pos =sb.indexOf(compare);
  int length = compare.length();
  if(pos != -1){
    
    sb.insert(pos+length,outputforbin);
    
  }
  
}
  
  
}

  public static void FileGeneration() {
  
  //helper for autonamer
  int helper1 = Main.lastIndexOf("/");
  int helper2 = Main.lastIndexOf("/",helper1-1);
  //check for values
//  System.out.println(helper1 +" " +helper2);

//final file name
String fileNamer =Main+Main.substring(helper2,helper1)+".java";


    File f =
        new File(fileNamer);
    try {

      if (!f.exists()) {

        try {
          f.createNewFile();

          System.out.println(f.exists());
        } catch (IOException e) {
          System.out.println(e);
        }

      } else {

        System.out.println("file was created eariler");
      }

      FileWriter fw = new FileWriter(f);

    //  fw.append(msg); //this code creates error of overlapping
    fw.write(msg);
//System.out.println(msg);
System.out.println("#+#+#()"+outputforbin+"output for bin");
sb.insert(sb.length(),outputforbin);
System.out.println(sb.toString());
      fw.flush();
      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
  
 static  StringBuilder sb = new StringBuilder();

  public static void Println1(String s) {
  // System.out.println(s);

    msg = msg + s + "\n";
    
    sb.append(s+"\n");
  }

  public static void println2(String s) {
   System.out.print(s);

    msg = msg + s;
    sb.append(s);
  }

  public static void main(String[] args) {

    main();
   System.out.print(msg);
  // FileGeneration();
  
  }

  public static void main() {
//System.out.print(Main);
    String url = url();
    importer();
    Println1(
        "public static void main(String[] args) throws Exception {\n\t\tString url = "
            + url
            + "\";\n\nHttpsURLConnection pasta = (HttpsURLConnection) new URL(url).openConnection();\n\n//pasta.setRequestMethod(\"POST\");");

    mpain();
    

  in=  body();
    Println1("\n");
    last();
    
    //System.out.println ("#########"+outputforbin+"output for bin in main");
    FileGeneration();
    
   // System.out.println(msg);
  }



  public static void importer() {
  int helper1 = Main.lastIndexOf("/");
  int helper2 = Main.lastIndexOf("/",helper1-1);
outputFileName = Main.substring(helper2+1,helper1);
    String p =
        "package pack;\n\n\n\nimport java.io.BufferedReader;\nimport java.net.HttpURLConnection;\nimport java.io.BufferedWriter;\nimport java.io.DataOutputStream;\nimport java.io.File;\nimport java.io.FileNotFoundException;\nimport java.io.InputStreamReader;\nimport java.net.URL;\nimport java.net.URL;\nimport java.util.*;\nimport java.util.HashMap;\nimport java.util.Map.*;\nimport java.util.Scanner;\nimport javax.net.ssl.HttpsURLConnection;\nimport javax.net.ssl.HttpsURLConnection;\nimport java.util.zip.*;\n\n\n\n public class "+outputFileName+"{\n\n";

    Println1(p);
  }

  public static void last() {
  String substitute ="";
if(flagByte ==1){
  substitute ="wr.write(urlParameters,0,urlParameters.length)";
  
  
}else if(flagByte == 0){
  
  substitute ="wr.writeBytes(urlParameters)";
  
}

    String last =
        "\npasta.setDoOutput(true);\n        try (DataOutputStream wr = new DataOutputStream(pasta.getOutputStream())) {\n    "+substitute+"       ;\n            wr.flush();\n        }\n\n        int responseCode = pasta.getResponseCode();\n        System.out.println(\"Sending 'POST' request to URL : \" + url);\n        System.out.println(\"Post parameters : \" + urlParameters);\n        System.out.println(\"Response Code : \" + responseCode);\n\n        InputStreamReader st = null;\n        if((\"gzip\".equals(pasta.getContentEncoding()))){\n      st=  new InputStreamReader(new GZIPInputStream(pasta.getInputStream()));\n        }else{\n          \n        st=  new InputStreamReader(pasta.getInputStream());\n          \n        }\n\n\n\n        try (BufferedReader in = new BufferedReader(st)) {\n\n            String line;\n            StringBuilder response = new StringBuilder();\n\n            while ((line = in.readLine()) != null) {\n                response.append(line);\n            }\n\n            //print result\n            System.out.println(response.toString());\n\n        }}\n}";

    Println1(last);
  }
  
  
  

  public static String body() {

    String msg1 = "";
    try {
    flagByte =0;
      File f = new File(bpath);
      Scanner read = new Scanner(f);
     // #chnge
      println2("String urlParameters =\"");
      while (read.hasNextLine()) {
        String data = read.nextLine();
        msg1 = msg1 + data;
        // Println1(msg1);
      }

      read.close();
    } catch (FileNotFoundException e) {
System.out.println("not found");
try {
  System.out.println("trying bin");
 // #change
  flagByte =1;
 println2("byte[] urlParameters ="+ByteArr(bin));
 //System.out.print(ByteArr(bin)+"####(#+##check)");
//  outputforbin = ByteArr(bin);
//System.out.println(outputforbin);
 Println1(outputforbin+";");
 in =outputforbin;
 
    if(flagByte != 1){
      
      Println1("\";");
      
    }
    
    return outputforbin;
    
  
}catch (Exception ex){
System.out.println("trying bin fail");
//ex.printStackTrace();
  Println1("\";");
}
      
    }

    //  String msg1=" hi\" Hi bay school \" bye\" hi \"sasta baccha\" hi lol\"";

    if (msg1.length() > 2) {
      int n = 0, o = 0, p = 0, ze = 0;

      String msg2 = "";
      n = msg1.indexOf("\"", o);
      if (n != -1) {
        msg2 = msg2 + msg1.substring(0, n);
      }
      while ((n | o) != (-1 | msg1.length())) {
        n = msg1.indexOf("\"", o);
        o = msg1.indexOf("\"", n + 1);
        // System.out.println(n+""+o);

        if ((n | o) != -1) {
          msg2 = msg2 + ("\\");
          msg2 = msg2 + msg1.substring(n, o);
        }
        if ((n | o) == -1) {
          if (ze < 1) {
            msg2 = msg2 + ("\\");
            // msg2 = msg2+msg1.substring(p,msg1.length());
            int q = msg1.lastIndexOf("\"");

            msg2 = msg2 + msg1.substring(q);
            ze++;
          }
        }

        o = n + 1;

        p = o;
      }

      // msg2 = msg2+msg1.substring(p);

      // tailored temporary fix
      String msg3 = "";

      println2(msg2 + "\";");
      String msg4 = msg3 + "\\\"}\"";
    }
    return msg1;
  }
static void p(Object o){
  
  
  System.out.println(o.toString());
}

public  static String ByteArr(String bpath){

    try{
    

String s=  fileOut(bpath);
// pe(s);
    return s;} catch (Exception e){
      
      System.out.println("Exception");
    }
    
    return "{}";
    
  }
    
  
  
  public static String fileOut(String bpath)throws Exception{
    
  StringBuilder  helper = new StringBuilder();
    
Path path = Paths.get(bpath);
      byte[] data = Files.readAllBytes(path);
    helper.append("{");
     for(int i =0;i<data.length;i++){
       helper.append(data[i]+",");
       // System.out.println(data[i]+"=>"+(char)data[i]);
      }
      helper.append(data[data.length-1]+"");
    helper.append("}");
    
    return  helper.toString();
  }



  public static String url() {

    String message = "";
    try {
      File f = new File(path);
      Scanner read = new Scanner(f);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        message = message + data;
      }

      read.close();
    } catch (FileNotFoundException e) {

      Println1("file not found exception");

      e.printStackTrace();
    }

    int m = message.indexOf("url\":");
    int n = message.indexOf("\"", m + 5);
    int o = message.indexOf("\"", n + 1);
    String s = message.substring(n, o);

    return s;
  }

  public static HashMap<String, String> mpain() {

    HashMap<String, String> property = new HashMap<String, String>();

    String message = "";
    try {
      File f = new File(path);
      Scanner read = new Scanner(f);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        message = message + data;
      }

      read.close();
    } catch (FileNotFoundException e) {

      Println1("file not found exception");

      e.printStackTrace();
    }
    // System.out.println(message);

    property = header(message);

    Iterator it = property.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry obj = (Entry) it.next();
      println2("pasta.setRequestProperty(\"" + obj.getKey() + "\",\"");
      Println1(obj.getValue() + "\");");
    }

    return property;
  }

  public static HashMap<String, String> header(String message) {
    int m, n = 0, o = 0, p = 0, q = 0;
    m = message.indexOf("headers\":");

    // System.out.println(m);
    HashMap<String, String> property = new HashMap<String, String>();
    if (m != -1) {

      m = m + 9;
      while ((m | n | o | p | q) < message.length()) {
        n = message.indexOf("\"", m + 1);

        //   System.out.println(n);
        if (n != -1) {

          o = message.indexOf("\":", n + 1);
          //   System.out.println(o);

          if (o != -1) {

            p = message.indexOf("\"", o + 1);

            //  System.out.println(p);
            if (p != -1) {

              q = message.indexOf("\"", p + 1);
              // System.out.println(q);

              if ((p | q | n | o) != -1) {

                String HeaderKey = message.substring(n + 1, o);
                String HeaderValue = message.substring(p + 1, q);

                property.put(HeaderKey, HeaderValue);

                // /System.out.println(HeaderKey);

              }
              m = q + 1;
            }
          }
        }
      }
    }

    return property;
  }
  
  
  public static void log(String s){
    
    System.out.println(s);
    
    
  }
}
