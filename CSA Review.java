//All samples and information below are created/curated by John Tawfik and is to be used to benefit your understanding
//If you wish to know more or see discrepancies with the info and examples I provide or wish to add to the file, please let me know and use Google to supplement your learning
//Not all code here will compile or run, simply because this is for informational purposes
//If you wish to run an example, copy and paste into a separate vscode/replit file, add necessary import statements and work with it is as you will
//Best way to expand upon your understanding is to sit there and code it out
//Further resources: w3 schools, java documentation, youtube, geeksforgeeks, etc.

import Java.util;

public class Main {
    //Terminology/Theory review
        //Iteration vs Recursion
        //Recursion is when a function repeatedly calls itself within it's code, thus repeatedly executing the instructions present within it. Iteration is when a loop repeatedly executes a set of instructions
        //EXAMPLE: Look at the fibonacci sequence, as if we hope to find the fibonacci of n = 9
        //An iterative approach would start with the idea that we'd find the fibonacci of 0 and 1 then work from there.
        //A recursive approach would note that fib(9) = fib(7) + fib(8), and work down to the fact that fib(0) = 0, then retrace steps going back up to fib(9) 

        //Access modifiers
        //Java has 4 types of access monitors: public, private, protected, and default however we're only looking at public and private
        //Public has the widest scope out of all access specifiers, can be used to set classes, variables, and methods as accessible from everywhere in the program
            //Violates the idea of encapuslation, the process of wrapping code and data into a single unit
            //You can create a fully encapsulated class by making all data members of the class private, where you can then use setter and getter methods to set and get the data
            //NO EXAMPLES PROVIDED AS THIS IS FULLY OUTSIDE THE SCOPE OF CSA
        //Private cannot be used with top-level classes or interfaces. Variables, methods, and classes declared as private can only be accessed in the classes they are declared in or by inheriting the parent class
            //Most restrictive access modifier in java, represents encapuslation
            //Cannot override methods declared as private, if we use the private method with a constructor we keep it from being subclassed
            //Hides classes from other classes within the same package

        //Inheritance
            //Possible to inherit methods and attributes from one class to another, inheritance is grouped into 2 categories
                //SUBCLASS: The class that inherits from another class
                //SUPERCLASS: The class being inherited from
                //The extends keyword is used to represent inheritance 

        //Keywords(only important ones pertinent to CSA and basic java are listed)
            //Abstract: Used for classes and methods, cannot be used to create objects. Abstract method can only be used in an abstract class, and the body is provided by the subclass.
            //Class: Defines a class
            //Do: Used with while to create a do-while loop
            //Final: A non-access modifier used for classes, attributes, methods, makes them impossible to inherit or override
            //If: Makes a conditional statement
            //Return: Finishes the execution of a method, used to return from a method
            //Void: A function will not return anything, and has no return value

        //Difference between Array and ArrayList
        //Besides the syntactical differences, an an Arraylist can be modified as you choose, look for bottom for file(under ArrayList section for more reference)
        
        //Indexing vs Length
        //Indexing of a data structure always starts at zero(array, arrayList, linked list, etc)
            

    //Variable reviews
    int test = 5; //ints are only whole numbers, can be positive or negative
    double decimal = 3.5; //Any numbers positive or negative with a decimal is a double, can only have up to a certain limit of digits
    float repeat = 3.978568; //Doubles with a basically unlimited amount of numbers after the decimal point
    String review = "Use this for review!"; //Anything involving a word or more
    Char a = "a"; //One character
    boolean run = true; //Only set to true or false, commonly used as another level of function verification
    //For booleans as well, if(test) means if boolean test == true the code below will execute

    //Function/Method review
        //Look at the description of public and private functions linked at the top of the file for further information
        //Be sure you know how functions are called, and what execution looks like based off the value returned
        static void print(){
            System.out.println("Hello World!");
        }
        //Method call: print();

        //Passing methods with parameters, method is called parameters
        static void parameters(String z){
            System.out.println("This was passed to the function as a param:" + z);
        }
        //Method call: parameters("John");

