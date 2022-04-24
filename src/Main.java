import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("D://jsonviewer.json"));
            Result result = gson.fromJson(br, Result.class);

            if(result != null){
                System.out.println("Product Name | Quantity | Weight | Destination | Service | Value");
                for(Expedition ex : result.getExpedition()){
                    System.out.println(ex.getProductName() +" | "+ ex.getQuantity() +" | "+ ex.getWeight() +" | "+
                    ex.getCity().getDestination() +" | "+ ex.getServicePackage().getService() +" | "+ ex.getServicePackage().getValue());
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            if(br != null){
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}