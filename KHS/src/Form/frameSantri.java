package Form;

import javax.swing.table.DefaultTableModel;
import khs.Santri;

public class frameSantri extends javax.swing.JFrame {

    Santri obj;

    public frameSantri() {
        initComponents();
        obj = new Santri();
        setLocationRelativeTo(null);
        tampilData();
    }

    private void tampilData() {

        DefaultTableModel model =
                new DefaultTableModel();

        model.addColumn("NIS");
        model.addColumn("Nama Santri");
        model.addColumn("Kamar");

        for (int i = 0; i < obj.listDataNis().size(); i++) {

            Object[] row = {
                obj.listDataNis().get(i),
                obj.listDataNama().get(i),
                obj.listDataKamar().get(i)
            };

            model.addRow(row);
        }

        tabelSantri.setModel(model);
    }

    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();

        txtNis = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKamar = new javax.swing.JTextField();

        btnTambah = new javax.swing.JButton();

        scroll = new javax.swing.JScrollPane();
        tabelSantri = new javax.swing.JTable();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        lbl1.setText("NIS");
        lbl2.setText("Nama Santri");
        lbl3.setText("Kamar");

        btnTambah.setText("TAMBAH");

        btnTambah.addActionListener(evt -> {

            obj.inputNis(txtNis.getText());
            obj.inputNama(txtNama.getText());
            obj.inputKamar(txtKamar.getText());

            tampilData();
        });

        scroll.setViewportView(tabelSantri);

        javax.swing.GroupLayout layout =
                new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(lbl1)
                                        .addComponent(lbl2)
                                        .addComponent(lbl3))
                                .addGap(20)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(txtNis)
                                        .addComponent(txtNama)
                                        .addComponent(txtKamar)
                                        .addComponent(btnTambah)))
                        .addComponent(scroll)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGap(20)
                        .addGroup(layout.createParallelGroup()
                                .addComponent(lbl1)
                                .addComponent(txtNis))
                        .addGap(10)
                        .addGroup(layout.createParallelGroup()
                                .addComponent(lbl2)
                                .addComponent(txtNama))
                        .addGap(10)
                        .addGroup(layout.createParallelGroup()
                                .addComponent(lbl3)
                                .addComponent(txtKamar))
                        .addGap(10)
                        .addComponent(btnTambah)
                        .addGap(10)
                        .addComponent(scroll)
        );

        pack();
    }

    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tabelSantri;
    private javax.swing.JTextField txtNis;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtKamar;
}