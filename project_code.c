// WELCOME TO MY PROJECT
// TOPIC : UNIT CONVERTER 
// WITH THE HELP OF THIS , YOU CAN CONVERT ONE UNIT TO DIFFERENT UNITS
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

#include<stdio.h>
// Create a function named length_conversion 
// Function converts length in meter to miles and inches

void length_conversion()
{   
    // Variable declaration 
    float length_in_meter;
    double length_in_inches;
    double length_in_miles;
    int choice_length;    // To choose the conversion
    printf("Welcome to the conversion of length\n");
    printf("Enter 1-> convert length in meter to miles or\n"); 
    printf("Enter 2-> convert length in meter to inches\n");
    scanf("%d",&choice_length);    // Taking user input to select choice using scanf
    char quit_length_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_length==1)  // If choice is 1 , then following code will do the length conversion from meter to miles
    {   
        while(quit_length_conversion!='q')
        {   
            printf("Enter the length in meter you want to convert into miles : ");
            scanf("%f",&length_in_meter);
            if(length_in_meter>0)
            {
            length_in_miles = 0.0006214 * length_in_meter;    // Since 1 meter = 0.0006214 miles
            printf("The value of length in miles = %f\n", length_in_miles);
            printf("If you want to quit , press q otherwise enter any key to continue\n");
            scanf("%s",&quit_length_conversion); // Taking user input that quits or continue the function based on character
            }
            else
            printf("Length never be negative\n");
        }
        printf("Thank you\n");
    }
    else if(choice_length==2) // If choice is 2 , then following code will do the length conversion from meter to inches
    {   
        while(quit_length_conversion!='q')
        {
          printf("Enter the length in meter you want to convert into inches : ");
          scanf("%f",&length_in_meter);
          if(length_in_meter>0)
          {
          length_in_inches = 39.3700787 * length_in_meter;  // Since 1 meter = 39.3700787 inch
          printf("The value of length in inches = %f\n", length_in_inches);
          printf("If you want to quit , press q otherwise enter any key to continue\n");
          scanf("%s",&quit_length_conversion); // Taking user input that quits or continue the function based on character
          }
          else
          printf("Length never be negative\n"); 
        }
        printf("Thank you\n");
    }
    else  // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    char quit_Area_conversion;   // Character variable which is used to quit the conversion when user enter q
    printf("Welcome to the conversion of Area\n");
    printf("Enter 1-> convert Area in meter square to hectares or\n"); 
    printf("Enter 2-> convert Area in meter square to acres\n");
    scanf("%d",&choice_for_area);    // Taking user input to select choice using scanf
    if(choice_for_area==1)  // If choice is 1 , then following code will do the area conversion from meter square to hectares 
    {   
        while(quit_Area_conversion!='q')
        {
           printf("Enter the area in meter square you want to convert into hectares : ");
           scanf("%f",&area_in_meter_square);
           if(area_in_meter_square>0)
           {
           area_in_hectares = 0.0001 * area_in_meter_square;    // Since 1 hectare = 0.0001 meter square
           printf("The value of area in hectares = %f\n", area_in_hectares);
           printf("If you want to quit , press q otherwise enter any key to continue\n");
           scanf("%s",&quit_Area_conversion); // Taking user input that quits or continue the function based on character,user gives
           }
           else 
           printf("Area cannot be negative\n");
        }   
           printf("Thank you\n");
    }    
    else if(choice_for_area==2) // If choice is 2 , then following code will do the area conversion from meter square to acres
    {
        
    while(quit_Area_conversion!='q')    
     {   
        printf("Enter the area in meter square you want to convert into acres : ");
        scanf("%f",&area_in_meter_square);
        if(area_in_meter_square>0)
        {
        area_in_acres = 0.01 * area_in_meter_square;     // Since 1 meter square = 0.01 acres 
        printf("The value of area in acres = %f\n", area_in_acres);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_Area_conversion);  // Taking user input that quits or continue the function based on character,user gives
        }
        else
        printf("Area cannot be negative\n"); 
     }   
        printf("Thank you\n");
    }
    else    // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of volume\n");
    printf("Enter 1-> convert volume in cubic meter to cubic yard or\n"); 
    printf("Enter 2-> convert volume in cubic meter to cubic foot\n");
    scanf("%d",&choice_volume);    // Taking user input to select choice using scanf
    char quit_volume_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_volume==1)   // If choice is 1 , then following code will do the volume conversion from cubic meter to cubic yard
    {   
     while(quit_volume_conversion!='q')   
      {  
        printf("Enter the volume in cubic meter you want to convert into cubic yard : ");
        scanf("%f",&volume_in_cubic_meter);
        if(volume_in_cubic_meter>0)
        {
        volume_in_cubic_yard = 1.3079528 * volume_in_cubic_meter;    // Since 1 cubic meter = 1.3079528 cubic yard
        printf("The value of volume in cubic yard = %f\n", volume_in_cubic_yard);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_volume_conversion); // Taking user input that quits or continue the function based on character,user gives
        }
        else
        printf("Volume cannot be negative\n"); 
      }
        printf("Thank you\n");
    }
    else if(choice_volume==2)  // If choice is 2 , then following code will do the volume conversion from cubic meter to cubic foot
    {
      while(quit_volume_conversion!='q')
       {    
        printf("Enter the volume in cubic meter you want to convert into cubic foot : ");
        scanf("%f",&volume_in_cubic_meter);
        if(volume_in_cubic_meter>0)
        {
        volume_in_cubic_foot = 35.3147248 * volume_in_cubic_meter;  // Since 1 cubic meter = 35.3147248 cubic foot
        printf("The value of volume in cubic foot = %f\n", volume_in_cubic_foot);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_volume_conversion);  // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Volume cannot be negative\n");
       }
        printf("Thank you\n");
    }
    else     // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of speed\n");
    printf("Enter 1-> convert speed in meter per second to kilometer per hour or\n"); 
    printf("Enter 2-> convert speed in meter per second to mile per hour\n");
    scanf("%d",&choice_speed);    // Taking user input to select choice using scanf
    char quit_speed_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_speed==1)  // If choice is 2 , then following code will do the speed conversion from meter per second to kilometer per hour
    {   
      while(quit_speed_conversion!='q')  
       {
        printf("Enter the speed in meter per second you want to convert into kilometer per hour : ");
        scanf("%f",&speed_in_meter_per_second);
        if(speed_in_meter_per_second>0)
        {
        speed_in_kilometer_per_hour = 3.6 * speed_in_meter_per_second;    // Since 1 meter per second = 3.6 kilometer per hour
        printf("The value of speed in kilometer per hour = %f\n", speed_in_kilometer_per_hour);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_speed_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Speed can't be negative\n");
       }
        printf("Thank you\n");
    }
    else if(choice_speed==2)  // If choice is 2 , then following code will do the speed conversion from meter per second to mile per hour
    {
      while(quit_speed_conversion!='q')  
       { 
        printf("Enter the speed in meter per second you want to convert into mile per hour : ");
        scanf("%f",&speed_in_meter_per_second);
        if(speed_in_meter_per_second>0)
        {
        speed_in_mile_per_hour = 2.236936 * speed_in_meter_per_second;  // Since 1 meter per second = 2.236936 mile per hour
        printf("The value of speed in mile per hour = %f\n", speed_in_mile_per_hour);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_speed_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Speed can't be negative\n");
       }    
        printf("Thank you\n");
    }
    else    // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of weight\n");
    printf("Enter 1-> convert weight in gram to ounce or\n"); 
    printf("Enter 2-> convert weight in gram to pound\n");
    scanf("%d",&choice_weight);    // Taking user input to select choice using scanf
    char quit_weight_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_weight==1) // If choice is 1 , then following code will do the weight conversion from gram to ounce
    {   
      while(quit_weight_conversion!='q')
       {  
        printf("Enter the weight in gram you want to convert into ounce : ");
        scanf("%f",&weight_in_gram);
        if(weight_in_gram>0)
        {
        weight_in_ounce = 0.035 * weight_in_gram;    // Since 1 gram = 0.035 ounce
        printf("The value of weight in ounce = %f\n", weight_in_ounce);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_weight_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Weight can't be negative\n");
       } 
        printf("Thank you\n");
    }
    else if(choice_weight==2) // If choice is 2 , then following code will do the weight conversion from gram to pound
    {
       while(quit_weight_conversion!='q')
       { 
        printf("Enter the weight in gram you want to convert into pound : ");
        scanf("%f",&weight_in_gram);
        if(weight_in_gram>0)
        {
        weight_in_pound = 0.0022 * weight_in_gram;  // Since 1 gram = 0.0022 pound
        printf("The value of weight in pound = %f\n", weight_in_pound);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_weight_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Weight can't be negative\n");
       }  
        printf("Thank you\n");
    }
    else     // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of temperature\n");
    printf("Enter 1-> convert temperature in degree fahrenheit to celsius or\n"); 
    printf("Enter 2-> convert temperature in degree fahrenheit to kelvin\n");
    scanf("%d",&choice_temp);    // Taking user input to select choice using scanf
    char quit_temperature_conversion;  // Character variable which is used to quit the conversion when user enter q
    if(choice_temp==1) // If choice is 1 , then following code will do the temperature conversion from fahrenheit to celsius
    { 
      while(quit_temperature_conversion!='q')
       {    
        printf("Enter the temperature in degree fahrenheit you want to convert into celsius : ");
        scanf("%f",&temp_in_degree_fahrenheit);
        temp_in_degree_celsius = ((temp_in_degree_fahrenheit-32)*(5/9));   // Celsius=(Fahrenheit-32)*(5/9)
        printf("The value of temperature in degree celcius = %f\n", temp_in_degree_celsius);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_temperature_conversion); // Taking user input that quits or continue the function based on character,user gives 
       }  
        printf("Thank you\n");
    }
    else if(choice_temp==2)  // If choice is 2 , then following code will do the temperature conversion from fahrenheit to kelvin
    {
      while(quit_temperature_conversion!='q')
       {   
        printf("Enter the temperature in degree fahrenheit you want to convert into kelvin : ");
        scanf("%f",&temp_in_degree_fahrenheit);
        temp_in_kelvin = ((temp_in_degree_fahrenheit - 32)*(5/9)) + 273.15;  // Kelvin=(Fahrenheit-32)*(5/9)+273.15
        printf("The value of temperature in kelvin = %f\n", temp_in_kelvin);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_temperature_conversion); // Taking user input that quits or continue the function based on character,user gives 
       }  
        printf("Thank you\n");
    }
    else   // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of power\n");
    printf("Enter 1-> convert power in watt to power in kilogram meter per second or\n"); 
    printf("Enter 2-> convert power in watt to power in imperial horsepower\n");
    scanf("%d",&choice_power);    // Taking user input to select choice using scanf
    char quit_power_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_power==1) // If choice is 1 , then following code will do the power conversion from watt to kg meter per second
    {   
      while(quit_power_conversion!='q')
       {  
        printf("Enter the power in watt you want to convert into kilogram meter per second : ");
        scanf("%f",&power_in_watt); // Taking input for the power in watt 
        if(power_in_watt>0)
        {
        power_in_Kilogram_meter_per_second = 0.101971 * power_in_watt;   // Since 1 Watt = 0.101971 kilogram meter per second 
        printf("The value of power in kilogram meter per second = %f\n", power_in_Kilogram_meter_per_second);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_power_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Power can't be negative\n");
       }        
        printf("Thank you\n");
    }
    else if(choice_power==2) // If choice is 2 , then following code will do the power conversion from watt to horsepower
    {
      while(quit_power_conversion!='q')
       {  
        printf("Enter the power in watt you want to convert into imperial horsepower : ");
        scanf("%f",&power_in_watt);
        if(power_in_watt>0)
        {
        power_in_imperial_horsepower = 0.00134102 * power_in_watt;  // Since 1 Watt = 0.00134102 imperial horsepower
        printf("The value of power in imperial horsepower = %f\n", power_in_imperial_horsepower);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_power_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Power can't be negative\n");
       }         
        printf("Thank you\n");
    }
    else // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of pressure\n");
    printf("Enter 1-> convert pressure in atm to millimeter of mercury or\n"); 
    printf("Enter 2-> convert pressure in atm to pressure in kilopascal\n");
    scanf("%d",&choice_pressure);    // Taking user input to select choice using scanf
    char quit_pressure_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_pressure==1) // If choice is 1 , then following code will do the pressure conversion from atm to mm of Hg
    {   
       while(quit_pressure_conversion!='q')
       { 
        printf("Enter the pressure in atm you want to convert into mm of Hg : ");
        scanf("%f",&pressure_in_atm); // Taking input for the power in watt 
        if(pressure_in_atm>0)
        {
        pressure_in_millimeter_of_mercury = 760 * pressure_in_atm;   // Since 1 atm = 760 mm of Hg 
        printf("The value of pressure in millimeter of mercury = %f\n", pressure_in_millimeter_of_mercury);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_pressure_conversion); // Taking user input that quits or continue the function based on character,user gives
        }
        else
        printf("Pressure can't be negative\n"); 
       }
        printf("Thank you\n");
    }
    else if(choice_pressure==2)  // If choice is 2 , then following code will do the pressure conversion from atm to kilopascal
    {
      while(quit_pressure_conversion!='q')  
       {
        printf("Enter the pressure in atm you want to convert into kilopascal : ");
        scanf("%f",&pressure_in_atm);
        if(pressure_in_atm>0)
        {
        pressure_in_kilopascal = 101.325 * pressure_in_atm;  // Since 1 atm = 101.325 kilopascal
        printf("The value of pressure in kilopascal = %f\n", pressure_in_kilopascal);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_pressure_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Pressure can't be negative\n");
       }         
        printf("Thank you\n");
    }
    else  // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of currency\n");
    printf("Enter 1-> convert currency in US dollar to Indian rupees or\n"); 
    printf("Enter 2-> convert currency in US dollar to pound\n");
    scanf("%d",&choice_currency);    // Taking user input to select choice using scanf
    char quit_currency_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_currency==1)  // If choice is 1 , then following code will do the currency conversion from US dollar to rupees
    {   
      while(quit_currency_conversion!='q')  
       { 
        printf("Enter the currency in US Dollar you want to convert into Indian Rupees : ");
        scanf("%f",&currency_in_US_dollar); // Taking input for the currency in US dollar
        if(currency_in_US_dollar>0)
        {
        currency_in_rupees = 80.975 * currency_in_US_dollar;   // Since 1 US Dollar = 80.975 rupees 
        printf("The value of currency in Indian rupees = %f\n", currency_in_rupees);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_currency_conversion);  // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Currency can't be negative\n");
       }         
        printf("Thank you\n");
    }
    else if(choice_currency==2) // If choice is 2 , then following code will do the currency conversion from US dollar to pounds
    {
      while(quit_currency_conversion!='q')  
       { 
        printf("Enter the currency in US Dollar you want to convert into pounds : ");
        scanf("%f",&currency_in_US_dollar);
        if(currency_in_US_dollar>0)
        {
        currency_in_pound = 24.46 * currency_in_US_dollar;  // Since 1 US Dollar = 24.46 pound
        printf("The value of currency in pound = %f\n", currency_in_pound);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_currency_conversion); // Taking user input that quits or continue the function based on character,user gives
        }
        else
        printf("Currency can't be negative\n"); 
       }         
        printf("Thank you\n");
    }
    else  // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of energy\n");
    printf("Enter 1-> convert energy in joule to kilocalories or\n"); 
    printf("Enter 2-> convert energy in joule to watt hour\n");
    scanf("%d",&choice_energy);    // Taking user input to select choice using scanf
    char quit_energy_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_energy==1)   // If choice is 1 , then following code will do the energy conversion from joule to kilocalories
    {   
      while(quit_energy_conversion!='q')  
       { 
        printf("Enter the energy in joules you want to convert into kilocalories : ");
        scanf("%f",&energy_in_joule); // Taking input for the energy in joules
        if(energy_in_joule>0)
        {
        energy_in_kilocalorie = 0.000239 * energy_in_joule;   // Since 1 joule = 0.000239 kilocalorie
        printf("The value of energy in kilocalorie = %f\n", energy_in_kilocalorie);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_energy_conversion); // Taking user input that quits or continue the function based on character,user gives
        }
        else
        printf("Energy can't be negative\n"); 
       }         
        printf("Thank you\n");
    }
    else if(choice_energy==2) // If choice is 2 , then following code will do the energy conversion from joule to watt hour
    {
      while(quit_energy_conversion!='q')  
       { 
        printf("Enter the energy in joules you want to convert into watt hour : ");
        scanf("%f",&energy_in_joule);      // Taking input for the energy in joules
        if(energy_in_joule>0)
        {
        energy_in_watt_hour = 0.000277 * energy_in_joule;  // Since 1 joule = 0.000277 watt hour
        printf("The value of energy in watt hour = %f\n", energy_in_watt_hour);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_energy_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Energy can't be negative\n");
       }         
        printf("Thank you\n");
    }
    else  // Incorrect choice 
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
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
    printf("Welcome to the conversion of angle\n");
    printf("Enter 1-> convert angle in degree to radian or\n"); 
    printf("Enter 2-> convert angle in degree to minute of arc\n");
    scanf("%d",&choice_angle);    // Taking user input to select choice using scanf
    char quit_angle_conversion;   // Character variable which is used to quit the conversion when user enter q
    if(choice_angle==1) // If choice is 1 , then following code will do the angle conversion from degree to radian  
    {   
      while(quit_angle_conversion!='q')  
       { 
        printf("Enter the angle in degree you want to convert into radian : ");
        scanf("%f",&angle_in_degree); // Taking input for the angle in degree
        if(angle_in_degree>0)
        {
        angle_in_radian = 0.01745 * angle_in_degree;   // Since 1 degree = 0.01745 radian
        printf("The value of angle in radian = %f\n", angle_in_radian);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_angle_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Angle can't be negative\n");
       }         
        printf("Thank you\n");
    }
    else if(choice_angle==2) // If choice is 2 , then following code will do the angle conversion from degree to minute of arc
    {  
      while(quit_angle_conversion!='q')
       {
        printf("Enter the angle in degree you want to convert into minute of arc : ");
        scanf("%f",&angle_in_degree); // Taking input for the angle in degree
        if(angle_in_degree>0)
        {
        angle_in_minute_of_arc = 60 * angle_in_degree;  // Since 1 degree = 60 minute of arc
        printf("The value of angle in minute of arc = %f\n", angle_in_minute_of_arc);
        printf("If you want to quit , press q otherwise enter any key to continue\n");
        scanf("%s",&quit_angle_conversion); // Taking user input that quits or continue the function based on character,user gives 
        }
        else
        printf("Angle can't be negative\n");
       }         
        printf("Thank you\n");
    }
    else  // Incorrect choice
    {
        printf("Your choice is incorrect , Please enter the correct choice\n");
        angle_conversion();      // Using Recursion we again get back to our function
    }
}

int main()
{   
    printf("Enter the type of conversion you want to do:\n  l->length\n  a->area\n  v->volume\n  s->speed\n  w-> weight\n  t-> temperature\n  p-> power\n  k-> pressure\n  c->currency\n  e-> energy\n  m-> angle \n");
    char character_input; // Taking character input to select the type of conversion  
    character_input=getchar();
    if (character_input=='l')  // If character 'l' will selected , then length conversion occurs
    {
    length_conversion();
    }
    else if(character_input=='a')   // If character 'a' will selected , then area conversion occurs
    {
    Area_conversion();
    }
    else if(character_input=='v')  // If character 'v' will selected , then volume conversion occurs
    {
    volume_conversion();
    }
    else if(character_input=='s')   // If character 's' will selected , then speed conversion occurs
    {
    speed_conversion();
    }
    else if(character_input=='w')    // If character 'w' will selected , then weight conversion occurs
    {
    weight_conversion();
    }
    else if(character_input=='t')    // If character 't' will selected , then temperature conversion occurs
    {
    temperature_conversion();
    }
    else if(character_input=='p')   // If character 'p' will selected , then power conversion occurs
    {
    power_conversion();
    }
    else if(character_input=='k')   // If character 'k' will selected , then pressure conversion occurs
    {
    pressure_conversion();
    }
    else if(character_input=='c')   // If character 'c' will selected , then currency conversion occurs
    {
    currency_conversion();
    }
    else if(character_input=='e')   // If character 'e' will selected , then energy conversion occurs
    {
    energy_conversion();
    }
    else if(character_input=='m')   // If character 'm' will selected , then angle conversion occurs
    {
    angle_conversion();
    }
    else  // When incorrect character will choosen
    {
    printf("Please enter the correct character");
    }
    return 0;
}

