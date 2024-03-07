package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
public class EnterOutParking {
    private String id;
    private String name;
    private String manufacture;

    public EnterOutParking(String id, String name, String manufacture) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "EnterOutParking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;

        }
        EnterOutParking parking = (EnterOutParking) obj;
        return id == parking.id && Objects.equals(id,parking.id);

    }

    //public void saveToFile() {
       // saveToFile(null, null);


    static public void saveToFile(EnterOutParking[] vehicles, PrintWriter outS)
    {
        outS.println(vehicles.length);
        for(int i = 0; i<vehicles.length; i++)
        {
            outS.println(vehicles[i].getId() + "|" + vehicles[i].getManufacture() + "|" + vehicles[i].getName());
        }
    }

    public static EnterOutParking[] writeoutFromFile(BufferedReader InS) throws IOException
    {
        int dl = Integer.parseInt(InS.readLine());
        EnterOutParking[] enteroutparking = new EnterOutParking[dl];
        for(int i = 0; i < enteroutparking.length; i++)
        {
            enteroutparking[i] = new EnterOutParking("id","name","manufacture");
        }
        return enteroutparking;
    }

}

