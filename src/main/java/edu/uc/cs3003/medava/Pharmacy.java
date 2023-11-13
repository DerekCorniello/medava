package edu.uc.cs3003.medava;

public class Pharmacy 
{

    // Pharmacy constructor
    public Pharmacy(String pharmacyName)
    {
        mPharmacyName = pharmacyName;
    }

    // Member Function: send
    // 'sends' the transporter to the hospital
    // Inputs: string of medicine name
    // Outputs: boolean of if successful or not
    public boolean send(Transporter t) 
    {
        Medicine advil = new Medicine("Advil");
        if (t.load(advil)) {
            System.out.println(String.format("Sending %s on the %s transporter.", advil.getMedicineName(), t.getTransporterName()));
            return true;
        }
        System.out.println(
                String.format("Cannot load %s on to the %s transporter.", advil.getMedicineName(), t.getTransporterName()));
        return false;
    }

    // Member Function: receive
    //'unloads' the items from the transporter
    // Inputs: A transporter
    // Outputs: None
    void receive(Transporter t) {
        while (!t.isEmpty()) {
            Medicine unloaded = t.unload();
            System.out.println(String.format("Receiving %s off the %s transporter.", unloaded.getMedicineName(), t.getTransporterName()));
        }
    }

    // Getter function for name of pharmacy
    public String pharmacyName() 
    {
        return mPharmacyName;
    }

    private String mPharmacyName;
}