import java.util.*;

public class SensusPenduduk {

    public static double Proyeksi(int penduduk, int n, double laju) {
        double r = laju / 100;
        double result = penduduk * Math.pow((1 + r), n);
        return result;
    }

    public static double[] Laki2(double penduduk) {
        double laki2[] = new double[14];

        for (int i = 0; i < 8; i++) {
            laki2[i] = penduduk * 0.4;
        }

        laki2[8] = penduduk * 0.35;

        laki2[9] = penduduk * 0.35;

        laki2[10] = penduduk * 0.3;

        laki2[11] = penduduk * 0.25;

        laki2[12] = penduduk * 0.2;

        laki2[13] = penduduk * 0.15;

        return laki2;
    }

    public static double[] Perempuan(double penduduk) {
        double perempuan[] = new double[14];

        for (int i = 0; i < 8; i++) {
            perempuan[i] = penduduk * 0.4;
        }

        perempuan[8] = penduduk * 0.35;

        perempuan[9] = penduduk * 0.35;

        perempuan[10] = penduduk * 0.3;

        perempuan[11] = penduduk * 0.25;

        perempuan[12] = penduduk * 0.2;

        perempuan[13] = penduduk * 0.15;

        return perempuan;
    }

    public static void Diagram(double penduduk) {
        double a[] = Laki2(penduduk);
        double b[] = Perempuan(penduduk);

        for (int i = 13; i >= 0; i--) { // laki-laki
            double c = a[i] / 1000000;
            String star1 = "";
            for (int j = 0; j < c; j++) {
                star1 += "*";
            }

            double d = b[i] / 1000000;
            String star2 = "";
            for (int j = 0; j < d; j++) { // perempuan
                star2 += "*";
            }

            System.out.printf("%20s | %s\n", star1, star2);

        }
        System.out.printf("%20s | %s\n", "Laki-laki", "Perempuan");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, penduduk, n;
        double result;
        double laju;

        do {
            System.out.println("Pilih Satu Provinsi Di Jawa ");
            System.out.println("-----------------------------");
            System.out.println("1. Banten");
            System.out.println("2. DKI Jakarta");
            System.out.println("3. Jawa Barat");
            System.out.println("4. Jawa Tengah");
            System.out.println("5. Jawa Timur");
            System.out.println("6. D.I.Yogyakarta");
            System.out.println("7. Custom");
            System.out.println("8. Exit");
            System.out.println("-----------------------------");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();
            switch (pilihan) {

                // Banten
                case 1:
                    System.out.println("Banten");
                    System.out.print("Berapa n tahun kedepan: ");
                    n = input.nextInt(); // jumlah tahun antara 0 hingga n
                    penduduk = 12895300;
                    laju = 2.14;
                    result = Proyeksi(penduduk, n, laju);
                    System.out.printf("Populasi sekarang          : %,d penduduk\n", penduduk);
                    System.out.printf("Populasi %d tahun kemudian : %,.0f penduduk\n", n, result);
                    Diagram(penduduk);
                    Diagram(result);
                    break;

                // DKI Jakarta
                case 2:
                    System.out.println("DKI Jakarta");
                    System.out.print("Berapa n tahun kedepan: ");
                    n = input.nextInt(); // jumlah tahun antara 0 hingga n
                    penduduk = 10576400;
                    laju = 1.02;
                    result = Proyeksi(penduduk, n, laju);
                    System.out.printf("Populasi sekarang          : %,d penduduk\n", penduduk);
                    System.out.printf("Populasi %d tahun kemudian : %,.0f penduduk\n", n, result);
                    Diagram(penduduk);
                    Diagram(result);
                    break;

                // Jawa Barat
                case 3:
                    System.out.println("Jawa Barat");
                    System.out.print("Berapa n tahun kedepan: ");
                    n = input.nextInt(); // jumlah tahun antara 0 hingga n
                    penduduk = 49565200;
                    laju = 1.48;
                    result = Proyeksi(penduduk, n, laju);
                    System.out.printf("Populasi sekarang          : %,d penduduk\n", penduduk);
                    System.out.printf("Populasi %d tahun kemudian : %,.0f penduduk\n", n, result);
                    Diagram(penduduk);
                    Diagram(result);
                    break;

                // Jawa Tengah
                case 4:
                    System.out.println("Jawa Tengah");
                    System.out.print("Berapa n tahun kedepan: ");
                    n = input.nextInt(); // jumlah tahun antara 0 hingga n
                    penduduk = 34738200;
                    laju = 0.76;
                    result = Proyeksi(penduduk, n, laju);
                    System.out.printf("Populasi sekarang          : %,d penduduk\n", penduduk);
                    System.out.printf("Populasi %d tahun kemudian : %,.0f penduduk\n", n, result);
                    Diagram(penduduk);
                    Diagram(result);
                    break;

                // Jawa Timur
                case 5:
                    System.out.println("Jawa Timur");
                    System.out.print("Berapa n tahun kedepan: ");
                    n = input.nextInt(); // jumlah tahun antara 0 hingga n
                    laju = 0.62;
                    penduduk = 39955900;
                    result = Proyeksi(penduduk, n, laju);
                    System.out.printf("Populasi sekarang          : %,d penduduk\n", penduduk);
                    System.out.printf("Populasi %d tahun kemudian : %,.0f penduduk\n", n, result);
                    Diagram(penduduk);
                    Diagram(result);
                    break;

                // D.I.Yogyakarta
                case 6:
                    System.out.println("D.I.Yogyakarta");
                    System.out.print("Berapa n tahun kedepan: ");
                    n = input.nextInt(); // jumlah tahun antara 0 hingga n
                    laju = 1.15;
                    penduduk = 3919200;
                    result = Proyeksi(penduduk, n, laju);
                    System.out.printf("Populasi sekarang          : %,d penduduk\n", penduduk);
                    System.out.printf("Populasi %d tahun kemudian : %,.0f penduduk\n", n, result);
                    Diagram(penduduk);
                    Diagram(result);
                    break;

                // Custom
                case 7:
                    System.out.println("Custom");
                    System.out.print("Berapa n tahun kedepan: ");
                    n = input.nextInt(); // jumlah tahun antara 0 hingga n
                    laju = input.nextDouble();

            }
        } while (pilihan != 8);
        input.close();
        System.exit(0);
    }
}