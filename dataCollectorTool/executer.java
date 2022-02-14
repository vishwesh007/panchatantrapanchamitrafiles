package dataCollectorTool;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URL;
import java.util.*;
import java.util.HashMap;
import java.util.Map.*;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.HttpsURLConnection;
import dataCollectorTool.*;
public class executer {
public static  String msg = "";
public static String path="";



  public static void main() throws Exception {
  
 String url = requestwriterv6v2.url();
url = url.substring(1,url.length());
HttpsURLConnection pasta = (HttpsURLConnection) new URL(url).openConnection();

//pasta.setRequestMethod("POST");
HashMap <String,String> setProp = requestwriterv6v2.mpain();
Iterator it = setProp.entrySet().iterator();

while(it.hasNext()){
  Map.Entry obj = (Entry) it.next();
  pasta.setRequestProperty(obj.getKey().toString(),obj.getValue().toString());
  
}



String urlParameters =requestwriterv6v2.body();


pasta.setDoOutput(true);
        try (DataOutputStream wr = new DataOutputStream(pasta.getOutputStream())) {
           wr.writeBytes(urlParameters);
            wr.flush();
        }

        int responseCode = pasta.getResponseCode();
        System.out.println("Sending' request to URL : " + url);
        msg += "Sending ' request to URL : " + url;
        System.out.println("\n parameters : " + urlParameters);
        
        msg +="\n parameters : " + urlParameters;
        System.out.println("Response Code : " + responseCode);
msg += "Response Code : " + responseCode;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(pasta.getInputStream()))) {

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            //print result
            System.out.println(response.toString());
            
            msg += response.toString()+"\n";

        }catch (Exception e){
        
        msg += "\nfileNotFound\n";
        }
 
 

  }

}
