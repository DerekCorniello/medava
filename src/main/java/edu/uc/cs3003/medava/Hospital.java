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
    void receive(Transporter t) 
    {
        while (!t.goods.isEmpty()) {
            Medicine unloaded = t.goods.remove(0);
            System.out.println(String.format("Receiving an %s.", unloaded.getMedicineName()));
        }
    }

    // Getter function for name
    public String name() 
    {
        return name;
    }
}