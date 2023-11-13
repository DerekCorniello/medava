package edu.uc.cs3003.medava;
import java.util.List;
import java.util.ArrayList;

public class Transporter 
{
    private String mTransporterName;
    private double mLowTemperature, mHighTemperature;
    private List<Medicine> goods;

    // Constructor-eqsue, to define a variable without the constructor
    {
        goods = new ArrayList<Medicine>();   
    }

    // Transporter constructor
    public Transporter(String transporterName, double lowTemp, double highTemp) 
    {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    // Transporter getter function
    public String getTransporterName() 
    {
        return mTransporterName;
    }

    // 
    public void ship() 
    {
        // Do some shipping!
    }

    // Member Function: load
    // Load a medicine object into the transporter
    // Inputs: Medicine object
    // Outputs: Boolean value if it was successful
    public boolean load(Medicine itemToLoad) 
    {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            goods.add(itemToLoad);
            return true;
        }
        return false;
    }

    // Member Function to unload items
    public Medicine unload() 
    {
        return goods.remove(0);
    }

    // Getter function to test if the transporter is empty
    public boolean isEmpty() 
    {
        return goods.isEmpty();
    }
}