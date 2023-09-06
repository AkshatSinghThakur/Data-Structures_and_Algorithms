public class methods {

    // Declaring a function or method
    // method is a block of code which executes when it is called in the programm, It is simple a function 
    // Method is declared outside psvm block 
    static void myMethod() {
        System.out.println("This code is written inside a Function or Method in Java.");
    }
    // void means function does not return anything 
    // static means function is declared within the main class and is not an object of the main class

    // Data can also be passed in a method/function as a parameter during calling it.
    // If method is not void type than is should return the type of data which set while declaring the method
    // Method will return the value of that data type which is of the function 
    // datatype conversions can happen in between of the code but eventually the return value should be of that data type which is used in declaring the function
    static int sum(int num1 , int num2){
        int result = num1 + num2;
        return result;
    }


    // This will give error because float number cannot be converted to integer number. Thus the type conbersions which are possible can be done within a method at every stage otherwise it will give error.

    // static int multiply(float number1 , int number2){
    //     int result = number1 * number2;  
    //     return result;
    // } 

    // Method Overloading :- method with same name but different parameters
    // in this case when 3 parameters are passed so the function with 3 arguments will execute and when 2 parametes are passed then function with 2 arguments will be passed
    static int multiply(int num1 , int num2){
        int value = num1*num2;
        return value;
    }
    static float multiply(float num1 , float num2 , float num3){
        float value = num1 * num2 * num3;
        return value;
    }

    public static void main(String[] args) {
        myMethod();  // calling a function/method

        System.out.println(sum(3,4)); // This function takes some data in its parameters
        // the value that a function returns comes to its calling position which can be further used in the code 

        float value = sum(10,12); // return value can be stored in a variable but its data type should be as same as the return type of the method or it can be of the data type to which the return value can be converted . For example if a method returnd integer value so it can be converted to a floating point number value but it cannot be converted to a string value. So the return value can be stored in a variable of float data type but it cannot be a dtring data type.
        System.out.println(value);

        System.out.println(multiply(2,4));;
        System.out.println(multiply(2,4,6));;
    }
}

// Output :- This code is written inside a Function or Method in Java.
//           7
//           22.0
//           8
//           48.0