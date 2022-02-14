package pancha1;


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

public class CookieCheck10 {

public static void main(String args[]) throws Exception{
    main();
}
    
    //you should get members here

    public static String url= "https://panchatantra.kar.nic.in/panchamitra/MainMenu.aspx?gp=1506002016&gpname=BETGERA";
    
    public static String main() throws Exception {
          //  String url = "https://panchatantra.kar.nic.in/panchamitra/MainMenu.aspx?gp=1506002016&gpname=BETGERA";
    //https://panchatantra.kar.nic.in/panchamitra/MainMenu.aspx?gp=1506002027&gpname=ALGUD
    //https://panchatantra.kar.nic.in/panchamitra/MainMenu.aspx?gp=1506002016&gpname=BETGERA
    HttpsURLConnection pasta = (HttpsURLConnection) new URL(url).openConnection();
    

    pasta.setRequestProperty("Cookie","ASP.NET_SessionId=34diuy5zzofcjmpyt2mluubs");
    pasta.setRequestProperty("remoteIp","164.100.80.171");
    pasta.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    pasta.setRequestProperty("method","GET");
    pasta.setRequestProperty("Connection","keep-alive");
    pasta.setRequestProperty("User-Agent","Mozilla/5.0 (Linux; Android 10; POCO F1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.87 Mobile Safari/537.36");
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
    pasta.setRequestProperty("Accept-Language","en,en-IN;q=0.9,en-US;q=0.8");
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
    
                while ((line = in.readLine()) != null) {
                    response.append(line+"\n");
                }
    
                //print result
                System.out.println(response.toString());
               return main2();
    
            }}



            public static String main2() throws Exception {
                String url = "https://panchatantra.kar.nic.in/panchamitra/getGPData.aspx?selOption=2";
        
        HttpsURLConnection pasta = (HttpsURLConnection) new URL(url).openConnection();
        
        //pasta.setRequestMethod("POST");
        pasta.setRequestProperty("Cookie","ASP.NET_SessionId=34diuy5zzofcjmpyt2mluubs");
        pasta.setRequestProperty("remoteIp","164.100.80.171");
        pasta.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        pasta.setRequestProperty("method","GET");
        pasta.setRequestProperty("Connection","keep-alive");
        pasta.setRequestProperty("User-Agent","Mozilla/5.0 (Linux; Android 10; POCO F1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.87 Mobile Safari/537.36");
        pasta.setRequestProperty("remotePort","sessionId");
        pasta.setRequestProperty("Sec-Fetch-Site","none");
        pasta.setRequestProperty("Sec-Fetch-Dest","document");
        pasta.setRequestProperty("Host","panchatantra.kar.nic.in");
        pasta.setRequestProperty("Accept-Encoding","gzip, deflate");
        pasta.setRequestProperty("url","https://panchatantra.kar.nic.in/panchamitra/MainMenu.aspx?gp=1506002003&gpname=%E0%B2%98%E0%B3%8B%E0%B2%9F%E0%B2%BE%E0%B2%B3%E0%B2%BE");
        pasta.setRequestProperty("Sec-Fetch-Mode","navigate");
        pasta.setRequestProperty("protocol","HTTP/1.1");
        pasta.setRequestProperty("Upgrade-Insecure-Requests","1");
        pasta.setRequestProperty("x-requested-with","com.duckduckgo.mobile.android");
     
        pasta.setRequestProperty("Sec-Fetch-User","?1");
        pasta.setRequestProperty("Accept-Language","en,en-IN;q=0.9,en-US;q=0.8");
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
        
                    while ((line = in.readLine()) != null) {
                        response.append(line+"\n");
                    }
        
                    //print result
                    System.out.println(response.toString());
                    return response.toString();
        
                }}
    }
    
    

