# Basic Java Syntax

## 1. Structure of a Java Program
A simple Java program consists of the following elements:

- **Class Declaration**: Every Java application must have at least one class definition.
- **Main Method**: The entry point for any Java application is the `main` method.
- **Statements**: Instructions that the program executes.

### Example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 2. Key Syntax Rules
- Every statement ends with a semicolon (`;`).
- Curly braces `{}` define the beginning and end of code blocks.
- Java is case-sensitive (`Main` and `main` are different).
- Class names should start with an uppercase letter by convention.

## 3. Compiling and Running Java Code from the Terminal

### Step 1: Save Your Code
Save your Java code in a file with a `.java` extension. For example: `HelloWorld.java`.

### Step 2: Open Terminal
Navigate to the directory containing your `.java` file.

### Step 3: Compile the Code
Use the `javac` command to compile your code:
```sh
javac HelloWorld.java
```
This will generate a `HelloWorld.class` file if there are no errors.

### Step 4: Run the Program
Use the `java` command to run the compiled class:
```sh
java HelloWorld
```
You should see the output:
```
Hello, World!
```

## 4. Behind the Scene: How JVM Loads and Executes Your Program

When you run `java HelloWorld`, the following steps happen behind the scenes:

```mermaid
flowchart TD
    A[JVM Startup] --> B[Class Loading]
    B --> C[Bytecode Verification]
    C --> D[Class Linking]
    D --> E[Class Initialization]
    E --> F[Main Method Invocation]
    F --> G[Execution]
    G --> H[Print "Hello, World!"]
```



1. **JVM Startup**: The Java Virtual Machine (JVM) starts and looks for the class named `HelloWorld` in the current directory or classpath.
2. **Class Loading**: The JVM uses its built-in ClassLoader to locate and load the `HelloWorld.class` file (the compiled bytecode).
3. **Bytecode Verification**: The JVM verifies the bytecode to ensure it is valid and does not violate Java's security constraints.
4. **Class Linking and Initialization**:
    - **Linking**: The JVM prepares the class for execution (verifies, prepares static fields, resolves references).
    - **Initialization**: Static initializers and static fields are initialized.
5. **Main Method Invocation**: The JVM looks for the `public static void main(String[] args)` method in the `HelloWorld` class. This method is the entry point of the program.
6. **Execution**: The JVM executes the bytecode instructions in the `main` method. In this case, it prints `Hello, World!` to the console.


**Summary:**
The ClassLoader is responsible for finding and loading classes at runtime. It loads `HelloWorld.class` into memory, and the JVM then executes the `main` method as the starting point of your application.

## 5. Notes
- The filename must match the public class name (e.g., `HelloWorld.java` for `public class HelloWorld`).
- Make sure Java is installed and the `javac` and `java` commands are available in your system's PATH.

