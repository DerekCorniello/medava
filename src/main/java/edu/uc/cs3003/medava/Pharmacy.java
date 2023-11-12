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
        System.out.println(String.format("Sending an %s.", advil.getMedicineName()));
        return t.goods.add(advil);
    }

    // Getter function for name of pharmacy
    public String pharmacyName() 
    {
        return mPharmacyName;
    }

    private String mPharmacyName;
}