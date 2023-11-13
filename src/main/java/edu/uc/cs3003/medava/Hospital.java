package edu.uc.cs3003.medava;

public class Hospital 
{

    private String name;

    // Hospital Constructor
    public Hospital(String hospitalName) 
    {
        name = hospitalName;
    }

    // Member Function: receive
    // 'unloads' a transporter full with medicine
    // Inputs: a transporter
    // No output
    void receive(Transporter t) {
        while (!t.isEmpty()) {
            Medicine unloaded = t.unload();
            System.out.println(String.format("Receiving %s off the %s transporter.", unloaded.getMedicineName(), t.getTransporterName()));
        }
    }

    // Getter function for name
    public String name() 
    {
        return name;
    }
}