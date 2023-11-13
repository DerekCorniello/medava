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
        while (!t.isEmpty()) 
        {
            Medicine unloaded = t.unload();
            System.out.println(String.format("Checking whether Hospital can receive %s.", unloaded.getMedicineName()));
            if (unloaded.getSchedule() != MedicineSchedule.Uncontrolled) 
            {
                System.out.println(String.format("Hospital cannot receive controlled substances and %s is a %s.",
                        unloaded.getMedicineName(), unloaded.getSchedule().asString()));
            } 
            
            else 
            {
                System.out.println(String.format("Accepted a shipment of %s.", unloaded.getMedicineName()));
            }
        }
    }

    // Getter function for name
    public String name() 
    {
        return name;
    }
}