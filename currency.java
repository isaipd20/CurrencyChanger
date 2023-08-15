import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line;
        List<List<String>> data = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader("./moneda.csv"))){
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(Arrays.asList(values));
            }
        }

        //Scanner input = new Scanner(System.in);
        //System.out.println("Elige tu tipo de moneda");
        //System.out.println("Existen las siguentes monedas: ");

        // for(int i=0; i<data.size() ; i++){
        //     System.out.println(data.get(i));
        // }

        List<String> moneda = new ArrayList<>();
        ArrayList<Double> valor = new ArrayList<>();

        for(int i=0; i<9; i++){
            moneda.add(Arrays.asList(data.get(i).get(i)).get(i));
        }

        //for(int i=0; i<8; i++){
            System.out.println(moneda);
        //}


        //     System.out.println(moneda);
        

        // HashMap <ArrayList<String>, ArrayList<ArrayList<Object>>> map = new HashMap<ArrayList<String>, ArrayList<ArrayList<Object>>>();
        // for(int i=0; i<8; i++){
        //     if(i != 0){
        //         map.put(data.get(i), );
        //     } 
        // }
        
        
    }
    
  }
  