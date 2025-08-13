# Java Language Fundamentals

## 1. Data Types

Java supports two main categories of data types:

### a. Primitive Data Types
| Type      | Size     | Description                | Example         |
|-----------|----------|----------------------------|-----------------|
| byte      | 1 byte   | Integer (-128 to 127)      | byte b = 10;    |
| short     | 2 bytes  | Integer (-32K to 32K)      | short s = 1000; |
| int       | 4 bytes  | Integer (-2B to 2B)        | int i = 50000;  |
| long      | 8 bytes  | Large integer              | long l = 123L;  |
| float     | 4 bytes  | Single-precision decimal   | float f = 5.5f; |
| double    | 8 bytes  | Double-precision decimal   | double d = 5.5; |
| char      | 2 bytes  | Single character           | char c = 'A';   |
| boolean   | 1 bit    | true or false              | boolean b = true;|

### b. Reference Data Types
- **String**: Sequence of characters, e.g., `String name = "Java";`
- **Arrays**: Collection of similar data types, e.g., `int[] arr = {1,2,3};`
- **Objects**: Instances of classes.

---

## 2. Operators

Java provides several types of operators:

### a. Arithmetic Operators
| Operator | Description      | Example      |
|----------|-----------------|-------------|
| +        | Addition        | a + b       |
| -        | Subtraction     | a - b       |
| *        | Multiplication  | a * b       |
| /        | Division        | a / b       |
| %        | Modulus         | a % b       |

### b. Relational Operators
| Operator | Description      | Example      |
|----------|-----------------|-------------|
| ==       | Equal to        | a == b      |
| !=       | Not equal to    | a != b      |
| >        | Greater than    | a > b       |
| <        | Less than       | a < b       |
| >=       | Greater or equal| a >= b      |
| <=       | Less or equal   | a <= b      |

### c. Logical Operators
| Operator | Description      | Example      |
|----------|-----------------|-------------|
| &&       | Logical AND     | a && b      |
| \|\|      | Logical OR      | a || b      |
| !        | Logical NOT     | !a          |

### d. Assignment Operators
| Operator | Description      | Example      |
|----------|-----------------|-------------|
| =        | Assign value    | a = 5;      |
| +=       | Add and assign  | a += 2;     |
| -=       | Subtract/assign | a -= 2;     |
| *=       | Multiply/assign | a *= 2;     |
| /=       | Divide/assign   | a /= 2;     |
| %=       | Modulus/assign  | a %= 2;     |

---

## 3. Conditional Statements

Conditional statements control the flow of execution based on conditions.

### a. if Statement
```java
if (condition) {
    // code block
}
```

---

## 4. Iterations (Loops)

Loops are used to execute a block of code repeatedly.

### a. for Loop
```java
for (int i = 0; i < 5; i++) {
    // code block
}
```

### b. while Loop
```java
int i = 0;
while (i < 5) {
    // code block
    i++;
}
```

### c. do-while Loop
```java
int i = 0;
do {
    // code block
    i++;
} while (i < 5);
```

### d. Enhanced for Loop (for-each)
```java
int[] arr = {1, 2, 3};
for (int num : arr) {
    // code block
}
```

---

## 5. String Objects

Strings in Java are objects that represent sequences of characters.

### Creating Strings
```java
String s1 = "Hello";
String s2 = new String("World");
```

### Common String Methods
| Method            | Description                        | Example                        |
|-------------------|------------------------------------|--------------------------------|
| length()          | Returns string length               | s1.length()                    |
| charAt(index)     | Returns char at given index         | s1.charAt(0)                   |
| substring(a, b)   | Returns substring from a to b-1     | s1.substring(1, 4)             |
| equals(str)       | Compares two strings (case-sensitive)| s1.equals(s2)                  |
| equalsIgnoreCase(str)| Compares ignoring case           | s1.equalsIgnoreCase(s2)         |
| toUpperCase()     | Converts to uppercase               | s1.toUpperCase()               |
| toLowerCase()     | Converts to lowercase               | s1.toLowerCase()               |
| concat(str)       | Concatenates strings                | s1.concat(s2)                  |
| contains(str)     | Checks if string contains substring | s1.contains("el")              |

### Example
```java
String name = "Java";
System.out.println(name.length()); // 4
System.out.println(name.toUpperCase()); // JAVA
```

---

**Tip:** Practice using loops and String methods to solve small problems!
### b. if-else Statement
```java
if (condition) {
    // code block if true
} else {
    // code block if false
}
```

### c. else-if Ladder
```java
if (condition1) {
    // code block 1
} else if (condition2) {
    // code block 2
} else {
    // code block 3
}
```

### d. switch Statement
```java
switch (variable) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // default code block
}
```

