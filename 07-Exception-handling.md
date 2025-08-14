# Exception Handling in Java

## 1. Overview of Exceptions

Exceptions are events that disrupt the normal flow of a program's instructions. They are used to handle errors and other exceptional events in Java, allowing developers to write robust and error-tolerant code.

**Key Points:**
- Exceptions help separate error-handling code from regular code.
- Java provides a rich set of built-in exceptions and allows custom exceptions.

---

## 2. Exception Class Hierarchy

Java exceptions are objects that inherit from the `Throwable` class. The hierarchy is as follows:

- **Throwable**
  - **Exception**
   - **RuntimeException**
  - **Error**

**Details:**
- `Exception` is the superclass for all exceptions that applications might want to catch.
- `RuntimeException` and its subclasses represent exceptions that can occur during the normal operation of the JVM (unchecked exceptions).
- `Error` represents serious problems that applications should not try to catch (e.g., `OutOfMemoryError`).

---

## 3. Checked vs Unchecked Exceptions

- **Checked Exceptions:**  
  These are exceptions that are checked at compile-time. The compiler ensures that these exceptions are either caught or declared in the method signature using `throws`.  
  _Example: `IOException`, `SQLException`_

- **Unchecked Exceptions:**  
  These are exceptions that are not checked at compile-time. They are subclasses of `RuntimeException`.  
  _Example: `NullPointerException`, `ArrayIndexOutOfBoundsException`_

**How to avoid Unchecked Exceptions:**
- Write defensive code (e.g., check for `null` before accessing objects).
- Validate user input before processing.

---

## 4. User Defined Exception

Java allows you to create your own exception classes by extending the `Exception` class (for checked exceptions) or `RuntimeException` (for unchecked exceptions). This is useful for representing application-specific error conditions.

```java
// Example of a user-defined exception
public class MyCustomException extends Exception {
   public MyCustomException(String message) {
      super(message);
   }
}
```

**Demo7 Example:**
```java
public class InterestCalculatorException extends RuntimeException {
   private Integer minValue;
   private Integer maxValue;
   public InterestCalculatorException(Integer minValue, Integer maxValue) {
      super("Value must be in range: " + minValue + " - " + maxValue);
      this.minValue = minValue;
      this.maxValue = maxValue;
   }
}
```

---

## 5. Example Code from Demo7

### Main Application Logic
```java
public class Main {
   public static void main(String[] args) {
      InterestCalculator calc = new InterestCalculator();
      while(true) {
         try {
            calc.input2();
            double interest = calc.calc();
            System.out.println("Interest = " + interest);
            return; // STOP APPLICATION "Gently"
         } catch(NumberFormatException ex) {
            System.out.println("Invalid value : " + ex.getMessage());
            System.out.println("Please re-try again");
         } catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
         } finally {
            System.out.println("End of Application ....");
         }
      }
   }
}
```

### Input Handling with Exception Management
```java
public void input() {
   Scanner sc = new Scanner(System.in);
   String temp = null;
   System.out.println("Enter principal amount :");
   try {
      temp = sc.nextLine();
      principal = Double.parseDouble(temp);
   } catch(NumberFormatException ex) {
      System.out.println("The principal you entered is wrong ! ");
      System.out.println("The default principal :10,000");
      principal = 10000D;
   }
   // ... similar for rate and duration ...
}
```

**Highlights:**
- Uses try-catch-finally blocks to handle user input errors.
- Demonstrates how to throw and catch both built-in and user-defined exceptions.
- Shows how to provide default values and prompt the user to retry on invalid input.

---

## 6. Best Practices

- Always catch the most specific exception first.
- Avoid catching `Exception` or `Throwable` unless absolutely necessary.
- Use custom exceptions for meaningful error reporting.
- Clean up resources in the `finally` block or use try-with-resources for auto-closeable resources.

---

## 7. Summary

Exception handling is a powerful feature in Java that helps you build robust applications. By understanding the exception hierarchy, using checked and unchecked exceptions appropriately, and writing clear error-handling code, you can make your programs more reliable and user-friendly.