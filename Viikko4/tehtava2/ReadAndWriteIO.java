import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteIO {
    
    public void readFile(String filepath){
        String fileline = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            while((fileline = br.readLine()) != null){
                System.out.println(fileline);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void ReadAndWrite(String filepath, String outputfile){
        String fileline = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            try(FileWriter writer = new FileWriter(outputfile)){
    
                while((fileline = br.readLine()) != null){
                    writer.write(fileline + "\n");
                }
            } catch (FileNotFoundException e){
                e.printStackTrace();
                System.exit(1);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
