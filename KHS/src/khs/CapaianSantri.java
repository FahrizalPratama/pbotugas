package khs;

public class CapaianSantri {

    private double nilaiTahfidz;
    private double nilaiKitab;
    private double nilaiAdab;

    public CapaianSantri() {
    }

    public CapaianSantri(double tahfidz, double kitab, double adab) {
        this.nilaiTahfidz = tahfidz;
        this.nilaiKitab = kitab;
        this.nilaiAdab = adab;
    }

    public void inputNilaiTahfidz(double nilai) {
        this.nilaiTahfidz = nilai;
    }

    public double getNilaiTahfidz() {
        return nilaiTahfidz;
    }

    public void inputNilaiKitab(double nilai) {
        this.nilaiKitab = nilai;
    }

    public double getNilaiKitab() {
        return nilaiKitab;
    }

    public void inputNilaiAdab(double nilai) {
        this.nilaiAdab = nilai;
    }

    public double getNilaiAdab() {
        return nilaiAdab;
    }

    public String konversiNilai(double nilai) {

        String hasil = "";

        if (nilai <= 0) {
            hasil = "E";
        } else if (nilai >= 1 && nilai <= 45) {
            hasil = "D";
        } else if (nilai > 45 && nilai <= 60) {
            hasil = "C";
        } else if (nilai > 60 && nilai <= 69) {
            hasil = "C+";
        } else if (nilai > 69 && nilai <= 74) {
            hasil = "B";
        } else if (nilai > 74 && nilai <= 79) {
            hasil = "B+";
        } else {
            hasil = "A";
        }

        return hasil;
    }

    public double konversiGrade(String nilai) {

        double hasil = 0;

        if (nilai.equals("A")) {
            hasil = 4;
        } else if (nilai.equals("B+")) {
            hasil = 3.5;
        } else if (nilai.equals("B")) {
            hasil = 3;
        } else if (nilai.equals("C+")) {
            hasil = 2.5;
        } else if (nilai.equals("C")) {
            hasil = 2;
        } else if (nilai.equals("D")) {
            hasil = 1;
        }

        return hasil;
    }

    public double nilaiAkhir() {

        String gradeTahfidz = konversiNilai(getNilaiTahfidz());
        String gradeKitab = konversiNilai(getNilaiKitab());
        String gradeAdab = konversiNilai(getNilaiAdab());

        double tahfidz = konversiGrade(gradeTahfidz) * 2;
        double kitab = konversiGrade(gradeKitab) * 3;
        double adab = konversiGrade(gradeAdab) * 3;

        return (tahfidz + kitab + adab) / 8;
    }

    public String predikat() {

        if (nilaiAkhir() <= 0) {
            return "Tidak Lulus";
        } else if (nilaiAkhir() >= 1 && nilaiAkhir() <= 2) {
            return "Kurang";
        } else if (nilaiAkhir() > 2 && nilaiAkhir() <= 2.9) {
            return "Cukup";
        } else if (nilaiAkhir() >= 3 && nilaiAkhir() <= 3.4) {
            return "Baik";
        } else {
            return "Sangat Baik";
        }
    }
}