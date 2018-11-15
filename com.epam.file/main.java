import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        final File directory = new File("C://JavaText");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder line = new StringBuilder("Satisfaction");
        File fileForRead = new File(directory, "Read.txt");
        File fileForWrite = new File(directory, "Write.txt");

       try {
           boolean createdOne = fileForRead.createNewFile();
            boolean createdTwo = fileForWrite.createNewFile();
            if (createdOne)
                System.out.println("OK");
            if (createdTwo)
                System.out.println("OK");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter fos = new FileWriter(fileForRead, false)) {
            fos.write(line.toString());
        } catch (IOException ex1) {
            System.out.println(ex1.getMessage());
        }

        try (FileWriter fos = new FileWriter(fileForWrite)) {
            int middleOfLine = (line.length()/2);
            line.insert(middleOfLine,input);
            StringBuilder line1 = line.reverse();
            String lineWrite = line1.toString();
            fos.write(lineWrite.toUpperCase());

        }catch(IOException ex2){
            System.out.println();
        }
    }
}
