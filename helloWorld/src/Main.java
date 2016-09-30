import exercises.MyCollection;
import object.Animal;
import object.Customer;
import object.Employee;
import object.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // single line comment
        /* block comment */
        /**
         * Documentation comment
        * */
        /* TODO: To do comment */
    /*
        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 32767;
        int decimalVariableUpTo = 2147483647;
        long largeDecimalVariableFrom = -3243444;
        long largeDecimalVariableTo = 444447547;
        float numberWithDecimalPlaces = 8.2f;
        double veryLargeNumberWithDecimalPlaces = 3394445556.333;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0055';
        char singleCharacterText = 't';

        long myLong = 12342567777L;
        int myInt = 321;

        myLong = myInt;

        String someText = "string Variable";

        System.out.println(byteVariable);
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpTo);
        System.out.println(largeDecimalVariableFrom);
        System.out.println(largeDecimalVariableTo);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumberWithDecimalPlaces);
        System.out.println(isTrueOrFalse);
        System.out.println(singleCharacter);
        System.out.println(singleCharacterText);
        System.out.println(someText);
        System.out.println(myLong);
*/

        // Objects
        /*Person personName = new Person();
        personName.setFirstName("Pet");
        personName.setLastName("Dog");
        personName.setEmail("abc@gmail.com");*/

        /*Person personSet = new Person("Aba", "Dak","email", 26);

        String setPerson = personSet.getIntroduceYourself();

        String introduce = personName.getIntroduceYourself();

        String theFirstName = personName.getFirstName();
        String theLastName = personName.getLastName();
        String myEmail = personName.getEmail();*/

        /*System.out.println(theFirstName);
        System.out.println(theLastName);
        System.out.println(myEmail);*/
        /*System.out.println(setPerson);
        System.out.println(introduce);*/

        Employee employeeName = new Employee();
        employeeName.setFirstName("EmployeeName");
        employeeName.setLastName("EmpLastName");
        employeeName.setDepartment("CITE");

        String introduceEmployee = employeeName.getIntroduceYourself();
        System.out.println(introduceEmployee);

        Customer customerName = new Customer();
        customerName.setFirstName("Customer");
        customerName.setLastName("LastName");
        customerName.setAddress("San Jose");

        String introduceCustomerName = customerName.getIntroduceYourself();

        String introEmployee = employeeName.getIntroduceYourself();
        String iWork = employeeName.getIWorkHere();

        String introCustom = customerName.getIntroduceYourself();
        String iLive = customerName.getCustomer();
        String prod = customerName.getIntroduceYourself("bottled water");
        int myMoney = customerName.getIntroduceYourself(25);

        System.out.println(introduceCustomerName);
        System.out.println(introEmployee + " " + iWork);
        System.out.println(introCustom + " " + iLive);
        System.out.println(prod);
        System.out.println(prod +" " + "I have" + " " + myMoney + " " + "pesos");

        int ex = 5;

        if (ex >= 3){
            System.out.println("ex is payb!");
        } else {
            System.out.println("ex is not payb");
        }

        /* TODO create an animal class
        * with 3 properties
        * getters and setters
        * integer
        * string
        * boolean
        * */

       /* Animal animalProp = new Animal();
        animalProp.setAnimalType("Bird");
        animalProp.setAnimalLegs(2);
        animalProp.setAnimalComparison(true);

        String animalType = animalProp.getAnimalType();
        Integer animalLegs = animalProp.getAnimalLegs();
        Boolean isItVertebrate = animalProp.isVertebrate();

        System.out.println("Animal Type:" + " " + animalType);
        System.out.println("Animal Legs:" + " " + animalLegs);
        System.out.println("Animal Classification: Is it Vertebrate?" + " " + isItVertebrate);*/

        int a = 1;
        int n = 1;
        int i = 1;
        int sum = 0;

        //while
       /* while (n <= 6){
            System.out.println("["+n+"]");
            n++;
        }*/
       /*while (a <= 6){
           sum += a;
           a++;
       }
        System.out.println("["+sum+"]");*/

        // Do while
        do {
            System.out.print("["+n+"]");
            n++;
        }
        while (n <= 6);

        System.out.println();

        //   for loop
        /*for(i=1; i<=6;i++){
            sum += i;
        }
        System.out.println("["+ +sum +"]");*/

        //array
        /*String[] myArray = new String[];
        String[] myInstructors = {"Neil","Bert","Amille"};

        for(i=0; i<=2; i++){
            //System.out.print(myInstructors[i] +" ");
            if (myInstructors[i] == "Bert"){
                System.out.println("Amante");
            }else{
                System.out.println(myInstructors[i]);
            }
        }*/

        System.out.println(MyCollection.myFrndLst());
        System.out.println(MyCollection.myGrlPrnds());
        System.out.println(MyCollection.derRelation());

        System.out.println(MyCollection.myFrndLst() + " " + MyCollection.derRelation() + " " + MyCollection.myGrlPrnds());

    }
}
