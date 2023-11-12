package edu.uc.cs3003.medava;
import java.util.List;
import java.util.ArrayList;

public class Transporter 
{
    private String mTransporterName;
    public List<Medicine> goods;

    {
        goods = new ArrayList<Medicine>();   
    }

    public String getTransporterName() 
    {
        return mTransporterName;
    }

    public void ship() 
    {
        // Do some shipping!
    }
}