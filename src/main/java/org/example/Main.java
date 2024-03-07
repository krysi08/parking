package org.example;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EnterOutParking[] enteroutparking = new EnterOutParking[4];
       enteroutparking[0] = new EnterOutParking("ABC123456", "BMW", "6");
       enteroutparking[1] = new EnterOutParking("BCA745482", "Mercedes", "AMG");
       enteroutparking[2] = new EnterOutParking("WDZ098765", "Audi", "TT");
       enteroutparking[3] = new EnterOutParking("OJD937251", "Opel", "Astra");


        //List<EnterOutParking> parking2 = new ArrayList<>();


        try {
            PrintWriter writer = new PrintWriter(new FileWriter("abc.txt"));

            EnterOutParking.saveToFile(enteroutparking,writer);

            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));

            EnterOutParking[] enteroutparking2 = EnterOutParking.writeoutFromFile(reader);

            for (int i = 0; i < enteroutparking2.length; i++)
                System.out.println(enteroutparking2[i]);
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}

