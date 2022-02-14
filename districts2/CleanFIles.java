package districts2;

import pancha1.FileSupplier.FileSupplier;

public class CleanFIles {

    public static void cleanFiles(){

        StringBuilder sb=   FileSupplier.fileRead("E:\\InfyJava\\districts2\\#districtsMerge1507.txt");
        StringBuilder sb2= new StringBuilder();
     searchIterateHelper(sb, sb2);
    }

    public static void searchIterateHelper(StringBuilder sb,StringBuilder sb2){
        
        String searchStart="<tr>";
        String searchEnd=">";
        search (sb,sb2,searchStart,searchEnd);
         searchStart="</tr><tr align=\"left\" style=\"color:Black;background-color:#DEDFDE;\">";
         searchEnd=">";
        search (sb,sb2,searchStart,searchEnd);
        searchStart="<table\scellspacing=\"1\"\scellpadding=\"3\"\sbordercolor=\"#657383\"\sid=\"ContentPlaceHolder1_gdDisplay\"\sstyle=\"background-color:White;border-color:White;border-width:2px;border-style:Ridge;font-size:9pt;width:100%;\">\n			<tr\salign=\"left\"\sstyle=\"color:#E7E7FF;background-color:#4A3C8C;font-weight:bold;\">";
        searchEnd=">";
       search (sb,sb2,searchStart,searchEnd);


       


    }
    public static void search(StringBuilder sb,StringBuilder sb2,String startpoint,String endpoint){
        int start=0;
            int mid = sb.indexOf(startpoint);
            int end = sb.indexOf (endpoint,mid);
        
            if((mid|end) ==-1){
        Log(mid +"  "+end);
            }else{
        
                while((mid|end)!= -1){
                    Log("int loop");
                    sb2.append(sb.substring(mid,end));
                    mid = sb.indexOf(startpoint,start);
                   end = sb.indexOf (endpoint,mid);
                   Log(mid +"  "+end);
                    start =mid+1;
                }
            }
        
        
        }

    private static void Log(String string) {

        System.out.println(string);
    }
    
}
