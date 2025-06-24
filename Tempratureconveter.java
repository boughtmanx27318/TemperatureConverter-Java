import java.util.Scanner;

class main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter!");
        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("Please select the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.println("7. Exit");
        choice = sc.nextInt(); 

        if(choice == 1){
            System.out.println("Please enter the temperature in Celsius:");
            int celsius = sc.nextInt();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);



        }

        if(choice == 2){
            System.out.println("Please enter the temperature in Fahrenheit:");
            int fahrenheit = sc.nextInt();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        }
        if(choice == 3){
            System.out.println("Please enter the temperature in Celsius:");
            int celsius = sc.nextInt();
            double kelvin = celsius + 273.15;
            System.out.println("Temperature in Kelvin: " + kelvin);
        }
        if(choice == 4){
            System.out.println("Please enter the temperature in Kelvin:");
            int kelvin = sc.nextInt();
            double celsius = kelvin - 273.15;
            System.out.println("Temperature in Celsius: " + celsius);
        }
        if(choice == 5){
            System.out.println("Please enter the temperature in Fahrenheit:");
            int fahrenheit = sc.nextInt();
            double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
            System.out.println("Temperature in Kelvin: " + kelvin);

        }

        if(choice == 6){
            System.out.println("Please enter the temperature in Kelvin:");
            int kelvin = sc.nextInt();
            double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }



        

        if(choice == 7){
            System.out.println("Exiting the Temperature Converter. Goodbye Gentle Man!");
            sc.close();
            return;
        }




      

        

       

        
    }
}