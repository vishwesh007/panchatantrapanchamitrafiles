package dataCollectorTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;
import java.util.HashMap;
import java.util.Map.*;
import java.util.Scanner;

import java.io.*;

import javax.net.ssl.HttpsURLConnection;

public class requestwriterv6 {

public  static String path = "E:\\java_playground\\canary\\request.json";
public  static String bpath =
      "E:\\java_playground\\canary\\request_body.bin";

  static StringBuilder b;
 public  static String msg = "";

  public requestwriterv6(String path) {

    b = new StringBuilder("\n");
    path = this.path;
    int zaa = path.indexOf("request.json");
    bpath = path.substring(0, zaa) + "request_body.json";
  }
public static void clearMsg(){
  
  msg="";
  
}
  public static void FileGeneration() {

    File f =
        new File("E:\\java_playground\\canary\\by.java");
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

      fw.append(msg);

      fw.flush();
      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void Println1(String s) {
    // System.out.println(s);

    msg = msg + s + "\n";
  }

  public static void println2(String s) {
    // System.out.print(s);

    msg = msg + s;
  }

  public static void main(String[] args) {

    main();
   // System.out.print(msg);
   FileGeneration();
  }

  public static String main() {
/********im here*********/
    String url = url();
    importer();
    Println1(
        "public static void main(String[] args) throws Exception {\n\t\tString url = "
            + url
            + "\";\n\nHttpsURLConnection pasta = (HttpsURLConnection) new URL(url).openConnection();\n\n//pasta.setRequestMethod(\"POST\");");

    mpain();
    println2("String urlParameters =\"");

    body();
    Println1("\n");
    last();
    return msg;
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


  public static void importer() {

    String p =
        "package pack;\n\n\n\nimport java.io.BufferedReader;\nimport java.net.HttpURLConnection;\nimport java.io.BufferedWriter;\nimport java.io.DataOutputStream;\nimport java.io.File;\nimport java.io.FileNotFoundException;\nimport java.io.InputStreamReader;\nimport java.net.URL;\nimport java.net.URL;\nimport java.util.*;\nimport java.util.HashMap;\nimport java.util.Map.*;\nimport java.util.Scanner;\nimport javax.net.ssl.HttpsURLConnection;\nimport javax.net.ssl.HttpsURLConnection;\n\n\n\n public class canaryRequest2{\n\n";

    Println1(p);
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

  

  public static String body() {

    String msg1 = "";
    try {
      File f = new File(bpath);
      Scanner read = new Scanner(f);
      while (read.hasNextLine()) {
        String data = read.nextLine();
        msg1 = msg1 + data;
        // Println1(msg1);
      }

      read.close();
    } catch (FileNotFoundException e) {

      Println1("\";");
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

  public static void last() {

    String last =
        "\npasta.setDoOutput(true);\n        try (DataOutputStream wr = new DataOutputStream(pasta.getOutputStream())) {\n           wr.writeBytes(urlParameters);\n            wr.flush();\n        }\n\n        int responseCode = pasta.getResponseCode();\n        System.out.println(\"Sending 'POST' request to URL : \" + url);\n        System.out.println(\"Post parameters : \" + urlParameters);\n        System.out.println(\"Response Code : \" + responseCode);\n\n        try (BufferedReader in = new BufferedReader(\n                new InputStreamReader(pasta.getInputStream()))) {\n\n            String line;\n            StringBuilder response = new StringBuilder();\n\n            while ((line = in.readLine()) != null) {\n                response.append(line);\n            }\n\n            //print result\n            System.out.println(response.toString());\n\n        }}\n}";

    Println1(last);
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
}
