// WELCOME TO MY PROJECT
// TOPIC : UNIT CONVERTER 
// WITH THE HELP OF THIS , YOU CAN CONVERT ONE UNIT TO DIFFERNT UNITS
// FOLLOWING ARE THE CONVERSION 
// 1) LENGTH       (meter to miles and inches)
// 2) AREA         (meter square to hectares and acres) 
// 3) VOLUME       (cubic meter to cubic yard and cubic foot)
// 4) SPEED        (meter per second to km per hour and mile per hour)
// 5) WEIGHT       (gram to ounce and pound) 
// 6) TEMPERATURE  (degree fahrenheit to Celsius and Kelvin)
// 7) POWER        (Watt to Kiloram meter/second and imperial horsepower)
// 8) PRESSURE     (atm to Millimeter of mercury and kilopascal)
// 9) CURRENCY     (US Dollar to Indian Rupees and pound) 
// 10) ENERGY      (joule to kilocalorie and watt hour)
// 11) ANGLE       (degree to radian and minute of arc)     

import java.util.Scanner;
class conversion    // Create a class named conversion 
{ 
Scanner input=new Scanner(System.in);   // user input using Scanner class
// Create a function named length_conversion 
// Function converts length in meter to miles and inches

void length_conversion()
{   
    // Variable declaration 
    float length_in_meter;
    double length_in_inches;
    double length_in_miles;
    int choice_length;    // To choose the conversion
    System.out.print("Welcome to the conversion of length\n");
    System.out.print("Enter 1-> convert length in meter to miles or\n"); 
    System.out.print("Enter 2-> convert length in meter to inches\n");
    choice_length=input.nextInt();    // Taking user input to select choice using scanf
    char quit_length_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_length==1)  // If choice is 1 , then following code will do the length conversion from meter to miles
    {   
        while(quit_length_conversion!='q')
        {   
            System.out.print("Enter the length in meter you want to convert into miles : ");
            try{
            length_in_meter=input.nextFloat();
            length_in_miles = 0.0006214 * length_in_meter;    // Since 1 meter = 0.0006214 miles
            System.out.print("The value of length in miles = "+ length_in_miles+"\n");
            }
            catch(Exception e)
            {
                e.getStackTrace();
            }
            System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
            quit_length_conversion= input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
        }
        System.out.print("Thank you\n");
    }
    else if(choice_length==2) // If choice is 2 , then following code will do the length conversion from meter to inches
    {   
        while(quit_length_conversion!='q')
        {
          System.out.print("Enter the length in meter you want to convert into inches : ");
          try{
          length_in_meter=input.nextFloat();
          length_in_inches = 39.3700787 * length_in_meter;  // Since 1 meter = 39.3700787 inch
          System.out.print("The value of length in inches = "+length_in_inches+"\n");
          }
          catch(Exception e)
            {
                e.getStackTrace();
            }
          System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
          quit_length_conversion = input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
        }
        System.out.print("Thank you\n"); 
    }
    else  // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        length_conversion();  // Using Recursion we again get back to our function
    }
}

// Create a function named Area_conversion 
// Function converts area in meter square to hectares and acres

