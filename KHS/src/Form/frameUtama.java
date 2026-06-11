package Form;

public class frameUtama extends javax.swing.JFrame {

    public frameUtama() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        btnSantri = new javax.swing.JButton();
        btnUstadz = new javax.swing.JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnSantri.setText("Form Santri");

        btnUstadz.setText("Form Ustadz");

        btnSantri.addActionListener(evt -> {
            new frameSantri().setVisible(true);
        });

        btnUstadz.addActionListener(evt -> {
            new frameUstadz().setVisible(true);
        });

        javax.swing.GroupLayout layout =
                new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGap(40)
                        .addComponent(btnUstadz)
                        .addGap(40)
                        .addComponent(btnSantri)
                        .addGap(40)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGap(100)
                        .addGroup(layout.createParallelGroup()
                                .addComponent(btnUstadz)
                                .addComponent(btnSantri))
        );

        pack();
    }

    private javax.swing.JButton btnSantri;
    private javax.swing.JButton btnUstadz;
}