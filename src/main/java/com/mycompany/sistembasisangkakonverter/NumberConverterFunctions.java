package com.mycompany.sistembasisangkakonverter;

/**
 *
 * @author Putra Nurhuda Makatita
 */
public class NumberConverterFunctions {

    // Convert Binary to Decimal
    public static String binaryToDecimal(String binary) {
        try {
            int decimal = Integer.parseInt(binary, 2);
            return String.valueOf(decimal);
        } catch (NumberFormatException e) {
            return "Invalid Input";
        }
    }

    // Convert Binary to Hexadecimal
    public static String binaryToHex(String binary) {
        String decimal = binaryToDecimal(binary);
        return decimal.equals("Invalid Input") ? "Invalid Input" : Integer.toHexString(Integer.parseInt(decimal)).toUpperCase();
    }

    // Convert Binary to Octal
    public static String binaryToOctal(String binary) {
        String decimal = binaryToDecimal(binary);
        return decimal.equals("Invalid Input") ? "Invalid Input" : Integer.toOctalString(Integer.parseInt(decimal));
    }

    // Convert Decimal to Binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Convert Decimal to Hexadecimal
    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    // Convert Decimal to Octal
    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    // Convert Hexadecimal to Binary
    public static String hexToBinary(String hex) {
        String decimal = hexToDecimal(hex);
        return decimal.equals("Invalid Input") ? "Invalid Input" : Integer.toBinaryString(Integer.parseInt(decimal));
    }

    // Convert Hexadecimal to Decimal
    public static String hexToDecimal(String hex) {
        try {
            int decimal = Integer.parseInt(hex, 16);
            return String.valueOf(decimal);
        } catch (NumberFormatException e) {
            return "Invalid Input";
        }
    }

    // Convert Hexadecimal to Octal
    public static String hexToOctal(String hex) {
        String decimal = hexToDecimal(hex);
        return decimal.equals("Invalid Input") ? "Invalid Input" : Integer.toOctalString(Integer.parseInt(decimal));
    }

    // Convert Octal to Binary
    public static String octalToBinary(String octal) {
        String decimal = octalToDecimal(octal);
        return decimal.equals("Invalid Input") ? "Invalid Input" : Integer.toBinaryString(Integer.parseInt(decimal));
    }

    // Convert Octal to Decimal
    public static String octalToDecimal(String octal) {
        try {
            int decimal = Integer.parseInt(octal, 8);
            return String.valueOf(decimal);
        } catch (NumberFormatException e) {
            return "Invalid Input";
        }
    }

    // Convert Octal to Hexadecimal
    public static String octalToHex(String octal) {
        String decimal = octalToDecimal(octal);
        return decimal.equals("Invalid Input") ? "Invalid Input" : Integer.toHexString(Integer.parseInt(decimal)).toUpperCase();
    }
}
