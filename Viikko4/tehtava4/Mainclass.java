public class Mainclass {
    public static void main(String[] args){

        ReadAndWriteIO readnwrite = new ReadAndWriteIO();

        String filepath = "input.txt";
        String outputfile = "output.txt";
        readnwrite.ReadAndWrite(filepath,outputfile);
    }

}