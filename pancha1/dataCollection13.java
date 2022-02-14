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
public class dataCollection13 {
  
    
  
    
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

             //iteratiing districts
             distcode = temp;
             
             try{

              //setting district
    MultiOp11.distcode=distcode;
    for(int i=0;i<1;i++)
    {

      //setting taluka
      MultiOp11.specialString="";
      if(i<10)
      MultiOp11.specialString="00"+i;
      else
      MultiOp11.specialString="0"+i;
       MultiOp11.main(null);
      
       DataCleaning12helper.main(null);

    }
  
     
     
             }catch(Exception e){
     
              
             }
           }
    
        }
    public static void log(Object o){
      System.out.println(o.toString());
    }
   
    
}
