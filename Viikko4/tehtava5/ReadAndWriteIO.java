import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteIO {
    /// method from https://stackoverflow.com/questions/15667125/read-content-from-files-which-are-inside-zip-file
    public void readFile(String zippath){
        String streamline = "";
        try(ZipFile zipFile = new ZipFile(zippath)){
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            ZipEntry entry = entries.nextElement();
            InputStream stream = zipFile.getInputStream(entry);
            InputStreamReader isr = new InputStreamReader(stream, StandardCharsets.UTF_8); /// from https://zetcode.com/java/inputstream/
            BufferedReader br = new BufferedReader(isr);
            while((streamline = br.readLine()) != null){
                System.out.println(streamline);
            }
        }catch(IOException e){
            e.printStackTrace();
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
