package pancha1;

    import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;
import java.util.HashMap;
import java.util.Map.*;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URL;
import java.util.*;
import java.util.HashMap;
import java.util.Map.*;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.util.zip.*;

import javax.net.ssl.HttpsURLConnection;

public class requestwriter4 {

    static String distcode ="1506";
    public static void main(String[] args) throws Exception{
   Tester();

    }

    public static void Tester()throws Exception{

      File f = new File("E:\\InfyJava\\pancha\\districts.txt");
      FileReader fr = new FileReader(f);
    
       BufferedReader bReader= new BufferedReader(fr);
 
       String temp ="";
   
       while((temp=bReader.readLine()) != null){
         System.out.println(temp);
         distcode = temp;
         
         try{

main();
 
 
         }catch(Exception e){
 
          
         }
       }

    }
public static void log(Object o){
  System.out.println(o.toString());
}
public static String url = "https://panchatantra.kar.nic.in/panchamitra/displayDistTal.aspx?context=districtMap&distCode="+distcode+"&talCode=";
  
    public static String main() throws Exception {
              log(url);
    HttpsURLConnection pasta = (HttpsURLConnection) new URL(url).openConnection();
    
    //pasta.setRequestMethod("POST");
    pasta.setRequestProperty("Cookie","ASP.NET_SessionId =34diuy5zzofcjmpyt2mluubs");
    pasta.setRequestProperty("remoteIp","164.100.80.171");
    pasta.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q =0.9,image/avif,image/webp,image/apng,*/*;q =0.8,application/signed-exchange;v =b3;q =0.9");
    pasta.setRequestProperty("method","GET");
    pasta.setRequestProperty("Connection","keep-alive");
    pasta.setRequestProperty("User-Agent","Mozilla/5.0 (Linux; Android 10; POCO F1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.87 Mobile Safari/537.36");
    pasta.setRequestProperty("Referer","https://panchatantra.kar.nic.in/panchamitra/MainMenu.aspx?tk =1506001 &tkname =AURAD");
    pasta.setRequestProperty("remotePort","sessionId");
    pasta.setRequestProperty("Sec-Fetch-Site","none");
    pasta.setRequestProperty("Sec-Fetch-Dest","document");
    pasta.setRequestProperty("Host","panchatantra.kar.nic.in");
    pasta.setRequestProperty("Accept-Encoding","gzip, deflate");
    pasta.setRequestProperty("Sec-Fetch-Mode","navigate");
    pasta.setRequestProperty("protocol","HTTP/1.1");
    pasta.setRequestProperty("Upgrade-Insecure-Requests","1");
    pasta.setRequestProperty("x-requested-with","com.duckduckgo.mobile.android");
    pasta.setRequestProperty("Sec-Fetch-User","?1");
    pasta.setRequestProperty("Accept-Language","en,en-IN;q =0.9,en-US;q =0.8");
    byte[] urlParameters ={};
    
    
    
    pasta.setDoOutput(true);
            try (DataOutputStream wr = new DataOutputStream(pasta.getOutputStream())) {
        wr.write(urlParameters,0,urlParameters.length)       ;
                wr.flush();
            }
    
            int responseCode = pasta.getResponseCode();
            System.out.println("Sending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);
    
            InputStreamReader st = null;
            if(("gzip".equals(pasta.getContentEncoding()))){
          st=  new InputStreamReader(new GZIPInputStream(pasta.getInputStream()));
            }else{
              
            st=  new InputStreamReader(pasta.getInputStream());
              
            }
    
    
    
            try (BufferedReader in = new BufferedReader(st)) {
    
                String line;
                StringBuilder response = new StringBuilder();
                File file2 = new File("E:\\InfyJava\\pancha\\districts"+distcode+".txt");
                FileWriter fileWriter = new FileWriter(file2);
                BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
                
                while ((line = in.readLine()) != null) {
                    response.append(line+"\n");
                    bufferWriter.write(line+"\n");
                    bufferWriter.flush();
                }
    bufferWriter.close();
                //print result
                System.out.println(response.toString());
                return response.toString();
               

    
            }}
    

}
