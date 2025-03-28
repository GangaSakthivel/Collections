package com.java.collection;



public class WrapperClass {
    public static void main(String[] args) {
        //Using valueOf() method (recommended)

//        Integer num1 = Integer.valueOf("49");//string to integer
//        Integer num2 = Integer.valueOf(50);
//        System.out.println(num1);
//        System.out.println(num2);

        //autoboxing
        //primitive to wrapper
        //Integer num = 10;

        //unboxing
        //wrapper to primitive
        //int n = num;


//        //string to primitive int
//        int number = Integer.parseInt("233");
//        System.out.println(number);
//
//        String numStr = Integer.toString(293);
//        System.out.println(numStr);


        //String to an integer
        String strNumber = "12344";
        Integer intvalue = Integer.parseInt(strNumber);
        System.out.println(intvalue);

        //Integer to string
        Integer number = 102;
        String numToStr = Integer.toString(number);
        System.out.println(numToStr);

        Integer objOne = 100;
        Integer objTwo = 200;
        System.out.println(objOne.equals(objTwo));
        System.out.println(objOne.compareTo(objTwo));

        //primitive to wrapper class
        int intValue = 100; // Autoboxing
        Integer wrappedValue = intValue;
        System.out.println(wrappedValue);

        //wrapper to primitive class
        Integer wrapperClass = 100; //unboxing
        int integerValue = wrapperClass;
        System.out.println(integerValue);






    }
}
