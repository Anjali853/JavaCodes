import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// public class CreateFile{
//     public static void main(String[] args) {
//         try{
//             File file = new File("new.txt");
//             if(file.createNewFile()){
//                 System.out.println("File created:" + file.getName());
//             }else{
//                 System.out.println("File already exists:");
//             }
//         } catch (IOException e){
//             System.out.println("An error occurred");
//             e.printStackTrace();
//         }
//     }

// }

public class readwrite{
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("new.txt");
            writer.write("Hello,this is a test message written to the file");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

}

// public class ReadFromFile {
//     public static void main(String[] args) {
//         try {
//             File file = new File("exmple.txt");
//             Scanner scanner =new Scanner(file);
//             while (scanner.hasNextLine()) {
//                 String data = scanner.nextLine();
//                 System.out.println(data);
                
//             }

//         }
//     }
// }


// public class DeletedFile{
//     public static void main(String[] args) {
//         File file = new File("example.txt");
//         if(file.delete()){
//             System.out.println("Deleted the file :" +file);
//         }else {
//             System.out.println("Failed to delete the file");
//         }
//     }
// }