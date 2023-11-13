package edu.uc.cs3003.medava;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Transporter 
{
    private String mTransporterName;
    private double mLowTemperature, mHighTemperature;
    private List<Shippable> goods;

    // Constructor-eqsue, to define a variable without the constructor
    {
        goods = new ArrayList<Shippable>();   
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

    // Do some shipping!
    public void ship() 
    {
        // Do some shipping!
    }

    // Member Function: load
    // Load a medicine object into the transporter
    // Inputs: Medicine object
    // Outputs: Boolean value if it was successful

    public boolean load(Shippable itemToLoad) 
    {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) 
        {
            return goods.add(itemToLoad);
        }
        return false;
    }

    /*
    public boolean load(Object itemToLoad) {
        try {
            Method isTemperatureRangeAcceptableMethod = itemToLoad.getClass().getMethod("isTemperatureRangeAcceptable",
                    Double.class, Double.class);
            boolean resultOfMethodCall = (boolean) isTemperatureRangeAcceptableMethod.invoke(itemToLoad,
                    Double.valueOf(mLowTemperature), Double.valueOf(mHighTemperature));
            if (resultOfMethodCall) {
                goods.add(itemToLoad);
            }
            return resultOfMethodCall;
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            return false;
        }
    }
    */

    // Member Function to unload items
    public Shippable unload() 
    {
        return goods.remove(0);
    }
    
    /*
    public Object unload() 
    {
        return goods.remove(0);
    }
    */

    // Getter function to test if the transporter is empty
    public boolean isEmpty() 
    {
        return goods.isEmpty();
    }
}