package pancha1.FileSupplier;

public class matchandReplace {


    public static void search(StringBuilder sb,StringBuilder sb2){
        int start=0;
            int mid = sb.indexOf("<table cellspacing");
            int end = sb.indexOf ("</table>",mid);
        
            if((mid|end) ==-1){
        Log(mid +"  "+end);
            }else{
        
                while((mid|end)!= -1){
                    Log("int loop");
                    sb2.append(sb.substring(mid,end));
                    mid = sb.indexOf("<table cellspacing",start);
                   end = sb.indexOf ("</table>",mid);
                   Log(mid +"  "+end);
                    start =mid+1;
                }
            }
        
        
        }

    private static void Log(String string) {
    }
    



    
}