void Area_conversion()
{
    // Variable declaration 
    float area_in_meter_square;
    double area_in_hectares;
    double area_in_acres;
    int choice_for_area;    // To choose the conversion
    char quit_Area_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    System.out.print("Welcome to the conversion of Area\n");
    System.out.print("Enter 1-> convert Area in meter square to hectares or\n"); 
    System.out.print("Enter 2-> convert Area in meter square to acres\n");
    choice_for_area=input.nextInt();    // Taking user input to select choice using scanf
    if(choice_for_area==1)  // If choice is 1 , then following code will do the area conversion from meter square to hectares 
    {   
        while(quit_Area_conversion!='q')
        {
           System.out.print("Enter the area in meter square you want to convert into hectares : ");
           try{
           area_in_meter_square=input.nextFloat();
           area_in_hectares = 0.0001 * area_in_meter_square;    // Since 1 hectare = 0.0001 meter square
           System.out.print("The value of area in hectares = "+ area_in_hectares+"\n");
           }
           catch(Exception e)
            {
                e.getStackTrace();
            }
           System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
           quit_Area_conversion= input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
        }   
           System.out.print("Thank you\n");
    }    
    else if(choice_for_area==2) // If choice is 2 , then following code will do the area conversion from meter square to acres
    {
        
    while(quit_Area_conversion!='q')    
     {   
        System.out.print("Enter the area in meter square you want to convert into acres : ");
        try{
        area_in_meter_square=input.nextFloat();
        area_in_acres = 0.01 * area_in_meter_square;     // Since 1 meter square = 0.01 acres 
        System.out.print("The value of area in acres = "+area_in_acres+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_Area_conversion= input.next().charAt(0);  // Taking user input that quits or continue the function based on character,user gives 
     }   
        System.out.print("Thank you\n");
    }
    else    // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        Area_conversion(); // Using Recursion we again get back to our function
    }
}

// Create a function named volume_conversion 
// Function converts volume in cubic meter to cubic yard and cubic foot

void volume_conversion()
{   
    // Variable declaration 
    float volume_in_cubic_meter;
    double volume_in_cubic_yard;
    double volume_in_cubic_foot;
    int choice_volume;    // To choose the conversion
    System.out.print("Welcome to the conversion of volume\n");
    System.out.print("Enter 1-> convert volume in cubic meter to cubic yard or\n"); 
    System.out.print("Enter 2-> convert volume in cubic meter to cubic foot\n");
    choice_volume=input.nextInt();    // Taking user input to select choice using scanf
    char quit_volume_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_volume==1)   // If choice is 1 , then following code will do the volume conversion from cubic meter to cubic yard
    {   
     while(quit_volume_conversion!='q')   
      {  
        System.out.print("Enter the volume in cubic meter you want to convert into cubic yard : ");
        try{
        volume_in_cubic_meter=input.nextFloat();
        volume_in_cubic_yard = 1.3079528 * volume_in_cubic_meter;    // Since 1 cubic meter = 1.3079528 cubic yard
        System.out.print("The value of volume in cubic yard = "+volume_in_cubic_yard+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_volume_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
      }
        System.out.print("Thank you\n");
    }
    else if(choice_volume==2)  // If choice is 2 , then following code will do the volume conversion from cubic meter to cubic foot
    {
      while(quit_volume_conversion!='q')
       {    
        System.out.print("Enter the volume in cubic meter you want to convert into cubic foot : ");
        try{
        volume_in_cubic_meter=input.nextFloat();
        volume_in_cubic_foot = 35.3147248 * volume_in_cubic_meter;  // Since 1 cubic meter = 35.3147248 cubic foot
        System.out.print("The value of volume in cubic foot = "+volume_in_cubic_foot+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_volume_conversion=input.next().charAt(0);  // Taking user input that quits or continue the function based on character,user gives 
       }
        System.out.print("Thank you\n");
    }
    else     // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        volume_conversion();  // Using Recursion we again get back to our function
    }
}

// Create a function named speed_conversion 
// Function converts speed in meter per second to km per hour and mile per hour

void speed_conversion()
{   
    // Variable declaration 
    float speed_in_meter_per_second;
    double speed_in_kilometer_per_hour;
    double speed_in_mile_per_hour;
    int choice_speed;    // To choose the conversion
    System.out.print("Welcome to the conversion of speed\n");
    System.out.print("Enter 1-> convert speed in meter per second to kilometer per hour or\n"); 
    System.out.print("Enter 2-> convert speed in meter per second to mile per hour\n");
    choice_speed=input.nextInt();    // Taking user input to select choice using scanf
    char quit_speed_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_speed==1)  // If choice is 2 , then following code will do the speed conversion from meter per second to kilometer per hour
    {   
      while(quit_speed_conversion!='q')  
       {
        System.out.print("Enter the speed in meter per second you want to convert into kilometer per hour : ");
        try{
        speed_in_meter_per_second=input.nextFloat();
        speed_in_kilometer_per_hour = 3.6 * speed_in_meter_per_second;    // Since 1 meter per second = 3.6 kilometer per hour
        System.out.print("The value of speed in kilometer per hour = "+speed_in_kilometer_per_hour+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_speed_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }
        System.out.print("Thank you\n");
    }
    else if(choice_speed==2)  // If choice is 2 , then following code will do the speed conversion from meter per second to mile per hour
    {
      while(quit_speed_conversion!='q')  
       { 
        System.out.print("Enter the speed in meter per second you want to convert into mile per hour : ");
        try{
        speed_in_meter_per_second=input.nextFloat();
        speed_in_mile_per_hour = 2.236936 * speed_in_meter_per_second;  // Since 1 meter per second = 2.236936 mile per hour
        System.out.print("The value of speed in mile per hour = "+speed_in_mile_per_hour+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_speed_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }    
        System.out.print("Thank you\n");
    }
    else    // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        speed_conversion();    // Using Recursion we again get back to our function
    }
}

// Create a function named weight_conversion 
// Function converts weight in gram to ounce and pound

void weight_conversion()
{   
    // Variable declaration 
    float weight_in_gram;
    double weight_in_ounce;
    double weight_in_pound;
    int choice_weight;    // To choose the conversion
    System.out.print("Welcome to the conversion of weight\n");
    System.out.print("Enter 1-> convert weight in gram to ounce or\n"); 
    System.out.print("Enter 2-> convert weight in gram to pound\n");
    choice_weight=input.nextInt();    // Taking user input to select choice using scanf
    char quit_weight_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_weight==1) // If choice is 1 , then following code will do the weight conversion from gram to ounce
    {   
      while(quit_weight_conversion!='q')
       {  
        System.out.print("Enter the weight in gram you want to convert into ounce : ");
        try{
        weight_in_gram=input.nextFloat();
        weight_in_ounce = 0.035 * weight_in_gram;    // Since 1 gram = 0.035 ounce
        System.out.print("The value of weight in ounce = "+weight_in_ounce+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_weight_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       } 
        System.out.print("Thank you\n");
    }
    else if(choice_weight==2) // If choice is 2 , then following code will do the weight conversion from gram to pound
    {
       while(quit_weight_conversion!='q')
       { 
        System.out.print("Enter the weight in gram you want to convert into pound : ");
        try{
        weight_in_gram=input.nextFloat();
        weight_in_pound = 0.0022 * weight_in_gram;  // Since 1 gram = 0.0022 pound
        System.out.print("The value of weight in pound = "+weight_in_pound+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_weight_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }  
        System.out.print("Thank you\n");
    }
    else     // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        weight_conversion();  // Using Recursion we again get back to our function
    }
}

// Create a function named temperature_conversion 
// Function converts temperature in degree fahrenheit to Celsius and Kelvin

void temperature_conversion()
{   
    // Variable declaration 
    float temp_in_degree_fahrenheit;
    double temp_in_degree_celsius;
    double temp_in_kelvin;
    int choice_temp;    // To choose the conversion
    System.out.print("Welcome to the conversion of temperature\n");
    System.out.print("Enter 1-> convert temperature in degree fahrenheit to celsius or\n"); 
    System.out.print("Enter 2-> convert temperature in degree fahrenheit to kelvin\n");
    choice_temp=input.nextInt();    // Taking user input to select choice using scanf
    char quit_temperature_conversion=' ';  // Character variable which is used to quit the conversion when user enter q
    if(choice_temp==1) // If choice is 1 , then following code will do the temperature conversion from fahrenheit to celsius
    { 
      while(quit_temperature_conversion!='q')
       {    
        System.out.print("Enter the temperature in degree fahrenheit you want to convert into celsius : ");
        try{
        temp_in_degree_fahrenheit=input.nextFloat();
        temp_in_degree_celsius = ((temp_in_degree_fahrenheit-32)*(5/9));   // Celsius=(Fahrenheit-32)*(5/9)
        System.out.print("The value of temperature in degree celcius = "+temp_in_degree_celsius+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_temperature_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }  
        System.out.print("Thank you\n");
    }
    else if(choice_temp==2)  // If choice is 2 , then following code will do the temperature conversion from fahrenheit to kelvin
    {
      while(quit_temperature_conversion!='q')
       {   
        System.out.print("Enter the temperature in degree fahrenheit you want to convert into kelvin : ");
        try{
        temp_in_degree_fahrenheit=input.nextFloat();
        temp_in_kelvin = ((temp_in_degree_fahrenheit - 32)*(5/9)) + 273.15;  // Kelvin=(Fahrenheit-32)*(5/9)+273.15
        System.out.print("The value of temperature in kelvin = "+temp_in_kelvin+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_temperature_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }  
        System.out.print("Thank you\n");
    }
    else   // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        temperature_conversion();   // Using Recursion we again get back to our function
    }
}

// Create a function named power_conversion 
// Function converts power in Watt to Kiloram meter/second and imperial horsepower

void power_conversion()
{   
    // Variable declaration 
    float power_in_watt;
    double power_in_Kilogram_meter_per_second;
    double power_in_imperial_horsepower;
    int choice_power;    // To choose the conversion
    System.out.print("Welcome to the conversion of power\n");
    System.out.print("Enter 1-> convert power in watt to power in kilogram meter per second or\n"); 
    System.out.print("Enter 2-> convert power in watt to power in imperial horsepower\n");
    choice_power=input.nextInt();    // Taking user input to select choice using scanf
    char quit_power_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_power==1) // If choice is 1 , then following code will do the power conversion from watt to kg meter per second
    {   
      while(quit_power_conversion!='q')
       {  
        System.out.print("Enter the power in watt you want to convert into kilogram meter per second : ");
        try{
        power_in_watt=input.nextFloat(); // Taking input for the power in watt 
        power_in_Kilogram_meter_per_second = 0.101971 * power_in_watt;   // Since 1 Watt = 0.101971 kilogram meter per second 
        System.out.print("The value of power in kilogram meter per second = "+power_in_Kilogram_meter_per_second+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_power_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }        
        System.out.print("Thank you\n");
    }
    else if(choice_power==2) // If choice is 2 , then following code will do the power conversion from watt to horsepower
    {
      while(quit_power_conversion!='q')
       {  
        System.out.print("Enter the power in watt you want to convert into imperial horsepower : ");
        try{
        power_in_watt=input.nextFloat();
        power_in_imperial_horsepower = 0.00134102 * power_in_watt;  // Since 1 Watt = 0.00134102 imperial horsepower
        System.out.print("The value of power in imperial horsepower = "+power_in_imperial_horsepower+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_power_conversion=input.next().charAt(0);// Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        power_conversion();   // Using Recursion we again get back to our function
    }
}

// Create a function named pressure_conversion 
// Function converts pressure in atm to Millimeter of mercury and kilopascal

void pressure_conversion()
{   
    // Variable declaration 
    float pressure_in_atm;
    double pressure_in_millimeter_of_mercury;
    double pressure_in_kilopascal;
    int choice_pressure;    // To choose the conversion
    System.out.print("Welcome to the conversion of pressure\n");
    System.out.print("Enter 1-> convert pressure in atm to millimeter of mercury or\n"); 
    System.out.print("Enter 2-> convert pressure in atm to pressure in kilopascal\n");
    choice_pressure=input.nextInt();    // Taking user input to select choice using scanf
    char quit_pressure_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_pressure==1) // If choice is 1 , then following code will do the pressure conversion from atm to mm of Hg
    {   
       while(quit_pressure_conversion!='q')
       { 
        System.out.print("Enter the pressure in atm you want to convert into mm of Hg : ");
        try{
        pressure_in_atm=input.nextFloat(); // Taking input for the power in watt 
        pressure_in_millimeter_of_mercury = 760 * pressure_in_atm;   // Since 1 atm = 760 mm of Hg 
        System.out.print("The value of pressure in millimeter of mercury = "+pressure_in_millimeter_of_mercury+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_pressure_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }
        System.out.print("Thank you\n");
    }
    else if(choice_pressure==2)  // If choice is 2 , then following code will do the pressure conversion from atm to kilopascal
    {
      while(quit_pressure_conversion!='q')  
       {
        System.out.print("Enter the pressure in atm you want to convert into kilopascal : ");
        try{
        pressure_in_atm=input.nextFloat();
        pressure_in_kilopascal = 101.325 * pressure_in_atm;  // Since 1 atm = 101.325 kilopascal
        System.out.print("The value of pressure in kilopascal = "+pressure_in_kilopascal+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_pressure_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else  // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        pressure_conversion();      // Using Recursion we again get back to our function
    }
}

// Create a function named currency_conversion 
// Function converts currency in US Dollar to Indian Rupees and pound

void currency_conversion()
{   
    // Variable declaration 
    float currency_in_US_dollar;
    double currency_in_rupees;
    double currency_in_pound;
    int choice_currency;    // To choose the conversion
    System.out.print("Welcome to the conversion of currency\n");
    System.out.print("Enter 1-> convert currency in US dollar to Indian rupees or\n"); 
    System.out.print("Enter 2-> convert currency in US dollar to pound\n");
    choice_currency=input.nextInt();    // Taking user input to select choice using scanf
    char quit_currency_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_currency==1)  // If choice is 1 , then following code will do the currency conversion from US dollar to rupees
    {   
      while(quit_currency_conversion!='q')  
       { 
        System.out.print("Enter the currency in US Dollar you want to convert into Indian Rupees : ");
        try{
        currency_in_US_dollar=input.nextFloat(); // Taking input for the currency in US dollar
        currency_in_rupees = 80.975 * currency_in_US_dollar;   // Since 1 US Dollar = 80.975 rupees 
        System.out.print("The value of currency in Indian rupees = "+currency_in_rupees+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_currency_conversion=input.next().charAt(0);  // Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else if(choice_currency==2) // If choice is 2 , then following code will do the currency conversion from US dollar to pounds
    {
      while(quit_currency_conversion!='q')  
       { 
        System.out.print("Enter the currency in US Dollar you want to convert into pounds : ");
        try{
        currency_in_US_dollar=input.nextFloat();
        currency_in_pound = 24.46 * currency_in_US_dollar;  // Since 1 US Dollar = 24.46 pound
        System.out.print("The value of currency in pound = "+currency_in_pound+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_currency_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else  // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        currency_conversion();    // Using Recursion we again get back to our function
    }
}

// Create a function named energy_conversion 
// Function converts energy in joule to kilocalorie and watt hour

void energy_conversion()
{   
    // Variable declaration 
    float energy_in_joule;
    double energy_in_kilocalorie;
    double energy_in_watt_hour;
    int choice_energy;    // To choose the conversion
    System.out.print("Welcome to the conversion of energy\n");
    System.out.print("Enter 1-> convert energy in joule to kilocalories or\n"); 
    System.out.print("Enter 2-> convert energy in joule to watt hour\n");
    choice_energy=input.nextInt();    // Taking user input to select choice using scanf
    char quit_energy_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_energy==1)   // If choice is 1 , then following code will do the energy conversion from joule to kilocalories
    {   
      while(quit_energy_conversion!='q')  
       { 
        System.out.print("Enter the energy in joules you want to convert into kilocalories : ");
        try{
        energy_in_joule=input.nextFloat(); // Taking input for the energy in joules
        energy_in_kilocalorie = 0.000239 * energy_in_joule;   // Since 1 joule = 0.000239 kilocalorie
        System.out.print("The value of energy in kilocalorie = "+energy_in_kilocalorie+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_energy_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else if(choice_energy==2) // If choice is 2 , then following code will do the energy conversion from joule to watt hour
    {
      while(quit_energy_conversion!='q')  
       { 
        System.out.print("Enter the energy in joules you want to convert into watt hour : ");
        try{
        energy_in_joule=input.nextFloat();      // Taking input for the energy in joules
        energy_in_watt_hour = 0.000277 * energy_in_joule;  // Since 1 joule = 0.000277 watt hour
        System.out.print("The value of energy in watt hour = "+energy_in_watt_hour+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_energy_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else  // Incorrect choice 
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        energy_conversion();    // Using Recursion we again get back to our function
    }
}

// Create a function named angle_conversion 
// Function converts angle in degree to radian and minute of arc

void angle_conversion()
{   
    // Variable declaration 
    float angle_in_degree;
    double angle_in_radian;
    double angle_in_minute_of_arc;
    int choice_angle;    // To choose the conversion
    System.out.print("Welcome to the conversion of angle\n");
    System.out.print("Enter 1-> convert angle in degree to radian or\n"); 
    System.out.print("Enter 2-> convert angle in degree to minute of arc\n");
    choice_angle=input.nextInt();    // Taking user input to select choice using scanf
    char quit_angle_conversion=' ';   // Character variable which is used to quit the conversion when user enter q
    if(choice_angle==1) // If choice is 1 , then following code will do the angle conversion from degree to radian  
    {   
      while(quit_angle_conversion!='q')  
       { 
        System.out.print("Enter the angle in degree you want to convert into radian : ");
        try{
        angle_in_degree=input.nextFloat(); // Taking input for the angle in degree
        angle_in_radian = 0.01745 * angle_in_degree;   // Since 1 degree = 0.01745 radian
        System.out.print("The value of angle in radian = "+angle_in_radian+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_angle_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else if(choice_angle==2) // If choice is 2 , then following code will do the angle conversion from degree to minute of arc
    {  
      while(quit_angle_conversion!='q')
       {
        System.out.print("Enter the angle in degree you want to convert into minute of arc : ");
        try{
        angle_in_degree=input.nextFloat(); // Taking input for the angle in degree
        angle_in_minute_of_arc = 60 * angle_in_degree;  // Since 1 degree = 60 minute of arc
        System.out.print("The value of angle in minute of arc = "+angle_in_minute_of_arc+"\n");
        }
        catch(Exception e)
            {
                e.getStackTrace();
            }
        System.out.print("If you want to quit , press q otherwise enter any key to continue\n");
        quit_angle_conversion=input.next().charAt(0); // Taking user input that quits or continue the function based on character,user gives 
       }         
        System.out.print("Thank you\n");
    }
    else  // Incorrect choice
    {
        System.out.print("Your choice is incorrect , Please enter the correct choice\n");
        angle_conversion();      // Using Recursion we again get back to our function
    }
}
}
class mini_project
{ 
    public static void main(String[] args)
  {   
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the type of conversion you want to do:\n l->length\n a->area\n v->volume\n s->speed\n w-> weight\n t->temperature\n p->power\n k->pressure\n c->currency\n e->energy\n m->angle \n");
    char character_input; // Taking character input to select the type of conversion  
    character_input=sc.next().charAt(0);
    conversion convert = new conversion();   // Create an object of conversion class
    if (character_input=='l')  // If character 'l' will selected , then length conversion occurs
    {
    convert.length_conversion();
    }
    else if(character_input=='a')   // If character 'a' will selected , then area conversion occurs
    {
    convert.Area_conversion();
    }
    else if(character_input=='v')  // If character 'v' will selected , then volume conversion occurs
    {
    convert.volume_conversion();
    }
    else if(character_input=='s')   // If character 's' will selected , then speed conversion occurs
    {
    convert.speed_conversion();
    }
    else if(character_input=='w')    // If character 'w' will selected , then weight conversion occurs
    {
    convert.weight_conversion();
    }
    else if(character_input=='t')    // If character 't' will selected , then temperature conversion occurs
    {
    convert.temperature_conversion();
    }
    else if(character_input=='p')   // If character 'p' will selected , then power conversion occurs
    {
    convert.power_conversion();
    }
    else if(character_input=='k')   // If character 'k' will selected , then pressure conversion occurs
    {
    convert.pressure_conversion();
    }
    else if(character_input=='c')   // If character 'c' will selected , then currency conversion occurs
    {
    convert.currency_conversion();
    }
    else if(character_input=='e')   // If character 'e' will selected , then energy conversion occurs
    {
    convert.energy_conversion();
    }
    else if(character_input=='m')   // If character 'm' will selected , then angle conversion occurs
    {
    convert.angle_conversion();
    }
    else  // When incorrect character will choosen
    {
    System.out.print("Please enter the correct character");
    }
  }
}


