import java.lang.*;
import java.util.*;
public class BMI_Calculator
{
    private String height;
    private String weight;

    // default setting, show 0 on user profile
    public BMI_Calculator()
    {
        this.height = "0";
        this.weight = "0";
    }

    public BMI_Calculator(String height, String weight)
    {
        this.height = height;
        this.weight = weight;
    }

    public String BMI_Calculate()
    {
        double h = 0.0;
        double w = 0.0;
        double BMI = 0.0;
        String BMI_Result= "";
        // check whether user inputs about height and height are valid
        try
        {
            h = Double.parseDouble(this.height);
            w = Double.parseDouble(this.weight);


        }
        catch(Exception e)
        {
            System.out.println("Invalid height and/or weight information!");
            e.printStackTrace();

        }

        BMI = w/Math.pow(h,2);

        BMI_Result = String.valueOf(BMI);
        return BMI_Result;
    }

}