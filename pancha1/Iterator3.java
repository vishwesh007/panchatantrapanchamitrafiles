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
public class Iterator3 {
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

      public static String main() throws Exception {

        File file2 = new File("E:\\InfyJava\\pancha\\districts"+distcode+".txt");
        districtwisetalukaGenertor2.f=file2;
        districtwisetalukaGenertor2.main(null);

          return null;
      }




}
