package districts2;
import java.io.*;

import pancha1.FileSupplier.FileSupplier;


public class append {


    public static void main(String args[]){

        for (int i=1;i<10;i++){
            try{
            Integer ie =i;
            if(i==4)
            continue;
            StringBuilder sb= FileSupplier.fileRead("E:\\InfyJava\\pancha1\\#districts150700"+i+"members.txt");
             //E:\InfyJava\pancha\districts1501018.txt E:\InfyJava\pancha\districts1506006.txt
            System.out.println(sb.toString());

            sb.insert(0,"GRAM PANCHAYAT\n\n");
            FileSupplier.append("E:\\InfyJava\\districts2\\#districtsMerge1507.txt", sb);
            }catch(Exception e){

            }
        }

                                       
    }

}
