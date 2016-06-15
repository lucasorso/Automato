package br.com.unesc.linguagensformais.automato;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Automato extends javax.swing.JFrame {

    private String[] lAlfabeto;
    private int qtdLinhasTabela;
    private int lProximaLinhaAfd;
    private int lQtdLinhasAfnd;
    private int qtdLinhasAFD;

    public Automato() {
        initComponents();
        jPanelNovaTabelaDeTransicao.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelParametros = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtInicial = new javax.swing.JTextField();
        txtSentenca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        jPanelSaida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanelTabelaTransicao = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        gridAutomato = new javax.swing.JTable();
        btnExecutar = new javax.swing.JButton();
        btnConverter = new javax.swing.JButton();
        jPanelNovaTabelaDeTransicao = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        gridAFD = new javax.swing.JTable();
        btnTestaSentenca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Linguagens Formais");

        jPanelParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros"));

        jLabel7.setText("Estado Inicial");

        txtInicial.setText("q0");

        txtSentenca.setText("0110");
        txtSentenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentencaActionPerformed(evt);
            }
        });

        jLabel1.setText("Sentença");

        jLabel6.setText("Estados Finais");

        txtFinal.setText("q3");

        javax.swing.GroupLayout jPanelParametrosLayout = new javax.swing.GroupLayout(jPanelParametros);
        jPanelParametros.setLayout(jPanelParametrosLayout);
        jPanelParametrosLayout.setHorizontalGroup(
            jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParametrosLayout.createSequentialGroup()
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelParametrosLayout.setVerticalGroup(
            jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSentenca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));

        txtResultado.setEditable(false);
        txtResultado.setColumns(40);
        txtResultado.setRows(10);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanelSaidaLayout = new javax.swing.GroupLayout(jPanelSaida);
        jPanelSaida.setLayout(jPanelSaidaLayout);
        jPanelSaidaLayout.setHorizontalGroup(
            jPanelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaidaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSaidaLayout.setVerticalGroup(
            jPanelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaidaLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanelTabelaTransicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de Transição"));

        gridAutomato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"q0", "0", "q1"},
                {"q1", "1", "q1"},
                {"q1", "1", "q2"},
                {"q2", "0", "q3"},
                {"", "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estado", "Transição", "Resultado"
            }
        ));
        jScrollPane5.setViewportView(gridAutomato);

        javax.swing.GroupLayout jPanelTabelaTransicaoLayout = new javax.swing.GroupLayout(jPanelTabelaTransicao);
        jPanelTabelaTransicao.setLayout(jPanelTabelaTransicaoLayout);
        jPanelTabelaTransicaoLayout.setHorizontalGroup(
            jPanelTabelaTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        jPanelTabelaTransicaoLayout.setVerticalGroup(
            jPanelTabelaTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        btnConverter.setText("Converter para AFD");
        btnConverter.setEnabled(false);
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        jPanelNovaTabelaDeTransicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de transição Com Novos Estados"));

        gridAFD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {"", "", "", null},
                {"", "", "", null},
                {"", "", "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Estado", "Transição", "Resultado", "Estado Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(gridAFD);

        javax.swing.GroupLayout jPanelNovaTabelaDeTransicaoLayout = new javax.swing.GroupLayout(jPanelNovaTabelaDeTransicao);
        jPanelNovaTabelaDeTransicao.setLayout(jPanelNovaTabelaDeTransicaoLayout);
        jPanelNovaTabelaDeTransicaoLayout.setHorizontalGroup(
            jPanelNovaTabelaDeTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        jPanelNovaTabelaDeTransicaoLayout.setVerticalGroup(
            jPanelNovaTabelaDeTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnTestaSentenca.setText("Testa Sentença");
        btnTestaSentenca.setEnabled(false);
        btnTestaSentenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestaSentencaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelTabelaTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelParametros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTestaSentenca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConverter))
                    .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelNovaTabelaDeTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNovaTabelaDeTransicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelTabelaTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelParametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExecutar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTestaSentenca)
                                        .addComponent(btnConverter)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void constroiEstados(String estado) {
        int i, j, k;
        String novoEstado, estadoFinal;
        String estados[];
        for (j = 0; j < lAlfabeto.length; j++) {
            novoEstado = "";
            estados = estado.split(",");
            for (k = 0; k < estados.length; k++) {
                for (i = 0; i < lQtdLinhasAfnd; i++) {
                    if (gridAutomato.getValueAt(i, 0).toString().equals(estados[k])
                            && gridAutomato.getValueAt(i, 1).toString().equals(lAlfabeto[j])) {
                        if (!contemEstado(novoEstado, gridAutomato.getValueAt(i, 2).toString())) {
                            if (novoEstado != "") {
                                novoEstado += ",";
                            }
                            novoEstado += gridAutomato.getValueAt(i, 2).toString();
                        }
                    }
                }
            }
            if (novoEstado == "") {
                continue;
            }
            
            for (i = 0; i <= (lProximaLinhaAfd - 1); i++) {
                if (gridAFD.getValueAt(i, 0).toString().equals(estado)
                        && gridAFD.getValueAt(i, 1).toString().equals(lAlfabeto[j])
                        && gridAFD.getValueAt(i, 2).toString().equals(novoEstado)) {
                    break;
                }
            }
            if (i > (lProximaLinhaAfd - 1)) {
                gridAFD.setValueAt(estado, lProximaLinhaAfd, 0);
                gridAFD.setValueAt(lAlfabeto[j], lProximaLinhaAfd, 1);
                gridAFD.setValueAt(novoEstado, lProximaLinhaAfd, 2);
                estadoFinal = estadoFinalAFND(novoEstado);
                gridAFD.setValueAt(estadoFinal, lProximaLinhaAfd, 3);
                lProximaLinhaAfd++;

                txtResultado.append("---Inclui transi��o no AFD: " + estado + "  |  " + lAlfabeto[j] + "  |  " + novoEstado + "  " + estadoFinal + "\n");
                txtResultado.append("Constr�i estados a partir do novo estado: " + novoEstado + "\n");
                constroiEstados(novoEstado);
            }
        }
    }

    private boolean contemEstado(String estado1, String estado2) {
        int i;
        String estados[] = estado1.split(",");

        for (i = 0; i < estados.length; i++) {
            if (estados[i].equals(estado2)) {
                break;
            }
        }
        if (i < estados.length) {
            return true;
        } else {
            return false;
        }
    }

    private String estadoFinalAFND(String s) {
        int i, j;
        String estadosFinais[] = txtFinal.getText().split(",");
        String estadosAux[] = s.split(",");
        for (i = 0; i < estadosFinais.length; i++) {
            for (j = 0; j < estadosAux.length; j++) {
                if (estadosFinais[i].equals(estadosAux[j])) {
                    return "*";
                }
            }
        }

        return "";
    }

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        
        txtResultado.setText("");
        int i, j, qtdLinhas = 0;
        
        for (i = 0; i < gridAFD.getRowCount(); i++) {
            gridAFD.setValueAt(null, i, 0);
            gridAFD.setValueAt(null, i, 1);
            gridAFD.setValueAt(null, i, 2);
            gridAFD.setValueAt(null, i, 3);
        }
        
        for (i = 0; (i < gridAutomato.getRowCount() && gridAutomato.getValueAt(i, 0) != null); i++) {
            if (!gridAutomato.getValueAt(i, 0).toString().isEmpty()) {
                qtdLinhas++;
            } else {
                break;
            }
        }
        txtResultado.append("Aut�mato percorrendo a seq��ncia de entrada, aguarde..." + "\n\n");
        String estadoSelecionado = txtInicial.getText().toString();
        txtResultado.append(estadoSelecionado + "->");
        for (i = 0; i < txtSentenca.getText().length(); i++) {
            estadoSelecionado = proximoEstado(estadoSelecionado, txtSentenca.getText().substring(i, i + 1), qtdLinhas);
            if (estadoSelecionado == null){
                JOptionPane.showMessageDialog(this, "Automato N�o determin�stico");
                btnConverter.setEnabled(true);
                btnTestaSentenca.setEnabled(true);
                break;
            }
            txtResultado.append("\n" + estadoSelecionado);
        }
        System.out.println(Arrays.toString(lAlfabeto));
        if (estadoFinal(estadoSelecionado)) {
            txtResultado.append("\n\n" + "Entrada aceita!");
        } else {
            txtResultado.append("\n\n" + "Entrada rejeitada!");
        }
    }//GEN-LAST:event_btnExecutarActionPerformed

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed
        
        jPanelNovaTabelaDeTransicao.setVisible(true);
        this.btnTestaSentenca.setVisible(true);
        txtResultado.append("Convertendo" + "\n\n");
        int i;
        lQtdLinhasAfnd = 0;
        lProximaLinhaAfd = 0;
        
        for (i = 0; i < gridAFD.getRowCount(); i++) {
            gridAFD.setValueAt(null, i, 0);
            gridAFD.setValueAt(null, i, 1);
            gridAFD.setValueAt(null, i, 2);
            gridAFD.setValueAt(null, i, 3);
        }
        for (i = 0; (i < gridAutomato.getRowCount() && gridAutomato.getValueAt(i, 0) != null); i++) {
            if (!gridAutomato.getValueAt(i, 0).toString().isEmpty()) {
                lQtdLinhasAfnd++;
            } else {
                break;
            }
        }
        ArrayList<String> arrayAlfabetos = new ArrayList<String>();
        DefaultTableModel dtm = (DefaultTableModel) gridAutomato.getModel();
        int l = 0;
        while (l < lQtdLinhasAfnd) {
            if (arrayAlfabetos.contains((String) dtm.getValueAt(l, 1))) {
                l++;
                continue;
            }
            arrayAlfabetos.add((String) dtm.getValueAt(l, 1));
            l++;
        }
        lAlfabeto = arrayAlfabetos.toArray(new String[arrayAlfabetos.size()]);
        txtResultado.setText("");
        txtResultado.append("Convertendo" + "\n\n");
        txtResultado.append("Constr�i estados a partir do estado inicial: "
            + txtInicial.getText() + "\n");

        constroiEstados(txtInicial.getText());

        txtResultado.append("\nFinal da convers�o para aut�mato finito determin�stico");
    }//GEN-LAST:event_btnConverterActionPerformed

    private void btnTestaSentencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestaSentencaActionPerformed

        int i, j;

        txtResultado.setText("");

        qtdLinhasAFD = 0;
        for (i = 0; (i < gridAFD.getRowCount() && gridAFD.getValueAt(i, 0) != null); i++) {
            if (!gridAFD.getValueAt(i, 0).toString().isEmpty()) {
                qtdLinhasAFD++;
            } else {
                break;
            }
        }
        txtResultado.append("Aut�mato percorrendo a seq��ncia de entrada, aguarde..." + "\n\n");

        String estadoInicial = txtInicial.getText().toString();
        txtResultado.append("->" + estadoInicial);

        for (i = 0; i < txtSentenca.getText().length(); i++) {
            estadoInicial = proximoEstado(estadoInicial, txtSentenca.getText().substring(i, i + 1));
            if (estadoInicial == null){
                break;
            }
            txtResultado.append("\n" + estadoInicial);
        }

        if (estadoFinalAFD(estadoInicial)) {
            txtResultado.append("\n\n" + "Entrada aceita!");
        } else {
            txtResultado.append("\n\n" + "Entrada rejeitada!");
        }
    }//GEN-LAST:event_btnTestaSentencaActionPerformed

    private void txtSentencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentencaActionPerformed

    private String proximoEstado(String estado, String transicao, int qtdLinhas) {
        int i;
        String novoEstado = null;
        try {
            for (i = 0; i < qtdLinhas; i++) {
                if (gridAutomato.getValueAt(i, 0).toString().equals(estado)
                        && gridAutomato.getValueAt(i, 1).toString().equals(transicao)) {
                    novoEstado = gridAutomato.getValueAt(i, 2).toString();
                    break;
                }
            }    
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        return novoEstado;
    }

    private String proximoEstado(String p1, String p2) {
        int i;
        String s = null;
        try{
            for (i = 0; i < qtdLinhasAFD; i++) {
                if (gridAFD.getValueAt(i, 0).toString().equals(p1)
                        && gridAFD.getValueAt(i, 1).toString().equals(p2)) {
                    s = gridAFD.getValueAt(i, 2).toString();
                    break;
                }
            }    
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        return s;
    }

    private boolean estadoFinal(String s) {
        int i;
        String estadosFinais[] = txtFinal.getText().split(",");

        for (i = 0; i < estadosFinais.length; i++) {
            if (estadosFinais[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    private boolean estadoFinalAFD(String s) {
        int i;

        for (i = 0; i < qtdLinhasAFD; i++) {
            if (gridAFD.getValueAt(i, 2).toString().equals(s)
                    && gridAFD.getValueAt(i, 3).toString().equals("*")) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Automato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverter;
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnTestaSentenca;
    private javax.swing.JTable gridAFD;
    private javax.swing.JTable gridAutomato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelNovaTabelaDeTransicao;
    private javax.swing.JPanel jPanelParametros;
    private javax.swing.JPanel jPanelSaida;
    private javax.swing.JPanel jPanelTabelaTransicao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInicial;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtSentenca;
    // End of variables declaration//GEN-END:variables

}
