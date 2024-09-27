// NIM - Your Name

import java.util.*;
import java.lang.Math;

class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, tahunterbit, penerbit, format, ket;
        double harga, margin, stok, rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        format = input.nextLine();
        harga = input.nextDouble();
        margin = input.nextDouble();
        stok = input.nextDouble();
        rating = input.nextDouble();
        ket = "";
        if (rating >= 4.7) {
            ket = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                ket = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    ket = "Recommended";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        ket = "Average";
                    } else {
                        if (rating < 3.0) {
                            ket = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + format + "|" + toFixed(harga, 2) + "|" + toFixed(margin,2) + "|" + stok + "|" + toFixed(rating,1) + "|" + ket);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
