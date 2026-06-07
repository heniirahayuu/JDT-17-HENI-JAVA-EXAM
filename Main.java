package com.indivaragroup;

import com.indivaragroup.examtwenty.*;
import com.indivaragroup.generic.*;
import com.indivaragroup.generic.covariant.Hewan;
import com.indivaragroup.generic.covariant.Kandang;
import com.indivaragroup.generic.covariant.Kucing;
import com.indivaragroup.inheritance.exam.company.HeadHrd;
import com.indivaragroup.inheritance.exam.company.JuniorEmployee;
import com.indivaragroup.inheritance.exam.company.SeniorEmployee;
import com.indivaragroup.service.AppProperties;
import com.indivaragroup.service.PrintReceipt;
import com.indivaragroup.service.Products;

import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Objects;


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        // soal 1
        String[] customers = {
                "Andi",
                "Budi",
                "Andi",
                "Caca",
                "Andi"
        };

        TopCustomer topCustomer = new TopCustomer();
        System.out.println("Top Customer : " + topCustomer.findTopCustomer(customers));

        //soal 2
        int[] numbers = {100, 4, 200, 1, 3, 2};
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive.findLongest(numbers));

        //soal 3
        int[] scores = {90, 70, 80, 100};
        StudentRanking studentRanking = new StudentRanking();
        int[] result = studentRanking.getRanking(scores);
        System.out.println(Arrays.toString(result));

        //soal 4
        String test1 = "Java2025!";
        String test2 = "Java2025"; // misal urang karakter spesial
        System.out.println("Apakah '" + test1 + "' kuat? " + PasswordValidator.isPasswordStrong(test1));
        System.out.println("Apakah '" + test2 + "' kuat? " + PasswordValidator.isPasswordStrong(test2));

        //soal 5
        int[] stock = {5, 4, 3};
        int k = 4;

        int results = InventoryOptimizer.minimizeStock(stock, k);
        System.out.println("Output: " + results);

        //soal 6
        int[] transactions = {100, 200, 150, 1000};
        int result6 = FraudDetector.countFraudulentTransactions(transactions);
        System.out.println("Output: " + result6);

        //soal 7
        String input = "Java Python Java Heni";
        System.out.println("Output: " + WordCounter.findMostFrequentWord(input));

        //soal 8
        int[] nums = {5, 1, 9, 7};
        System.out.println("Output: " + NumberFinder.findSecondLargest(nums));

        //soal 10
        String inputs = "({[]})";
        System.out.println("Output: " + BracketValidator.isValid(inputs));

        //soal 11
        String input11 = "programming";
        System.out.println("Output: " + UniqueCounter.countUniqueCharacters(input11));

        //soal 12
        int score = 90;
        int years = 5;
        double totalBonus = BonusCalculator.calculateBonus(score, years);
        System.out.println("Total Bonus: " + totalBonus);

        //soal 13
        Map<String, Integer> sales = Map.of(
                "Laptop", 100,
                "Mouse", 20
        );
        System.out.println("Output: \"" + SalesAnalyzer.findTopSellingProduct(sales) + "\"");

        //soal 14
        int[] numbs = {1, 2, 3, 4, 5};
        int ke = 2;
        ArrayRotator.rotate(numbs, ke);
        System.out.println("Output: " + Arrays.toString(numbs));

        //soal 15
        int[] numberes = {1, 2, 3, 2, 4, 1};
        System.out.println("Output: " + DuplicateDetector.findDuplicates(numberes));

        //soal 16
        int[] transactionis = {1000, -200, 500};
        System.out.println("Soal 16: " + BankAccount.calculateBalance(transactionis));

        //soal 17
        int[][] meetings = {{1, 3}, {2, 4}, {4, 5}};
        System.out.println("Soal 17 Output: " + MeetingScheduler.maxNonOverlappingMeetings(meetings));

        //soal 18
        String inputSentence = "java java python";
        System.out.println("Soal 18 Output: " + WordFrequency.getFrequency(inputSentence));

        //soal 19
        int[] scorer = {100, 90, 90, 80};
        int[] resultes = Leaderboard.getRankings(scorer);
        System.out.println("Output: " + Arrays.toString(resultes));
    }
}

/*1.buatkan saya struktur organisasi di dalam sebuah perusahaan pt jdt 17 maju sejahtera mandiri
* meliputi : karyawan (nama lengkap, umur, gaji, posisi)
*
* 2. secara struktur organisasinya karyawan harus digolongkan berdasarkan umurnya
* eg: kalau misal masih muda 20-25 ini posisi junior, 25-35 ini posisi middle to senior
*
* 3.secara level dan struktur organisasi harus bisa menargetkan juga gajinya berdasarkan level/posisi
* 4. buatkan class inheritance/extends dan objectnya dari point 1,2,3
* np : nama atribut, tipedata harus benar ya
* 1. kalo duitt (big decimal) kalo diprint bentuknya 10,000.000
* 2. nama orang dibuat uppercase ini bisa pakai (Object), .toUpperCase()
*
*
* 5. BUATKAN SAYA VALIDASI UNTUK PENDAFTARAN KARYAWAN DI SUATU ORGANISASI
    * VALIDASI NAMA APABILA KOSONG / MINIMAL CHAR ADALAH 5 CHAR
    * VALIDASI UMUR TIDAK BOLEH DIBAWAH DARI UMUR 20 TAHUN
    * VALIDASI UMUR TIDAK BOLEH LEBIH DARI UMUR 35 TAHUN
    * VALIDASI UMUR APABILA ROLE YANG DILAMAR (JAVA DEVELOPER) TIDAK BOLEH DIBAWAH 20 TAHUN
    * VALIDASI ROLE YG DILAMAR TIDAK BOLEH KOSONG

    NB: GUNAKAN EXCETION CLASS DAN SCANNER INPUT UNTUK INISIASI VARIABLE NYA

    GUNAKAN CLASS REFLECTION BUAT VALIDASI NYA
    *
    *
    *
    * buatin 1 function menggunakan lebih 1 parameter(array) generic dia bisa membedakan tipe data apa yg akan masuk ke methodnya
    * kalau string dia akan nambah atau print namanya aja kalau number dia akan nambah nambahin berapa + berapa + berapa dijabarin dan nanti totalnya.
    * kalau boolean dia hanya akan menentukan true or falsenya valuenya*/