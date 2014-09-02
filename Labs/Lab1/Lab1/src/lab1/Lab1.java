/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author shadow
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    String testHello = "Hello World!";
    System.out.println(testHello);
    
    
    int testInteger;
    testInteger = 42;
    double testDouble;
    testDouble = 56771234.54321235;
    float testFloat = 6;
    long testLong;
    testLong = 456723;
    short testShort;
    testShort = 4556;
    byte testByte = 78;
    char testChar = 'r';
    boolean testBoolean = true;
    String testString = "This is the Test Lab1 String!";
    
    double solution1 = testDouble * testFloat; /** your double times your float*/
    System.out.println("Your Double times your float: ");
    System.out.println(solution1);
    float solution2 = testFloat - testByte; /** Your float minus your byte*/
    System.out.println("Your Float minus your byte");
    System.out.println(solution2);
    long solution3 = testLong / testShort; /** Your Long divided by your Short*/
    System.out.println("Your Long divided by your Short");
    System.out.println(solution3);
    int solution4 = testInteger % testByte; /** Your Int Modulus by your Byte*/
    System.out.println("Your Int Modulus by your Byte");
    System.out.println(solution4);
    double solution5 = Math.PI * Math.sin(testDouble) + Math.pow(testInteger, testFloat); /**Pi times the sine of your double plus your int raised to your float*/
    System.out.println("Pi times the sine of your double plus your int raised to your float");
    System.out.println(solution5);
    byte solution6 = (byte)testDouble; /**Cast your double to a byte*/
    System.out.println("Cast your double to a byte");
    System.out.println(solution6);
    
    StringBuilder builder = new StringBuilder();
    builder.append("Double: ");
    builder.append(testDouble);
    builder.append(", Int: ");
    builder.append(testInteger);
    builder.append(", Float: ");
    builder.append(testFloat);
    builder.append(", Long: ");
    builder.append(testLong);
    builder.append(", Short: ");
    builder.append(testShort);
    builder.append(", Char: ");
    builder.append(testChar);
    builder.append(", Byte: ");
    builder.append(testByte);
    builder.append(", Booean: ");
    builder.append(testBoolean);
    String completedString = builder.toString();
    System.out.println(builder);
    
    Boolean testEqual = testHello.equals(builder);
    System.out.println(testEqual);
        
    }
    
}