package br.com.unesc.linguagensformais.automato;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Automato extends javax.swing.JFrame {

    private String[] alfabeto;
    private int qtdLinhasTabela;
    private int lProximaLinhaAfd;
    private int lQtdLinhasAfnd;
    private int qtdLinhasAFD;

    public Automato() 
    {
        initComponents();
        pnlNovaTabelaDeTransicao.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelParametros = new javax.swing.JPanel();
        labeEstadoInicial = new javax.swing.JLabel();
        txtInicial = new javax.swing.JTextField();
        txtSentenca = new javax.swing.JTextField();
        labelSentenca = new javax.swing.JLabel();
        labelEstadosFinais = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        jPanelSaida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextArea();
        pnlTabelaTransicao = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        btnExecutar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pnlNovaTabelaDeTransicao = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Linguagens Formais");

        painelParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros"));

        labeEstadoInicial.setText("Estado Inicial");

        txtInicial.setText("A");

        txtSentenca.setText("0110");
        txtSentenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSentencaActionPerformed(evt);
            }
        });

        labelSentenca.setText("Sentença");

        labelEstadosFinais.setText("Estados Finais");

        txtFinal.setText("C");
        txtFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelParametrosLayout = new javax.swing.GroupLayout(painelParametros);
        painelParametros.setLayout(painelParametrosLayout);
        painelParametrosLayout.setHorizontalGroup(
            painelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelParametrosLayout.createSequentialGroup()
                .addGroup(painelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeEstadoInicial)
                    .addComponent(labelSentenca)
                    .addComponent(labelEstadosFinais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelParametrosLayout.setVerticalGroup(
            painelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeEstadoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstadosFinais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSentenca)
                    .addComponent(txtSentenca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));

        txtSaida.setEditable(false);
        txtSaida.setColumns(40);
        txtSaida.setRows(10);
        jScrollPane1.setViewportView(txtSaida);

        javax.swing.GroupLayout jPanelSaidaLayout = new javax.swing.GroupLayout(jPanelSaida);
        jPanelSaida.setLayout(jPanelSaidaLayout);
        jPanelSaidaLayout.setHorizontalGroup(
            jPanelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelSaidaLayout.setVerticalGroup(
            jPanelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pnlTabelaTransicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de Transição"));

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "a", "B"},
                {"A", "b", "B"},
                {"B", "a", "C"},
                {"B", "a", "B"},
                {"C", "b", "B"},
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
        jScrollPane2.setViewportView(tabela1);

        javax.swing.GroupLayout pnlTabelaTransicaoLayout = new javax.swing.GroupLayout(pnlTabelaTransicao);
        pnlTabelaTransicao.setLayout(pnlTabelaTransicaoLayout);
        pnlTabelaTransicaoLayout.setHorizontalGroup(
            pnlTabelaTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        pnlTabelaTransicaoLayout.setVerticalGroup(
            pnlTabelaTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        pnlNovaTabelaDeTransicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de transição Com Novos Estados"));

        tabela2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabela2);

        javax.swing.GroupLayout pnlNovaTabelaDeTransicaoLayout = new javax.swing.GroupLayout(pnlNovaTabelaDeTransicao);
        pnlNovaTabelaDeTransicao.setLayout(pnlNovaTabelaDeTransicaoLayout);
        pnlNovaTabelaDeTransicaoLayout.setHorizontalGroup(
            pnlNovaTabelaDeTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        pnlNovaTabelaDeTransicaoLayout.setVerticalGroup(
            pnlNovaTabelaDeTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlTabelaTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelParametros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addGap(113, 113, 113))
                    .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlNovaTabelaDeTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNovaTabelaDeTransicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlTabelaTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(painelParametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnExecutar)
                                    .addComponent(btnLimpar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void constroiEstados(String estado)
    {
        int i, j, k;
        String novoEstado, estadoFinal;
        String estados[];
        for (j = 0; j < alfabeto.length; j++) 
        {
            novoEstado = "";
            estados = estado.split(",");
            for (k = 0; k < estados.length; k++)
            {
                for (i = 0; i < lQtdLinhasAfnd; i++) 
                {
                    if (tabela1.getValueAt(i, 0).toString().equals(estados[k]) 
                            && tabela1.getValueAt(i, 1).toString().equals(alfabeto[j]))
                    {
                        if (!contemEstado(novoEstado, tabela1.getValueAt(i, 2).toString())) {
                            if (novoEstado != "") 
                                novoEstado += ",";
                            
                            novoEstado += tabela1.getValueAt(i, 2).toString();
                        }
                    }
                }
            }
            if (novoEstado == "") 
                continue;

            for (i = 0; i <= (lProximaLinhaAfd - 1); i++) 
            {
                if (tabela2.getValueAt(i, 0).toString().equals(estado)
                        && tabela2.getValueAt(i, 1).toString().equals(alfabeto[j])
                        && tabela2.getValueAt(i, 2).toString().equals(novoEstado)) {
                    break;
                }
            }
            if (i > (lProximaLinhaAfd - 1))
            {
                tabela2.setValueAt(estado, lProximaLinhaAfd, 0);
                tabela2.setValueAt(alfabeto[j], lProximaLinhaAfd, 1);
                tabela2.setValueAt(novoEstado, lProximaLinhaAfd, 2);
                estadoFinal = constroiNovoEstadoFinal(novoEstado);
                tabela2.setValueAt(estadoFinal, lProximaLinhaAfd, 3);
                lProximaLinhaAfd++;
                txtSaida.append("-Transição de estado -> " + estado + " Transição -> " + alfabeto[j] + " Novo Estado -> " + novoEstado + " | " + estadoFinal + "\n");
                constroiEstados(novoEstado);
            }
        }
    }

    private boolean contemEstado(String estado1, String estado2) 
    {
        int i;
        String estados[] = estado1.split(",");

        for (i = 0; i < estados.length; i++) 
        {
            if (estados[i].equals(estado2))
                break;
        }
        if (i < estados.length) 
            return true;
        else 
            return false;
    }

    private String constroiNovoEstadoFinal(String estado)
    {
        int i, j;
        String estadosFinais[] = txtFinal.getText().split(",");
        String estadosAux[] = estado.split(",");
        for (i = 0; i < estadosFinais.length; i++) 
        {
            for (j = 0; j < estadosAux.length; j++) 
            {
                if (estadosFinais[i].equals(estadosAux[j])) 
                    return "*";
            }
        }
        return "";
    }

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed

        if (!tabela2.getValueAt(0, 0).toString().isEmpty()) 
        {
            int i, j;
            txtSaida.setText("");
            qtdLinhasAFD = 0;
            for (i = 0; (i < tabela2.getRowCount() && tabela2.getValueAt(i, 0) != null); i++) 
            {
                if (!tabela2.getValueAt(i, 0).toString().isEmpty())
                    qtdLinhasAFD++;
                else 
                    break;
            }
            txtSaida.append("Automato percorrendo a sequência de entrada, aguarde..." + "\n\n");

            String estadoInicial = txtInicial.getText().toString();
            txtSaida.append("->" + estadoInicial);

            for (i = 0; i < txtSentenca.getText().length(); i++) 
            {
                estadoInicial = proximoEstado(estadoInicial, txtSentenca.getText().substring(i, i + 1));
                if (estadoInicial == null) 
                    break;
                txtSaida.append("\n" + estadoInicial);
            }

            if (estadoFinalAFD(estadoInicial)) 
                txtSaida.append("\n\n" + "Entrada aceita!");
            else 
                txtSaida.append("\n\n" + "Entrada rejeitada!");
        } else 
        {
            txtSaida.setText("");
            int i, j, qtdLinhas = 0;

            for (i = 0; i < tabela2.getRowCount(); i++)
            {
                tabela2.setValueAt("", i, 0);
                tabela2.setValueAt("", i, 1);
                tabela2.setValueAt("", i, 2);
                tabela2.setValueAt("", i, 3);
            }

            String lEstado = "";
            String lTransicao = "";

            for (i = 0; (i < tabela1.getRowCount() && tabela1.getValueAt(i, 0) != null); i++) 
            {
                if (!tabela1.getValueAt(i, 0).toString().isEmpty()) {
                    if (lEstado.equals(tabela1.getValueAt(i, 0).toString()) && lTransicao.equals(tabela1.getValueAt(i, 1).toString())) 
                    {
                        if (JOptionPane.showConfirmDialog(null, "Automato não determinístico, deseja converter?", "Opção", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                        {
                            Converter();
                        }
                        return;
                    }
                    lEstado = tabela1.getValueAt(i, 0).toString();
                    lTransicao = tabela1.getValueAt(i, 1).toString();
                    qtdLinhas++;
                } else 
                {
                    break;
                }
            }

            txtSaida.append("Automato percorrendo a sequencia de entrada, aguarde..." + "\n\n");
            String estadoSelecionado = txtInicial.getText().toString();
            txtSaida.append(estadoSelecionado + "->");
            for (i = 0; i < txtSentenca.getText().length(); i++)
            {
                estadoSelecionado = proximoEstado(estadoSelecionado, txtSentenca.getText().substring(i, i + 1), qtdLinhas);
                if (estadoSelecionado == null) 
                {
                    break;
                }
                txtSaida.append("\n" + estadoSelecionado);
            }
            if (estadoFinal(estadoSelecionado))
            {
                txtSaida.append("\n" + "Entrada aceita!");
            } else 
            {
                txtSaida.append("\n" + "Entrada rejeitada!");
            }
        }
    }//GEN-LAST:event_btnExecutarActionPerformed

    private void Converter() 
    {
        pnlNovaTabelaDeTransicao.setVisible(true);
        txtSaida.append("Convertendo" + "\n");
        int i;
        lQtdLinhasAfnd = 0;
        lProximaLinhaAfd = 0;

        for (i = 0; i < tabela2.getRowCount(); i++)
        {
            tabela2.setValueAt(null, i, 0);
            tabela2.setValueAt(null, i, 1);
            tabela2.setValueAt(null, i, 2);
            tabela2.setValueAt(null, i, 3);
        }
        for (i = 0; (i < tabela1.getRowCount() && tabela1.getValueAt(i, 0) != null); i++) 
        {
            if (!tabela1.getValueAt(i, 0).toString().isEmpty()) 
            {
                lQtdLinhasAfnd++;
            } else 
            {
                break;
            }
        }
        ArrayList<String> arrayAlfabetos = new ArrayList<String>();
        DefaultTableModel dtm = (DefaultTableModel) tabela1.getModel();
        int l = 0;
        while (l < lQtdLinhasAfnd) 
        {
            if (arrayAlfabetos.contains((String) dtm.getValueAt(l, 1))) 
            {
                l++;
                continue;
            }
            arrayAlfabetos.add((String) dtm.getValueAt(l, 1));
            l++;
        }
        alfabeto = arrayAlfabetos.toArray(new String[arrayAlfabetos.size()]);
        txtSaida.setText("");
        txtSaida.append("Convertendo" + "\n\n");
        txtSaida.append("Constroi estados a partir do estado inicial: " + txtInicial.getText() + "\n");
        constroiEstados(txtInicial.getText());
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        for (int i = 0; i < tabela2.getRowCount(); i++) 
        {
            tabela2.setValueAt("", i, 0);
            tabela2.setValueAt("", i, 1);
            tabela2.setValueAt("", i, 2);
            tabela2.setValueAt("", i, 3);
        }
        txtSaida.setText("");
        pnlNovaTabelaDeTransicao.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtSentencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSentencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSentencaActionPerformed

    private void txtFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalActionPerformed

    private String proximoEstado(String estado, String transicao, int qtdLinhas) {
        int i;
        String novoEstado = null;
        try {
            for (i = 0; i < qtdLinhas; i++) {
                if (tabela1.getValueAt(i, 0).toString().equals(estado) && tabela1.getValueAt(i, 1).toString().equals(transicao)) {
                    novoEstado = tabela1.getValueAt(i, 2).toString();
                    break;
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return novoEstado;
    }

    private String proximoEstado(String estado, String transicao) {
        int i;
        String s = null;
        try {
            for (i = 0; i < qtdLinhasAFD; i++) {
                if (tabela2.getValueAt(i, 0).toString().equals(estado) && tabela2.getValueAt(i, 1).toString().equals(transicao)) {
                    s = tabela2.getValueAt(i, 2).toString();
                    break;
                }
            }
        } catch (NullPointerException e) {
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
            if (tabela2.getValueAt(i, 2).toString().equals(s) && tabela2.getValueAt(i, 3).toString().equals("*")) {
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
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jPanelSaida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labeEstadoInicial;
    private javax.swing.JLabel labelEstadosFinais;
    private javax.swing.JLabel labelSentenca;
    private javax.swing.JPanel painelParametros;
    private javax.swing.JPanel pnlNovaTabelaDeTransicao;
    private javax.swing.JPanel pnlTabelaTransicao;
    private javax.swing.JTable tabela1;
    private javax.swing.JTable tabela2;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInicial;
    private javax.swing.JTextArea txtSaida;
    private javax.swing.JTextField txtSentenca;
    // End of variables declaration//GEN-END:variables
}
