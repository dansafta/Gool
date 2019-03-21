package org.fasttrackit.test;

public class Test1
{
    public static void main(String[] args)

    {

byte bigByte = 127;
short bigShort = 32767;
int bigInt = 210000000;
long bigLong = 9220000000000l;
float bigFloat = 3.14f;
double bigDouble = 3.14855455544522244;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 66;
        char anotherChar = 'A';

        char escapeChar = '\\';

        String randomString = "I'am a random string";
        String anotherString = "Stuff";

        String andAnotherString = randomString + " " + anotherString;

        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);


        double aDoubleValue = 3.1454646664;
        int doubleToInt = (int) aDoubleValue;


        System.out.println(doubleToInt);

    }
    }
