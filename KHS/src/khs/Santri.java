package khs;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Santri extends CapaianSantri {

    private String nis;
    private String nama;
    private String kamar;

    private ArrayList<String> dataSantri;
    private ArrayList<String> dataNis;
    private ArrayList<String> dataKamar;

    public Santri() {

        dataSantri = new ArrayList<>();
        dataNis = new ArrayList<>();
        dataKamar = new ArrayList<>();
    }

    public Santri(String nis, String nama, String kamar) {

        this.nis = nis;
        this.nama = nama;
        this.kamar = kamar;

        dataSantri = new ArrayList<>();
        dataNis = new ArrayList<>();
        dataKamar = new ArrayList<>();
    }

    public int getIndexData(String nis) {

        int index = dataNis.indexOf(nis);

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
        }

        return index;
    }

    public void cariSantri(String nis) {

        int index = getIndexData(nis);

        if (index >= 0) {

            String nama = dataSantri.get(index);
            String kamar = dataKamar.get(index);

            JOptionPane.showMessageDialog(
                    null,
                    "NIS : " + nis
                    + "\nNama : " + nama
                    + "\nKamar : " + kamar
            );
        }
    }

    public void inputNis(String data) {
        dataNis.add(data);
    }

    public void inputNama(String data) {
        dataSantri.add(data);
    }

    public void inputKamar(String data) {
        dataKamar.add(data);
    }

    public ArrayList<String> listDataNis() {
        return dataNis;
    }

    public ArrayList<String> listDataNama() {
        return dataSantri;
    }

    public ArrayList<String> listDataKamar() {
        return dataKamar;
    }
}