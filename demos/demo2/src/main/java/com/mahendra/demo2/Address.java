package com.mahendra.demo2;

// New User Defined Type "Record" which produces "Immutable" objects with only GETTER methods
// Record provides only "All Argument" constructor, there would be NO no-arg default constructor 
public record Address(String line1, String line2, String city, String postalCode)  {
}
