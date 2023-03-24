import java.util.*;
import java.io.*;

public class Main1 {


    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        // File object to read and write to a file
        File file = new File("filename.txt");

        // Arrays to store marks
        int MID1[] = new int[30];
        int MID2[] = new int[30];
        int Final[] = new int[30];

        // variables for storing max marks and the student number
        int max = 0;
        int student = 0;

        // Taking inputs from user
        for (int i=0; i<30; i++) {

            System.out.print("Student " + (i+1) + " MID1 marks: ");
            MID1[i] = scan.nextInt();
            System.out.print("Student " + (i+1) + " MID2 marks: ");
            MID2[i] = scan.nextInt();
            System.out.print("Student " + (i+1) + " Final marks: ");
            Final[i] = scan.nextInt();

        }

        // Writing to a File
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for(int i=0; i<2; i++) {
                myWriter.write(MID1[i] + " ");
            }
            for(int i=0; i<2; i++) {
                myWriter.write("\n" + MID2[i] + " ");
            }
            for(int i=0; i<2; i++) {
                myWriter.write("\n" + Final[i] + " ");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading File
        try {
            Scanner myReader = new Scanner(file);
            String s[]= myReader.nextLine().split(" ");
            for (int i=0; i<s.length; i++) {
                MID1[i]= Integer.parseInt(s[i]);
            }
            s = myReader.nextLine().split(" ");
            for (int i=0; i<s.length; i++) {
                MID2[i]= Integer.parseInt(s[i]);
            }
            s = myReader.nextLine().split(" ");
            for (int i=0; i<s.length; i++) {
                Final[i]= Integer.parseInt(s[i]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i=0; i<MID1.length; i++) {
            if (max<MID1[i]) {
                max = MID1[i];
                student = i+1;
            }
        }
        System.out.println("Student " + student + " has maximum MD1 marks: " + max);

        max = 0;
        student = 0;
        for (int i=0; i<MID2.length; i++) {
            if (max<MID2[i]) {
                max = MID2[i];
                student = i+1;
            }
        }
        System.out.println("Student " + student + " has maximum MD2 marks: " + max);

        max = 0;
        student = 0;
        for (int i=0; i<Final.length; i++) {
            if (max<Final[i]) {
                max = Final[i];
                student = i+1;
            }
        }
        System.out.println("Student " + student + " has maximum Final marks: " + max);

    }

}




