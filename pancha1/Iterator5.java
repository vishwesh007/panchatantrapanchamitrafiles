package pancha1;
///this iterator extracts talukas and get extensions

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
    public class Iterator5 {
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
           for( int i = 1 ; i<10;i++){
            requestwriter4.url="https://panchatantra.kar.nic.in/panchamitra/displayDistTal.aspx?context=talukaMap&distCode="+distcode+"&talCode="+distcode+"00"+i;
           String response= requestwriter4.main(); 
            File f = new File("E:\\InfyJava\\pancha\\districts"+distcode+"00"+i+".txt");
            FileWriter fw = new FileWriter(f);
            //BufferedWriter bw = new BufferedWriter(fw);
            fw.write(response);
fw.close();
        }for( int i = 10 ; i<20;i++){
            try{
            requestwriter4.url="https://panchatantra.kar.nic.in/panchamitra/displayDistTal.aspx?context=talukaMap&distCode="+distcode+"&talCode="+distcode+"00"+i;
           String response= requestwriter4.main(); 
            File f = new File("E:\\InfyJava\\pancha\\districts"+distcode+"0"+i+".txt");
            FileWriter fw = new FileWriter(f);
            //BufferedWriter bw = new BufferedWriter(fw);
            fw.write(response);
fw.close();
            }catch(Exception e){

            }
        }
            
           

           ///https://panchatantra.kar.nic.in/panchamitra/MainMenu.aspx?gp=1506005005&gpname=KODAMBAL
           
    return null;
              
          }
      
}
