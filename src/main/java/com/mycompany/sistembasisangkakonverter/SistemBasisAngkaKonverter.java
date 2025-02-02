package com.mycompany.sistembasisangkakonverter;

import java.util.Scanner;

/**
 *
 * @author Putra Nurhuda Makatita
 */
public class SistemBasisAngkaKonverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define menu options as an array
        String[] options = {
            "Biner ke Decimal",
            "Biner ke Hexa",
            "Biner ke Octal",
            "Decimal ke Biner",
            "Decimal ke Hexa",
            "Decimal ke Octal",
            "Hexa ke Biner",
            "Hexa ke Decimal",
            "Hexa ke Octal",
            "Octal ke Biner",
            "Octal ke Decimal",
            "Octal ke Hexa"
        };

        int choice = -1; // Inisialisasi dengan nilai default

        do {
            System.out.println("Pilih konversi yang diinginkan:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            // Validasi input pilihan menu
            if (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next(); // Membersihkan input yang salah
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice >= 1 && choice <= options.length) {
                processConversion(choice, scanner);
            } else if (choice == 0) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println();

        } while (choice != 0);


        scanner.close();
    }

    public static void processConversion(int choice, Scanner scanner) {
        String input;
        int decimalInput;

        switch (choice) {
            case 1: // Biner ke Decimal
                input = getValidBinary(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.binaryToDecimal(input));
                break;
            case 2: // Biner ke Hexa
                input = getValidBinary(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.binaryToHex(input));
                break;
            case 3: // Biner ke Octal
                input = getValidBinary(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.binaryToOctal(input));
                break;
            case 4: // Decimal ke Biner
                decimalInput = getValidDecimal(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.decimalToBinary(decimalInput));
                break;
            case 5: // Decimal ke Hexa
                decimalInput = getValidDecimal(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.decimalToHex(decimalInput));
                break;
            case 6: // Decimal ke Octal
                decimalInput = getValidDecimal(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.decimalToOctal(decimalInput));
                break;
            case 7: // Hexa ke Biner
                input = getValidHex(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.hexToBinary(input));
                break;
            case 8: // Hexa ke Decimal
                input = getValidHex(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.hexToDecimal(input));
                break;
            case 9: // Hexa ke Octal
                input = getValidHex(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.hexToOctal(input));
                break;
            case 10: // Octal ke Biner
                input = getValidOctal(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.octalToBinary(input));
                break;
            case 11: // Octal ke Decimal
                input = getValidOctal(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.octalToDecimal(input));
                break;
            case 12: // Octal ke Hexa
                input = getValidOctal(scanner);
                System.out.println("Hasil: " + NumberConverterFunctions.octalToHex(input));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    // Fungsi untuk validasi input biner (hanya berisi 0 dan 1)
    private static String getValidBinary(Scanner scanner) {
        String input;
        while (true) {
            System.out.print("Masukkan bilangan biner: ");
            input = scanner.nextLine().trim();
            if (input.matches("[01]+")) {
                return input;
            } else {
                System.out.println("Input tidak valid. Harap masukkan bilangan biner yang benar (hanya 0 dan 1).");
            }
        }
    }

    // Fungsi untuk validasi input decimal
    private static int getValidDecimal(Scanner scanner) {
        while (true) {
            System.out.print("Masukkan bilangan decimal: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Input tidak valid. Harap masukkan bilangan decimal yang benar.");
                scanner.next(); // Membersihkan input yang salah
            }
        }
    }

    // Fungsi untuk validasi input hexadecimal (hanya berisi 0-9, A-F)
    private static String getValidHex(Scanner scanner) {
        String input;
        while (true) {
            System.out.print("Masukkan bilangan hexadecimal: ");
            input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("[0-9A-F]+")) {
                return input;
            } else {
                System.out.println("Input tidak valid. Harap masukkan bilangan hexadecimal yang benar (0-9, A-F).");
            }
        }
    }

    // Fungsi untuk validasi input octal (hanya berisi 0-7)
    private static String getValidOctal(Scanner scanner) {
        String input;
        while (true) {
            System.out.print("Masukkan bilangan octal: ");
            input = scanner.nextLine().trim();
            if (input.matches("[0-7]+")) {
                return input;
            } else {
                System.out.println("Input tidak valid. Harap masukkan bilangan octal yang benar (0-7).");
            }
        }
    }
}
