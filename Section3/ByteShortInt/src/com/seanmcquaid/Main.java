package com.seanmcquaid;

public class Main {

    public static void main(String[] args) {

//	by default in an expression, java interprets a num var as an int
//  int has a width of 32
	int myValue = 10000;
//	smallest int number able to use in java
	int myMinValue = -2_147_483_648;
//	largest int number able to use in java
	int myMaxValue = 2_147_483_647;
	int myTotal = (myMinValue/2);
//	System.out.println("myTotal" + myTotal);
//	byte has a width of 8
//	bytes are more efficient and take less space than an int
//  good for calculations
//	can only number of range -128 to 127
	byte myByteValue = -128;
//	to get around expression issue, you need (byte) to CAST this as a byte
	byte myNewByteValue =(byte) (myByteValue/2);


//	short has a width of 16
//	largest number is 32767 and lowest is -32767

	short myShortValue = 30000;
	short myNewShortValue =(short)(myShortValue / 2);

//	L at the end tells the comp its a long value
// long has a width of 64
	long myLongValue = 100L;


//	1. create a byte var equal to any valid byte number
	byte firstByte = 120;

//	2. create a short var and set it equal to any valid short number
	short firstShort = 	-30000;

//	3. create an int var and set it to any valid int number
	int firstInt = 312;

//	LONGS DON'T NEED CASTING
//	4. create a variable of type long and make it equal to 50000 + 10 times the sum of the short, bye and int
	long totalValues = 50000L + (10L * ((firstByte) + (firstShort) + firstInt));

	short shortTotal = (short) (1000 + (10L * ((firstByte) + (firstShort) + firstInt)));
	System.out.println(totalValues);
    }
}
