import java.lang.module.ModuleDescriptor.Provides;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;

public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.id = generateId();
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
        this.id = generateId();
        this.grade = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;-
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return name + " is a " + grade 
                + "th grade student. Their id is " + id + ".";
    }

    public Boolean equals(Student other) {
        if (this.name.equals(other.name) 
            && this.id.equals(other.id) 
            && this.grade == other.grade) {
            return true;
        } else {
            return false;
        }
    }

    public String generateId() {
        String id = "";
        id += (int) ((Math.random()) * 7) + 1;
        id += (int) ((Math.random()) * 7) + 1;
        id += (int) ((Math.random()) * 7) + 1;
        id += "-";
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        id += (int) ((Math.random()) * 10);
        return id;
    }

    // print vs println
    System.out.print("This stays on the same line. ");
    System.out.println("This goes to the next line.");

    // Using printf for formatting
    System.out.printf("Pi to 2 decimal places: %.2f\n", 3.14159);

    // Using escape sequences
    System.out.println("First line\nSecond line\tTabbed over");

    // variable
    int x = func;
    // method: in this case, return double + no need parameter
    double y = func();
    // camelCaseFormat

    // <<modifier>> <<Data Type>> <<Method Name/identifier>>(<<Optional Parameters>>){method body}
    public int getAgeOfDog(){}

    // Methods can return any data type, such as String, boolean, Monster, 
    // Pokemon, or double, but the return value must match the method's declared return type.
    // for Monster and Pokemon, you need to write a class to make this data type function.

    // return; means exit the method = void

    // To invoke (use or call) a method in Java, 
    // you need to provide the method name and all required parameters inside parentheses.
    public int multiplyNumbers(int a, int b) {
        return a * b;
    } // a and b are parameter, 2 and 3 are arguments.
    int y = multiplyNumbers(2, 3);

    // 1. Relational conditions compare values using operators that evaluate their relative sizes.
    // These operators include < (less than), > (greater than), <= (less than or equal to), and >= (greater than or equal to).

    // 2. Equality conditions compare if two values are exactly the same (`==`) or different (`!=`).
    // For primitive types (int, boolean, etc.): Use `==`
    // For objects (String, custom classes, etc.): Use `equals()` method
    
    // to initiate String: String str1 = new String("Hello");

    // 3. ### Logical Conditions
    // AND (&&): Both conditions must be true
    // OR (||): At least one condition must be true

    // 4. Method Conditions
    // use functions to evaluate objects or check specific properties.
    // They are essential when working with complex data types like Strings, Arrays, and custom objects.
    // Example: Using String methods for condition checks
    // String name = "Alice";
    // // Check exact string match
    // if(name.equals("Alice")) {
    //     System.out.println("Welcome back, Alice!");
    // }
    // // Check string prefix
    // if(name.startsWith("A")) {
    //     System.out.println("Name starts with A");
    // }

    // .equals()	Object equality	str.equals("hello")
    // .startsWith()	String starts with	name.startsWith("J")
    // .isEmpty()	Collection is empty	list.isEmpty()


    // An if-else statement is a control structure in programming that lets your code make decisions.
    // It executes one block of code when a condition is true and a different block when the condition is false.

    // if (<<Boolean Condition1>>) {
    // code to execute when condition 1 is true
    // } else if (<<Boolean Condition2>>) {
    //     // code to execute when condition 2 is true
    // } else if (<<Boolean Condition3>>) {
    //     // code to execute when condition 3 is true
    // } else {
    //         // code to execute when condition is false
    // }

    // ### Order of Operations of an If-Else Statement
    // When Java encounters an if-else statement, it:
    // 1. Evaluates the boolean condition in parentheses
    // 2. Executes the first block of code, if the condition is `true`
    // 3. Executes the `else` block, if the condition is `false`

    // **Important points about if-else if-else chains:**
    // - Conditions are checked sequentially from top to bottom
    // - When a condition evaluates to true, its code block executes and any remaining conditions are skipped
    // - The final `else` block is optional and acts as a catch-all for when no conditions are met
    // - You can include as many `else if` statements as necessary

    // If-statements are control structures in programming that allow your code to make decisions. They execute code blocks only when specified conditions evaluate to `true`.
    // If-statements evaluate their `boolean` condition first. When the condition is `true`, the code within the if-statement executes. When it's `false`, the code is skipped.
    // - Avoid redundant comparisons with `true` or `false`: Instead of writing `if (isRaining == true)`, simply write `if (isRaining)`

    // Math.abs()	Returns absolute value	Math.abs(-5.5)	5.5
    // Math.round()	Rounds to nearest integer	Math.round(3.5)	4
    // Math.max()	Returns larger of two values	Math.max(5, 9)	9
    // Math.min()	Returns smaller of two values	Math.min(5, 9)	5
    // Math.pow()	Calculates a number raised to a power	Math.pow(2, 3)	8.0
    // Math.sqrt()	Calculates square root	Math.sqrt(25)	5.0
    // Math.random()	Returns random number between 0.0-1.0	Math.random()	0.7531...
    // Math.sin()	Calculates sine (in radians)	Math.sin(Math.PI/2)	1.0
    // Math.cos()	Calculates cosine (in radians)	Math.cos(Math.PI)	-1.0
    // Math.tan()	Calculates tangent (in radians)	Math.tan(Math.PI/4)	1.0

    // 1	Generate a random decimal between 0.0 (inclusive) and 1.0 (exclusive)	Math.random()	A double between [0, 1)
    // 2	Multiply by the range size (max - min)	Math.random() * 53	A double between [0, 53)
    // 3	Add the minimum value to shift the range	Math.random() * 53 + 1	A double between [1, 54)
    // 4	Cast to an integer to get a whole number	(int)(Math.random() * 53 + 1)	An int between [1, 53]

    // - **min** is the inclusive lower bound
    // - **max** is the exclusive upper bound
    // - **Math.random()** returns a double value between 0.0 (inclusive) and 1.0 (exclusive)

    // Classes are collections of related instance variables (attributes) and methods (behaviors) that, when bundled together, represent a new data type.
    // A class serves as a *blueprint* for creating new data types and constructing custom objects, 
    // forming the foundation of object-oriented programming. Just like architects use blueprints to construct buildings, programmers use classes to create objects with specific properties and behaviors.

    // The Car class is like the manufacturing blueprint that contains descriptions and measurements for each component of the car.
    // - The blueprint (**class**) is NOT the car itself.
    // - The car's characteristics (engine size, fuel efficiency, color, etc.) are its **instance variables**.
    // - The car's functions and behaviors (radio, locks, GPS, etc.) are its **methods**.
    // - When a factory builds (**constructs, instantiates**) a car, that car is an now an **object**.

    // The `new` keyword instantiates objects from a class blueprint. This essential process involves three steps:
    // - Reserving memory space in the computer for the new object
    // - Calling the constructor to initialize the object's attributes with specific values
    // - Returning a reference (memory address) that allows your code to access and manipulate the object
    // Each object exists independently in memory with its own unique state

    // Methods represent the behaviors and actions that objects can perform. They define the functionality and capabilities of each object instance.
    Car myCar = new Car("Toyota", "Camry", 2025);
    myCar.startEngine();         // Starting the car's engine
    myCar.accelerate(55);        // Accelerating to 55 mph
    myCar.turnOnHeadlights();    // Turning on the headlights
    // Static methods offer utility functions that don't require a specific object instance. They provide common operations relevant to a class as a whole rather than to individual objects.
    // Using static methods - no Car object needed
    Car.convertMilesToKilometers(100);     // Returns 160.9 kilometers
    Car.calculateFuelEfficiency(350, 14);  // Returns MPG for distance and gallons
    Car.isValidVIN("1HGCM82633A123456");   // Validates a Vehicle Identification Number

    // Instance variables are fields declared within a class that store data for each object. They represent attributes of the associated class type and are unique to each instance of the class.
    // - Represent the "state" or "attributes" of an object that persist throughout its lifetime
    // - Are ***declared*** within a class but ***defined*** by constructors and methods
    // - Maintain a separate copy for each object instance
    // - Can have their access controlled through modifiers (`private`, `public`), with `private` preferred for encapsulation
    // - Initialize automatically with type-specific default values (`0`, `false`, `null`) when not explicitly set
    
    // Instance variables should typically be declared as private to maintain encapsulation. 
    // byte, short, int, long	default; 0	int counter; // counter = 0
    // float, double	0.0	double price; // price = 0.0
    // boolean	false	boolean isActive; // isActive = false
    // char	'\u0000' (null character)	char grade; // grade = '\u0000'
    // Object references	null	String name; // name = null

    // - Always initialize instance variables in constructors or initialization blocks to ensure proper object state
    // - Choose clear, descriptive names that reflect the variable's purpose and meaning
    // - Mark variables as `final` when their values shouldn't change after initialization
    // - Include validations in setter methods to prevent invalid values

    // A constructor is a special method that creates and initializes objects in object-oriented programming.
    // It serves as a stencil that defines how Java builds an object of your class. 
    // Whenever you create a new object with the `new` keyword, a constructor is automatically called.

    // Syntax: 
    public class Car {
        private String model;
        private int year;
        private double mileage;

        public Car(String model, int year, double mileage) {
            this.model = model;
            this.year = year;
            this.mileage = mileage;
        }
        
        public String getModel(){
            return model;
        }
    }

    // To create a Car object, we use the constructor by invoking the new keyword followed by the constructor call:
    // Create a new Car object with specific initial values
    Car myCar = new Car("Toyota Prius", 2024, 0.0);
    // The constructor sets:
    // - model = "Toyota Prius"
    // - year = 2024
    // - mileage = 0.0
    // We can now use the fully initialized object
    System.out.println("My new " + myCar.getModel() + " is ready to drive!");

    // Java automatically provides a default no-argument constructor when you don't define any constructors yourself.
    // This implicit constructor initializes fields to their default values (null for objects, 0 for numeric types, false for booleans).
    // Relying on Java’s implicit constructors results in uninitialized instance variables and can lead to NullPointerException errors at runtime.

    //Constructor overloading allows a class to have multiple constructors with different parameter lists, providing flexibility in object initialization:
    public class Car {
        private String model;
        private int year;
        private double mileage;
        // Default constructor - creates a standard new car
        public Car() {
            this("Unknown", 2024, 0.0);  // Calls the full constructor
        }
        // Partial constructor - when we know model and year
        public Car(String model, int year) {
            this(model, year, 0.0);  // Calls the full constructor with default mileage
        }
        // Full constructor - complete initialization
        public Car(String model, int year, double mileage) {
            // Validate parameters to ensure valid object state
            if (model == null) {
                model = "Unknown";
            }
            if (year < 1886) {  // First automobile was built in 1886
                year = 2024;    // Default to current year if invalid
            }
            if (mileage < 0) {
                mileage = 0.0;  // Mileage cannot be negative
            }
            // Initialize instance variables
            this.model = model;
            this.year = year;
            this.mileage = mileage;
        }
    }
    // With constructor overloading, you can create objects with different levels of information:
    // Creating cars with different constructors
    // Model: "Unknown", Year: 2024, Mileage: 0.0
    Car defaultCar = new Car();
    // Model: "Honda Civic", Year: 2023, Mileage: 0.0
    Car newCar = new Car("Honda Civic", 2023);
    // With complete details
    Car usedCar = new Car("Toyota Camry", 2021, 15000.5); 

    // Constructor chaining refers to the practice of having one constructor call another constructor within the same class using the `this()` keyword.
    // This technique must be the first statement in the constructor.
    // Constructor chaining helps reduce code duplication and ensures consistent initialization across different constructor overloads.


    // Getter methods (also known as accessor methods) are special methods in Java that provide controlled access to private instance variables within a class.
    // While setter methods change values, getters simply retrieve and return the current value without modifying it.
    // Following standard Java naming conventions, getter methods are named by combining the prefix `get` with the capitalized name of the variable they access. For example:
    // - For a variable named `name`, the getter would be `getName()`
    // - For a variable named `age`, the getter would be `getAge()`
    // Syntax: 
    public returnType getVariableName() {
        return variableName;
    }
    // **Let's break down this syntax:**
    // - **Access modifier:** Usually `public` to allow access from other classes
    // - **Return type:** Must match the data type of the variable being accessed
    // - **Method name:** Starts with `get` followed by the variable name (with first letter capitalized)
    // - **No parameters:** Getters typically don't accept any parameters
    // - **Return statement:** Simply returns the value of the private variable
    
    // For boolean variables, the convention is slightly different. Instead of `get`, the prefix `is` is often used:
    public boolean isActive() {
        return active;
    }

    // Setter methods (also known as mutator methods) are special methods in Java that provide controlled modification of private instance variables within a class. While getter methods retrieve values, setters change the values of instance variables by accepting parameters.
    // Following standard Java naming conventions, setter methods are named by combining the prefix `set` with the capitalized name of the variable they modify. For example:
    // - For a variable named `name`, the setter would be `setName(String name)`
    // - For a variable named `age`, the setter would be `setAge(int age)`
    public void setVariableName(dataType variableName) {
        this.variableName = variableName;
    }
    // - **Access modifier:** Usually `public` to allow access from other classes
    // - **Return type:** Almost always `void` since setters typically don't return values
    // - **Method name:** Starts with `set` followed by the variable name (with first letter capitalized)
    // - **Parameters:** Accepts one parameter of the same type as the variable being modified
    // - **Assignment:** Uses `this` keyword to assign the parameter value to the instance variable
    // - Validate parameters to ensure data integrity
    // - Design setters to modify only one property at a time
    // - Use parameter names that clearly match their corresponding instance variables

    // The `toString()` method in Java is a built-in method inherited from the `Object` class that returns a string representation of an object. 
    // When you print an object directly with `System.out.println()`, Java automatically calls this method.
    // By default, it returns the class name followed by the object's memory address (in hexadecimal), but you can override it to provide more meaningful information about your object's state.
    // A well-implemented `toString()` method is valuable for debugging, logging, and making your code more readable.

    // When not overridden, the toString() method returns a string consisting of:
    getClass().getName() + '@' + Integer.toHexString(hashCode())
    // Which produces an output like: Rectangle@7852e922
    // - Include all relevant instance variables
    // - Present information in a clean, readable format
    // - Provide consistent output for debugging purposes
    // Syntax:
    public String toString() {
        return "String representation of the object";
    }
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    // The `.equals()` method in Java is a built-in method inherited from the `Object` class that determines if two objects are equal.
    // The method returns `true` if the objects match according to the defined criteria, and `false` otherwise.
    // When you compare objects in Java, using the `==` operator only checks if two references point to the same memory location.
    // By contrast, `.equals()` compares the actual content or state of the objects. By default, it behaves like `==` (comparing references), but you can override it to define custom equality logic based on object attributes.
    // A well-implemented `.equals()` method is essential for proper object comparison, collections functionality, and maintaining data integrity in your applications.
    public class Student {
        private String name;
        private int age;
            
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Custom equals method with Student parameter
        public boolean equals(Student other) {
            
            return this.age == other.age &&
                this.name.equals(other.name);
        }
    }
    // - Always override `equals()` when you create classes where object equality is important
    // - When comparing objects like `String` and `Rectangle`, always use the `.equals()` method.
    // For primitive types (int, double, boolean, etc.), use the equality operator `==`.
    // - Always override `hashCode()` when you override `equals()` to maintain the contract between these methods
    // - Use the proper parameter type (`Object obj`) to correctly override the method from the Object class

    // Tester classes are specialized Java classes that check if other classes in your application work correctly. Think of them as quality control tools that verify your code performs as intended under different scenarios.
    // While your other classes contain actual program logic, tester classes focus solely on validation.
    // They work by creating objects from your other classes, running their methods with various inputs, and comparing the results against expected outcomes to catch any errors.
    // Tester classes require a specific entry point to begin execution called the `main` method.

    // - **Separation of concerns:** Placing test code in separate files keeps your main program code clean and focused on its primary functionality
    // - **Comprehensive testing:** Dedicated test classes allow you to thoroughly check all methods, including normal cases, edge cases, and error scenarios
    // - **Documentation:** Tests demonstrate the intended usage of your classes, serving as practical examples for other developers
    // - **Integration with frameworks:** While simple tester classes work for beginners, professional development often uses testing frameworks like JUnit for more powerful features

    // **Benefits of Dedicated Test Classes:**
    // - Keeps your main code clean and focused on core functionality
    // - Provides a structured approach to organizing test cases
    // - Makes debugging easier by isolating test failures
    // - Allows you to test multiple scenarios in one place

    // **The `this` Keyword in Java:** 
    // In Java, the `this` keyword refers to the current object instance. It provides a way to access instance variables and methods from within instance methods, constructors, and other non-static contexts.
    // Here are the main uses of the `this` keyword:
    // 1. **To access instance variables**: When a local variable has the same name as an instance variable, `this` helps distinguish the instance variable. For example: `this.name = name;`
    // 2. **As a method parameter**: You can pass the current object instance to another method using `this` as an argument
    // 3. **To call other constructors**: Using `this()` as the first statement in a constructor allows you to call another constructor in the same class, helping reduce code duplication
    // 4. **For method chaining**: Returning `this` from a method allows you to chain multiple method calls together, like `obj.method1().method2()`
    // Remember that `this` cannot be used in static methods or static contexts, as these operate at the class level rather than the instance level.
    // Previous: Setter method pattern
    public void setName(String nameValue) {
        name = nameValue; 
    } 
    // New: Setter method pattern
    public void setName(String name) {
        this.name = name;  // 'this' refers to the instance variable
    }

    // The equals() method commonly uses this to compare the current object with another:
    public boolean equals(Student other) {
        return this.grade == other.grade && 
                this.name.equals(other.name);
        }
    }
}
