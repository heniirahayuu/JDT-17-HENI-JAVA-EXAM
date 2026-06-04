package com.indivaragroup;

import com.indivaragroup.collection.*;
import com.indivaragroup.lambda.exam.film.Film;
import com.indivaragroup.lambda.exam.interfacing.ExamInterface;
import com.indivaragroup.lambda.exam.interfacing.ExampleParameterInterface;
import com.indivaragroup.lambda.exam.property.PropertyAsset;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        ExamInterface examInterface = new ExamInterface() {
//            @Override
//            public void run() {
//                System.out.println("Hello, ini dari anonymous class");
//            }
//        };
//
//        ExamInterface examInterface1 = () -> System.out.println("ini dari lambda");
//        examInterface.run();
//        examInterface1.run();
//
//        Consumer<String> printer = (name) -> System.out.println("halo" + name);
//        Predicate<Integer> isEven = (num)-> num % 2 == 0;

//            List<Product> products = new ArrayList<>();
//
//            products.add(new Product(
//                    "CD Pria A", "Segitiga",
//                    "Katun", "L", BigDecimal.valueOf(50000), true));
//
//            products.add(new Product(
//                    "CD Pria B", "Belalai",
//                    "Katun", "L", BigDecimal.valueOf(75000), false));
//
//            products.add(new Product(
//                    "Baju Renang A", "One Piece",
//                    "Tipis", "M", BigDecimal.valueOf(120000), true));
//
//            products.add(new Product(
//                    "Baju Renang B", "Sport",
//                    "Tebal", "M", BigDecimal.valueOf(100000), false));
//
//            System.out.println("===== BAGUS BELI PAKAIAN DALAM =====");
//            Consumer<List<Product>> tampilkanProduk = list -> {
//                System.out.println("Daftar Produk : ");
//                for(Product p : list){
//                    System.out.println(p);
//                }
//            };
//            tampilkanProduk.accept(products);
//
//            Predicate<Product> filterSegitiga = p -> p.model.equalsIgnoreCase("Segitiga");
//
//            System.out.println("\nProduk Model Segitiga : ");
//
//            for(Product p : products){
//                if(filterSegitiga.test(p)){
//                    System.out.println(p);
//                }
//            }
//
//            BiPredicate<Product, String> cekModelDanSize =
//                    (p, size) ->
//                            p.model.equalsIgnoreCase("Segitiga")
//                                    && p.size.equalsIgnoreCase(size);
//
//            System.out.println("Cek Produk Segitiga Size L : ");
//            for(Product p : products){
//                if(cekModelDanSize.test(p, "L")){
//                    System.out.println("Cocok : " + p.nama);
//                }
//            }
//
//            Function<Product, String> cekHarga = p -> "Harga " + p.nama + " = Rp." + p.harga;
//
//            System.out.println("Info Harga : ");
//            System.out.println(cekHarga.apply(products.get(0)));
//
//            BiFunction<Product, Product, String> compareHarga =
//                    (p1, p2) -> {
//
//                        if(p1.harga.compareTo(p2.harga) > 0){
//                            return p1.nama + " lebih mahal";
//                        }else if(p1.harga.compareTo(p2.harga) < 0){
//                            return p2.nama + " lebih mahal";
//                        }else{
//                            return "Harga sama";
//                        }
//                    };
//            System.out.println("Compare Harga : ");
//            System.out.println(compareHarga.apply(products.get(0), products.get(1))
//            );
//
//            Predicate<Product> prediksiNaik = p -> p.trending;
//            System.out.println("\nPrediksi Harga Naik : ");
//            for(Product p : products){
//                if(prediksiNaik.test(p)){
//                    System.out.println(p.nama + " kemungkinan naik");
//                }
//            }
//
//            Supplier<Product> keputusanAkhir = () -> products.get(1);
//            Consumer<Product> beliProduk = p -> System.out.println("\nBagus membeli : " + p.nama + "\nTotal bayar : Rp." + p.harga);
//            beliProduk.accept(keputusanAkhir.get());
//
//            Predicate<Product> filterTipis = p -> p.kategori.equalsIgnoreCase("Tipis");
//            Function<List<Product>, List<Product>> hasilFilter = list -> {
//                List<Product> hasil = new ArrayList<>();
//                        for(Product p : list){
//                            if(filterTipis.test(p)){
//                                hasil.add(p);
//                            }
//                        }
//                        return hasil;
//                };
//
//            List<Product> produkTipis = hasilFilter.apply(products);
//            System.out.println("\nProduk Kategori Tipis : ");
//            for(Product p : produkTipis){
//                System.out.println(p);
//            }
//
//            BiConsumer<Product, String> rekomendasi = (p, alasan) -> {System.out.println("\nRekomendasi Toko : " + p.nama + "\nAlasan : " + alasan);};
//            rekomendasi.accept(products.get(2), "Bahannya ringan dan nyaman");
//
//            Supplier<Product> pilihRekomendasi = () -> products.get(2);
//            Consumer<Product> ambilProduk = p -> System.out.println("\nRena mengambil produk : " + p.nama);
//            ambilProduk.accept(pilihRekomendasi.get());
//
//            Function<Product, BigDecimal> ambilHarga = p -> p.harga;
//            Consumer<String> tampilHarga = text -> System.out.println(text);
//            BigDecimal harga = ambilHarga.apply(products.get(2));
//            tampilHarga.accept("\nHarga produk = Rp." + harga);

//        List<PropertyAsset> list = new ArrayList<>();
//
//        list.add(new PropertyAsset("P01", "Rumah Emerald", "RUMAH",
//                "Bekasi Timur", BigDecimal.valueOf(1200000000), 120, 90, false, 2020));
//
//        list.add(new PropertyAsset("P02", "Apartemen Grand", "APARTEMEN",
//                "Bekasi Barat", BigDecimal.valueOf(650000000), 0, 45, true, 2019));
//
//        list.add(new PropertyAsset("P03", "Ruko Ahmad Yani", "RUKO",
//                "Bekasi Selatan", BigDecimal.valueOf(2500000000.0), 80, 160, false, 2018));
//
//        list.add(new PropertyAsset("P04", "Tanah Jatibening", "TANAH",
//                "Bekasi Timur", BigDecimal.valueOf(800000000), 200, 0, false, 0));
//
//        list.add(new PropertyAsset("P05", "Rumah Pekayon", "RUMAH",
//                "Bekasi Selatan", BigDecimal.valueOf(950000000), 90, 70, true, 2021));
//
//        list.add(new PropertyAsset("P06", "Apartemen Meikarta", "APARTEMEN",
//                "Bekasi Barat", BigDecimal.valueOf(450000000), 0, 36, false, 2022));
//
//        list.add(new PropertyAsset("P07", "Ruko Galaxy", "RUKO",
//                "Bekasi Utara", BigDecimal.valueOf(3100000000.0), 100, 200, true, 2017));
//
//        list.add(new PropertyAsset("P08", "Rumah Kemang", "RUMAH",
//                "Bekasi Selatan", BigDecimal.valueOf(4500000000.0), 300, 250, false, 2023));
//
//        System.out.println("-- tampilin property");
//        list.forEach(PropertyAsset::cetak);
//
//        System.out.println("Belum Terjual");
//        List<PropertyAsset> belumTerjual = new ArrayList<>(list);
//        belumTerjual.removeIf(PropertyAsset::isSudahTerjual);
//        belumTerjual.forEach(PropertyAsset::cetak);
//
//        System.out.println("sort dari harga termurah");
//        list.sort(Comparator.comparing(PropertyAsset::getHarga));
//        list.forEach(PropertyAsset::cetak);
//
//        System.out.println("\n=== FILTER RUMAH ===");
//
//        List<PropertyAsset> rumah = list.stream().filter(p -> p.getTipeProperty().equals("RUMAH")).collect(Collectors.toList());
//        rumah.forEach(PropertyAsset::cetak);
//
//        System.out.println("\n=== NAMA PROPERTY ===");
//        list.stream().map(PropertyAsset::getNamaProperty).map(String::toUpperCase).forEach(System.out::println);
//
//        System.out.println("\n=== FORMAT HARGA ===");
//        list.stream().map(PropertyAsset::getHarga).map(PropertyAsset::formatRupiah).forEach(System.out::println);
//
//        BigDecimal totalAssets = list.stream()
//                .filter(p -> !p.isSudahTerjual())
//                .map(PropertyAsset::getHarga)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//        System.out.println("\nTotal Assets : Rp." + totalAssets);
//
//        System.out.println("\n=== GROUP BY TIPE ===");
//        Map<String, List<PropertyAsset>> groupTipe = list.stream().collect(Collectors.groupingBy(PropertyAsset::getTipeProperty));
//        groupTipe.forEach((k,v) -> {
//            System.out.println(k);
//            v.forEach(PropertyAsset::cetak);
//        });
//
//        Supplier<PropertyAsset> supplier = PropertyAsset::new;
//        PropertyAsset propertyBaru = supplier.get();
//        Function<String, PropertyAsset> buatById = PropertyAsset::new;
//        PropertyAsset pBaru = buatById.apply("P99");
//        System.out.println("\nProperty baru id : " + pBaru.getId());
//
//        list.sort(Comparator.comparing(PropertyAsset::getLokasi)
//                        .thenComparing(Comparator.comparing(PropertyAsset::getHarga).reversed())
//        );
//
//        System.out.println("sort location dan harga");
//
//        list.forEach(PropertyAsset::cetak);
//        System.out.println("report");
//
//        long terjual = list.stream().filter(PropertyAsset::isSudahTerjual).count();
//        long tersedia = list.size() - terjual;
//
//        System.out.println("Total Property : " + list.size());
//        System.out.println("Property Terjual : " + terjual);
//        System.out.println("Property Tersedia : " + tersedia);

//        Scanner input = new Scanner(System.in);
//        List<Film> films = new ArrayList<>();
//
//        films.add(new Film(
//                "Artist A",
//                "ABX-001",
//                LocalDate.of(2026,1,15),
//                "TEEN YO",
//                "SUMMER EDITION"
//        ));
//
//        films.add(new Film(
//                "Artist B",
//                "ABX-002",
//                LocalDate.of(2026,2,20),
//                "TEEN YO",
//                "SUMMER EDITION"
//        ));
//
//        films.add(new Film(
//                "Artist C",
//                "BCX-003",
//                LocalDate.of(2026,3,10),
//                "TEEN YO",
//                "WEEKEND EDITION"
//        ));
//
//        films.add(new Film(
//                "Artist D",
//                "CDX-004",
//                LocalDate.of(2026,4,5),
//                "NEW COMER 2026",
//                "DEBUT 2026"
//        ));
//
//        Map<String, Map<String, Map<String, List<String>>>> category = new LinkedHashMap<>();
//        Map<String, Map<String, List<String>>> teenYo = new LinkedHashMap<>();
//        Map<String, List<String>> schoolGirl = new LinkedHashMap<>();
//
//        schoolGirl.put("UNIFORM", Arrays.asList("SUMMER EDITION"));
//        schoolGirl.put("CASUAL", Arrays.asList("WEEKEND EDITION"));
//        Map<String, List<String>> college = new LinkedHashMap<>();
//        college.put("FRESHMAN", Arrays.asList("DEBUT 2026"));
//        teenYo.put("SCHOOL GIRL", schoolGirl);
//        teenYo.put("COLLEGE", college);
//        category.put("TEEN YO", teenYo);
//        category.put("BEAUTIFUL GIRL", new LinkedHashMap<>());
//        category.put("NEW COMER 2026", new LinkedHashMap<>());
//
//        System.out.println("film category");
//        List<String> mainCategory = new ArrayList<>(category.keySet());
//        for(int i = 0; i < mainCategory.size(); i++){
//            System.out.println((i + 1) + ". " + mainCategory.get(i));
//        }
//
//        System.out.print("Pilih kategori : ");
//        int pilih1 = input.nextInt();
//
//        String selectedLevel1 = mainCategory.get(pilih1 - 1);
//
//        Map<String, Map<String, List<String>>> level2 = category.get(selectedLevel1);
//        List<String> subCategory = new ArrayList<>(level2.keySet());
//
//        System.out.println("\nsub category");
//        for(int i = 0; i < subCategory.size(); i++){
//            System.out.println((i + 1) + ". " + subCategory.get(i));
//        }
//
//        System.out.print("Pilih sub category : ");
//        int pilih2 = input.nextInt();
//        String selectedLevel2 = subCategory.get(pilih2 - 1);
//
//        Map<String, List<String>> level3 = level2.get(selectedLevel2);
//
//        List<String> subSub = new ArrayList<>(level3.keySet());
//
//        System.out.println("\n=== sub sub cat ===");
//
//        for(int i = 0; i < subSub.size(); i++){
//            System.out.println((i + 1) + ". " + subSub.get(i));
//        }
//
//        System.out.print("Pilih : ");
//        int pilih3 = input.nextInt();
//        String selectedLevel3 = subSub.get(pilih3 - 1);
//
//        List<String> level4 = level3.get(selectedLevel3);
//
//        System.out.println("\n=== level 4===");
//
//        for(int i = 0; i < level4.size(); i++){
//            System.out.println((i + 1) + ". " + level4.get(i));
//        }
//        System.out.print("Pilih : ");
//        int pilih4 = input.nextInt();
//
//        String finalCategory = level4.get(pilih4 - 1);
//        System.out.println(
//                "-- data film --"
//        );
//
//        films.stream().filter(f -> f.subCategory.equals(finalCategory)).forEach(Film::tampil);

        List<Employeement> employee = new ArrayList<>();
        employee.add(new Employeement("Heni", "P",BigDecimal.valueOf(12000000),"Jakarta" ));
        employee.add(new Employeement("Ayu", "P",BigDecimal.valueOf(10000000),"Malang" ));
        employee.add(new Employeement("Rendi", "L",BigDecimal.valueOf(8000000),"Semarang" ));
        employee.add(new Employeement("Riza", "L",BigDecimal.valueOf(15000000),"Jakarta" ));
        employee.add(new Employeement("Alen", "L",BigDecimal.valueOf(500000),"Yogyakarta" ));
        employee.add(new Employeement("Rizka", "P",BigDecimal.valueOf(300000),"Solo" ));
        employee.add(new Employeement("Joko", "L", BigDecimal.valueOf(200000), "Surabaya"));

//        ini calling yg lama
//        SortNama.sortEmployee(employee);

        SortNama.sortEmployee(employee);
        for(Employeement emp : employee){
            System.out.println(emp);
        }

        System.out.println();

        SortJenis.sortJenisEmployee(employee);
        System.out.println();
        SortKota.sortEmployeeKota(employee);
        System.out.println();
//        SortKota.sortEmployeeKota(employee);

        //ini sort yg lama
//        SortGaji.sortSalaryEmployee(employee);
        //ini yg baru
        SortGaji.sortSalaryEmployee(employee);
        for(Employeement sal : employee){
            System.out.println(sal);
        }
    }
}