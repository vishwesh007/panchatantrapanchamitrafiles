package pancha1;
import java.util.regex.*;

import pancha1.FileSupplier.FileSupplier;
public class DataCleaning12helper {
   public static String specialString1 =MultiOp11.specialString;
    public static String distcode1 = MultiOp11.distcode;
public static void main(String args[]){
    //brought the code inside so that it gets refreshed whenever cALLed useful when using loops
    String specialString =MultiOp11.specialString;
   String distcode = MultiOp11.distcode;
   
   
   StringBuilder sb= FileSupplier.fileRead("E:\\InfyJava\\pancha1\\#districts"+distcode+specialString+"members.txt");
//E:\InfyJava\pancha1\districts1507001.txt
StringBuilder sb2 = new StringBuilder();
search(sb,sb2);
Log(sb2);
// String trashy ="</tr><tr align=\"left\" style=\"color:Black;background-color:#DEDFDE;\">";
// int trash = sb2.indexOf(trashy) ;
// while(trash!= -1){
//     sb2.replace(trash,trash+ trashy.length(), "\n");
//     trash = sb2.indexOf(trashy) ;
// }
FileSupplier.write("E:\\InfyJava\\pancha1\\#districts"+distcode+specialString+"members.txt", sb2);
}

public static void search(StringBuilder sb,StringBuilder sb2){
int start=0;
int mid = sb.indexOf("https://panchatantra.kar.nic.in",start);
    int        end = sb.indexOf ("\n",mid);
    sb2.append(sb.substring(mid,end)+"\n");
     mid = sb.indexOf("<table cellspacing");
     end = sb.indexOf ("</table>",mid);

    if((mid|end) ==-1){
Log(mid +"  "+end);
    }else{

        while((mid|end)!= -1){
            Log("int loop");
             try{
           sb2.append(sb.substring(mid,end));
            mid = sb.indexOf("https://panchatantra.kar.nic.in",start);
            end = sb.indexOf ("\n",mid);
            sb2.append("\n"+sb.substring(mid,end)+"\n");}
            catch(Exception e){
                sb2.append("taluka name not known");
            }
            
            mid = sb.indexOf("<table cellspacing",start);
           end = sb.indexOf ("</table>",mid);

           Log(mid +"  "+end);
            start =mid+1;
        }
    }


}
public static void search2(StringBuilder sb,StringBuilder sb2){
    int start=0;
    int mid = sb.indexOf("https://panchatantra.kar.nic.in",start);
        int        end = sb.indexOf ("\n",mid);
        sb2.append(sb.substring(mid,end)+"\n");
         mid = sb.indexOf("<table cellspacing");
         end = sb.indexOf ("</table>",mid);
    
        if((mid|end) ==-1){
    Log(mid +"  "+end);
        }else{
    
            while((mid|end)!= -1){
                Log("int loop");
                sb2.append(sb.substring(mid,end)+"\n");
                mid = sb.indexOf("https://panchatantra.kar.nic.in",start);
                end = sb.indexOf ("\n",mid);
                sb2.append(sb.substring(mid,end)+"\n");
                mid = sb.indexOf("<table cellspacing",start);
               end = sb.indexOf ("</table>",mid);
    
               Log(mid +"  "+end);
                start =mid+1;
            }
        }
    
    
    }
private static void Log(Object string) {

    System.out.println(string);
}



    
}
