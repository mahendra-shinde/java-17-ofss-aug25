# Object Oriented Programming (OOP) in Java

## 1. Class and Objects
- **Class**: A blueprint for creating objects. It defines properties (fields) and behaviors (methods).
- **Object**: An instance of a class. It represents a real-world entity with state and behavior.
- **Example**:
	```java
	class Account {
		String accountNumber;
		double balance;
		void deposit(double amount) {
			balance += amount;
		}
		void display() {
			System.out.println("Account: " + accountNumber + ", Balance: " + balance);
		}
	}

    ///somewhere in main method
	Account acc = new Account();
	acc.accountNumber = "12345";
	acc.deposit(1000);
	acc.display();
	```

## 2. Inheritance
- Allows a class to inherit properties and methods from another class.
- Promotes code reuse and establishes a parent-child relationship.
- **Example**:
	```java
	class Account {
		String accountNumber;
		double balance;
		void deposit(double amount) { balance += amount; }
	}
	class SavingsAccount extends Account {
		double interestRate;
		void addInterest() {
			balance += balance * interestRate / 100;
		}
	}
	```

- Means "many forms". Allows objects to be treated as instances of their parent class.
- Achieved via method overriding and interfaces.
- **Example**:
	```java
	Account acc = new SavingsAccount();
	acc.deposit(500);
	// If deposit is overridden in SavingsAccount, the overridden method is called
	```

## 3a. Method Overloading
- Method overloading allows a class to have more than one method with the same name, but different parameter lists.
- It increases the readability of the program and enables different ways to perform similar operations.
- **Example**:
	```java
	class Account {
		double balance;
		void deposit(double amount) {
			balance += amount;
		}
		void deposit(double amount, String currency) {
			// Assume conversion for demonstration
			if(currency.equals("USD")) {
				balance += amount * 80; // Convert USD to INR
			} else {
				balance += amount;
			}
		}
	}
	Account acc = new Account();
	acc.deposit(1000); // INR
	acc.deposit(100, "USD"); // USD converted to INR
	```

## 3b. Method Overriding
- Method overriding allows a subclass to provide a specific implementation of a method already defined in its superclass.
- It is used for runtime (dynamic) polymorphism.
- **Example**:
	```java
	class Account {
		double balance;
		void deposit(double amount) {
			balance += amount;
			System.out.println("Deposited in Account");
		}
	}
	class SavingsAccount extends Account {
		@Override
		void deposit(double amount) {
			balance += amount;
			System.out.println("Deposited in SavingsAccount with interest");
		}
	}
	Account acc = new SavingsAccount();
	acc.deposit(500); // Calls overridden method in SavingsAccount
	```

## 4. Abstract and Final Classes
- **Abstract Class**: Cannot be instantiated. May have abstract methods (without body).
- **Final Class**: Cannot be extended.
- **Example**:
	```java
	abstract class Account {
		String accountNumber;
		abstract void deposit(double amount);
	}
	final class BankUtils {
		static final String BANK_CODE = "BANK123";
	}
	```

## 5. Interfaces
- Define a contract of methods that implementing classes must provide.
- Support multiple inheritance.
- **Example**:
	```java
	interface Transaction {
		void execute(double amount);
	}
	class Account implements Transaction {
		double balance;
		public void execute(double amount) { balance += amount; }
	}
	```

## 6. Records
- Introduced in Java 16. Immutable data carriers for simple data aggregation.
- **Example**:
	```java
	record AccountRecord(String accountNumber, double balance) {}
	AccountRecord rec = new AccountRecord("12345", 5000);
	```

## 7. Enums
- Special classes for a fixed set of constants.
- **Example**:
	```java
	enum AccountType { SAVINGS, CURRENT, FIXED_DEPOSIT }
	AccountType type = AccountType.SAVINGS;
	```

## 8. Sealed Classes
- Restrict which classes can extend or implement them (Java 17+).
- **Example**:
	```java
	sealed class Account permits SavingsAccount, CurrentAccount {}
	final class SavingsAccount extends Account {}
	final class CurrentAccount extends Account {}
	```

