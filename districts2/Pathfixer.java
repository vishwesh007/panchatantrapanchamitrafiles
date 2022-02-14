package districts2;

import pancha1.FileSupplier.FileSupplier;

public class Pathfixer {

public static void main(String args[]){

    fixPath();
}
    public static void fixPath(){
        StringBuilder sb = FileSupplier.fileRead("E:\\InfyJava\\districts2\\path.txt");

     String sbh= sb.toString();
     sbh=sbh.replaceAll("\"", "\\\"");
        StringBuilder sb2= new StringBuilder();
        Log(sbh); searchIterateHelper(sb, sb2);
        
    }
    
   

    public static void searchIterateHelper(StringBuilder sb,StringBuilder sb2){
        
        String searchStart="<tr>";
        String searchEnd=">";
        search(sb,sb2,searchStart);
         searchStart="\"";
      
     


    }
    public static void search(StringBuilder sb,StringBuilder sb2,String startpoint){
        String endpoint="";
        int start=0;
            int mid = sb.indexOf(startpoint);
            int end = sb.indexOf (endpoint,mid);
        
            if((mid|end) ==-1){
        Log(mid +"  "+end);
            }else{
        
                while((mid&end)!= -1){
                   
                    sb2.replace(mid,mid+1 , "\""+startpoint);
                    mid = sb.indexOf(startpoint,mid+1);
                   end = sb.indexOf (endpoint,mid);//redundant
                   // start =mid+1;
                }
            }
        
        
        }
        private static void Log(String string) {

            System.out.println(string);
        }
}
