import java.io.*;

public class CSVReadWrite {
    public static void main(String[] args) {
        String fileName = "CSV WriteRead.csv";

        writeToCSVFile(fileName);

        //readCSVFile(fileName);
    }


    private static void writeToCSVFile(String fileName) {
        try(PrintWriter pw =new PrintWriter(fileName)){
            pw.write("Animal" +",");
            pw.write("Name");
            System.out.println("Finished writing to file.");
        }catch (FileNotFoundException e){
            System.out.println("Error creating/writing to file.");
            e.printStackTrace();
        }
    }
    private static  void readCSVFile(String fileName){
        try(BufferedReader br= new BufferedReader(new FileReader(fileName))) {
            String line ="";
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File could not be close.");
            e.printStackTrace();
        }
    }

}