        //Using method parameters in a return, method is called returns
        static int returns(int x, int y){
            return x + y;
        }
        //Method call: returns(5,3);
    

    //Loop review
    //Difference between for and while loops: we explicitly know how long a for loop will execute for, but not a while

    for(int y = 0; y <= test; y++){
        //Will run 6 times(counting from 0 -> 5)
        //Note how i is initialized and set, if already present elsewhere in the function it does not have to be set
        //A for loop also contains all runtime conditions necessary in the header(initialization; condition; incrementation)
        //Most commonly used to iterate through a data structure(ie: Arrays, ArrayLists, LinkedLists, etc)
    }

    while(0 < test){
        //Continues to run while test > 0, to "break the loop" you can choose to decrement test, or set it equal to a negative number at the end of the loop
        //ie: test--  or  test = -1;
    }

    while(0 < test && run){
        //While loops allow us to set multiple conditions necessary for function execution
        //This loop only runs while test is greater than zero, and boolean run.equals("true")
        //To keep from an infinite loop, only one condition has to be terminated, so test has to be < 0, or run.equals("false")
        //ie: test--  or  test = -1;  or run.equals(false);
    }

    //Conditional Statements
        //Execute if one or more conditions are met
        //Will only execute once if used alone, can execute multiple times if inside a loop
        //When looking at flow through conditional statements, look at any alterations to the conditions that cause one or more statements to be false
        //Also used to help direct user flow(not applicable for CSA)
        //No {} are needed for one line if/else if/else statements
        if(test == 5){
            System.out.println("If statement was declared true, and this line is printing");
        }
        else if(run){
            System.out.println("Else if statement, the if statement was declared false if this prints");
        }
        else{
            System.out.println("Else statements require no conditions and only execute when all other if and else-if statements are deemed false");
        }

    
    //Arrays 
    //Index based data structure, first element @ 0, second element @ 1, and so on
    //Only contains elements of a similar data type, and we can only store a fixed number of elements
    //Optimizes code, easy to us for retreive or sort data
    //Can be passed to methods as parameters

    int arr = {33,10,5,7,8}; //Declares, instantiates, and initializes the array

    //Printing array using for loop
    //When printing, set the iterative variable to 0, with the condition being the length of the array - 1
    //That fixes the issue of indexing vs length as mentioned above, also looks good when writing responses and is simply good practice
    for(int z = 0; i < arr.length - 1; i++){
        System.out.println(arr[z]);
    }

    //Printing array using for-each loop
    for(int x:arr){
        System.out.println(x);
    }

    //Sorting
    Arrays.sort(arr);

    //2-D Arrays
    int arr2 = {{1,2,3},{4,5,6},{7,8,9}};//Declares and initializes the array

    //Printing 2-D Arrays, have to use nested for loops
    for(int i=0;i<3;i++){  
        for(int j=0;j<3;j++){  
          System.out.print(arr[i][j]+" ");  
        }
    }

    //Sorting 2-D Array, probably won't be present on the exam but good to know
    Arrays.sort(contests, (a, b) -> Integer.compare(a[0],b[0])); //sorting in increasing order
    
    //Array Lists
    //Difference between Arrays and ArrayLists?
    //Size of an array cannot be modified, if you want to add or remove elements you have to create a new one, however elements can be added or removed from an arraylist at will, with no need to manually resize.

    ArrayList<Integer> num = new ArrayList<Integer>();

    //Adding to an ArrayList
    num.add(5);
    num.add(3);

    //Printing an ArrayList
    System.out.println(num);

    //Accessing elements within an ArrayList, have to use the get(index) method
    //Note that this is a read-only function, you cannot modify an element simply be using a get method
    //However, you can set a variable equal to an element using the get method and utilize that in a conditional statement/for loop/etc.
    num.get(0);

    //Modifying elements in an ArrayList, have to use set(index, change)
    //When you use the set method you are writing to an element to change it
    //When using this method be aware of any effect it may have on your code, in terms of searching for an element, looking for conditions in arrayList, data anaylsis within an ArrayList, etc.
    num.set(0, 17);

}


