import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadAndWriteIO {
    
    public void readFile(String filepath){
        String fileline = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            while((fileline = br.readLine()) != null){
                System.out.println(fileline);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
