package dataCollectorTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;
import java.util.HashMap;
import java.util.Map.*;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
public class requestwriterv8 {

 






  String path = "/storage/emulated/0/HttpCanary/download/touchcall190/request.json";
  String bpath ="/storage/emulated/0/HttpCanary/download/touchcall190/request_body.json";


public requestwriterv8(){
  
  
  path =this.path;
  
  
}



  public static   void main(String[] args){
    
    
    requestwriterv8 s = new requestwriterv8();
    s.main();
  }

public String temp ="";
public void setTexter(String se){
  temp += se;
  System.out.println(temp);
  
}



public   void main(){




String url =url();
importer();
setTexter("public   void main(String[] args) throws Exception {\n\t\tString url = "+url+"\";\n\nHttpsURLConnection pasta = (HttpsURLConnection) new URL(url).openConnection();\n\n//pasta.setRequestMethod(\"POST\");");
        

        


mpain();
System.out.print("String urlParameters =\"");
 
    body();
  setTexter("\n");
last();
  
  
  
  
}
public   void importer(){
  
  
  
  String p="\n\n\n\nimport java.io.BufferedReader;\nimport java.io.BufferedWriter;\nimport java.io.DataOutputStream;\nimport java.io.File;\nimport java.io.FileNotFoundException;\nimport java.io.InputStreamReader;\nimport java.net.URL;\nimport java.net.URL;\nimport java.util.*;\nimport java.util.HashMap;\nimport java.util.Map.*;\nimport java.util.Scanner;\nimport javax.net.ssl.HttpsURLConnection;\nimport javax.net.ssl.HttpsURLConnection;\n\n";
  
  
  setTexter(p);
  
  
}



public   void last(){
  
  
  String last ="\npasta.setDoOutput(true);\n        try (DataOutputStream wr = new DataOutputStream(pasta.getOutputStream())) {\n           wr.writeBytes(urlParameters);\n            wr.flush();\n        }\n\n        int responseCode = pasta.getResponseCode();\n        setTexter(\"Sending 'POST' request to URL : \" + url);\n        setTexter(\"Post parameters : \" + urlParameters);\n        setTexter(\"Response Code : \" + responseCode);\n\n        try (BufferedReader in = new BufferedReader(\n                new InputStreamReader(pasta.getInputStream()))) {\n\n            String line;\n            StringBuilder response = new StringBuilder();\n\n            while ((line = in.readLine()) != null) {\n                response.append(line);\n            }\n\n            //print result\n            setTexter(response.toString());\n\n        }}";
  
  
  
  
  setTexter(last);
  
  
  
  
}







public   String body(){


String msg1 ="";
try{
  File f = new File(bpath);
  Scanner read = new Scanner(f);
  while (read.hasNextLine()){
    String data = read.nextLine();
    msg1 = msg1+data+"\\n";
   // setTexter(msg1);
    }
    
    read.close();
  }catch(FileNotFoundException e){
     
    setTexter("\";");
    
    
  }

  
//  String msg1=" hi\" Hi bay school \" bye\" hi \"sasta baccha\" hi lol\"";

if(msg1.length() > 2){
int n=0,o=0,p=0,ze=0;


String msg2 ="";
 n= msg1.indexOf("\"",o);
 
 if(n != -1){
 msg2 = msg2+msg1.substring(0,n);

}else {
  
  msg2 = msg2+msg1;
}
while((n|o) != (-1| msg1.length())){
 n= msg1.indexOf("\"",o);
 o = msg1.indexOf("\"",n+1);
//setTexter(n+""+o);



if((n|o)!=-1){
msg2 = msg2+("\\");
msg2 = msg2+msg1.substring(n,o);

}
if((n |o) == -1){
if(ze<1){
msg2 = msg2+("\\");
// msg2 = msg2+msg1.substring(p,msg1.length());
 int q = msg1.lastIndexOf("\"");
 
 msg2 = msg2+msg1.substring(q);
 ze++;
  }
}

o=n+1;

p=o;
}


//msg2 = msg2+msg1.substring(p);

//tailored temporary fix
String msg3 ="";




  System.out.print(msg2+"\";");
String msg4= msg3+"\\\"}\"";
  }
  return msg1;
  
  
}








public    String url(){



  String message ="";
try{
  File f = new File(path);
  Scanner read = new Scanner(f);
  while (read.hasNextLine()){
    String data = read.nextLine();
    message = message+data;
    }
    
    read.close();
  }catch(FileNotFoundException e){
     
    setTexter("file not found exception");
    
    e.printStackTrace();
  }
  
  
  
 int m = message.indexOf("url\":");
 int n = message.indexOf("\"",m+5);
 int o = message.indexOf("\"",n+1);
 String s = message.substring(n,o);
 
 
 return s;
 
  
  
  
}













public    HashMap<String,String> mpain(){
  
 
  HashMap<String,String> property = new HashMap<String,String>();
  
  
 String message ="";
try{
  File f = new File(path);
  Scanner read = new Scanner(f);
  while (read.hasNextLine()){
    String data = read.nextLine();
    message = message+data;
    }
    
    read.close();
  }catch(FileNotFoundException e){
     
    setTexter("file not found exception");
    
    e.printStackTrace();
  }
 // setTexter(message);
  
  
  property = header(message);
  
  
    
  Iterator it = property.entrySet().iterator();
         while(it.hasNext()) {
            Map.Entry obj = (Entry)it.next();
            System.out.print("pasta.setRequestProperty(\""+obj.getKey()+"\",\"");
            setTexter(obj.getValue()+"\");");
}
    
  
  return property;
  
  
}





public   HashMap<String,String> header(String message){
  int m,n=0,o=0,p=0,q =0;
   m  = message.indexOf("headers\":");
   
  // setTexter(m);
  HashMap<String,String> property = new HashMap<String,String>();
 if (m != -1){
 
 m=m+9;
   while ((m |n|o|p|q) < message.length()){
   n  =message.indexOf("\"",m+1);
   
//   setTexter(n);
   if (n != -1){
   
   o  =message.indexOf("\":",n+1);
//   setTexter(o);
   
   if (o != -1){
   
   p  =message.indexOf("\"",o+1);
   
 //  setTexter(p);
   if (p != -1){
   
   q  =message.indexOf("\"",p+1);
  // setTexter(q);
   
   if ((p|q|n|o) != -1){
   
  String HeaderKey = message.substring(n+1,o);
  String HeaderValue = message.substring(p+1,q);
  
  property.put(HeaderKey,HeaderValue);
  
  ///setTexter(HeaderKey);
  
  
  }
  m=q+1;
  }
  }
  }
  }
   
 }

  
  return property;
  
  
}










}


