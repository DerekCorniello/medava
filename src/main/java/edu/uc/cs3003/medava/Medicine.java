package edu.uc.cs3003.medava;

public class Medicine 
{
    private String mMedicineName;

            // Medicine Class Constructor
            public Medicine(String medicineName) 
            {
                mMedicineName = medicineName;
            }
            
            // Medicine name getter function
            public String getMedicineName() 
            {
                return mMedicineName;
            }

            // Default min temp getter function
            public double minimumTemperature() 
            {
                return 0.0;
            }

            // Default max temp getter function
            public double maximumTemperature() 
            {
                return 100.0;
            }
    
            // Member function: isTemperatureRangeAcceptable
            // Inputs: two doubles for the range of temperatures
            // Outputs: returns if the value is in range
            public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
                if (this.minimumTemperature() <= lowTemperature && 
                    highTemperature <= this.maximumTemperature()) 
                {
                    return true;
                }
                return false;
            }
}