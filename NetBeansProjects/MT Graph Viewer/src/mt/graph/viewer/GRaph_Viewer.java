/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mt.graph.viewer;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Kuta
 */
public class GRaph_Viewer extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;
    
    String[] valores=new String[200];
		String[] valores0=new String[800];
                String[] Fechas=new String[800];
                String[] Horas=new String[800];
		String[] valores1=new String[800];
		String[] valores2=new String[800];
		String[] valores3=new String[800];
		String[] valores4=new String[800];
		int ind= 0;
		int crg= 0;
   
    /**
     * Creates new form ColorChannelEditor
     */
    public GRaph_Viewer() {
        initComponents();
        openFileChooser= new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\temp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("Archivos csv","csv"));
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpenFileButon = new javax.swing.JButton();
        MessajeLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MT GRaph Viewer");
        setLocation(new java.awt.Point(300, 300));
        setName("MT GRaph Viewer"); // NOI18N

        OpenFileButon.setText("Abrir CSV");
        OpenFileButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileButonActionPerformed(evt);
            }
        });

        jButton1.setText("Leer");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setName("Table0"); // NOI18N

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Señal1", "Señal2", "Señal3", "Señal4"
            }
        ));
        jScrollPane1.setViewportView(jTableData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OpenFileButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MessajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OpenFileButon)
                        .addComponent(MessajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileButonActionPerformed
        int returnValue = openFileChooser.showOpenDialog(this);
        
        if (returnValue == JFileChooser.APPROVE_OPTION){
          
               MessajeLabel.setText(openFileChooser.getSelectedFile().toString());
               jButton1.setEnabled(true);
    }
        else{
                MessajeLabel.setText("No file chosen!");
                }
    }//GEN-LAST:event_OpenFileButonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
	List<String> lines = Files.readAllLines(Paths.get(MessajeLabel.getText()));
	for (String line : lines) {
		line = line.replace("\"","");
		//System.out.println(line);
		valores[ind]=line;
		ind++;
	}
}catch(Exception e) {
	System.out.println(e.getMessage()); 	
}

for(int j=0;j<130;j++) {
Scanner scanner0 = new Scanner(valores[j]);
scanner0.useDelimiter(",");

while(scanner0.hasNext()) {
	String temp=scanner0.next();
	//System.out.println(temp + " " + crg);
	valores0[crg]=temp;
	crg=crg+1;
	
	
	if(crg == 780) {
    crg=0;
	}
	
}
}


//********************************************************************
for(int v=0;v<130;v++) {
	if( v == 0) {
		Fechas[v]=valores0[v];	
	}
	if( v > 0) {
	Fechas[v]=valores0[v*6];
	}
	//System.out.println(valores1[v]+ " ("+ v + ")");
}
//********************************************************************
for(int w=0;w<130;w++) {
	
	Horas[w]=valores0[w*6+1];
	
}
//********************************************************************
for(int y=0;y<130;y++) {
	
	valores1[y]=valores0[y*6+2];
	
}
//********************************************************************
for(int z=0;z<130;z++) {
	
	valores2[z]=valores0[z*6+3];
	
}
//********************************************************************
for(int t=0;t<130;t++) {
	
	valores3[t]=valores0[t*6+4];
	
}
//********************************************************************
for(int l=0;l<130;l++) {
	
	valores4[l]=valores0[l*6+5];
	
}
for(int k=0;k<130;k++) {
	System.out.println(Fechas[k] + " ("+ k + ")"+ Horas[k] + " ("+ k + ")" + valores1[k]+ " ("+ k + ")" + valores2[k]+ " ("+ k + ")" + valores3[k]+ " ("+ k + ")" + valores4[k]+ " ("+ k + ")");
}


DefaultTableModel model=(DefaultTableModel) jTableData.getModel();

for(int u=0;u<130;u++){
model.addRow(new Object[]{Fechas[u],Horas[u],valores1[u],valores2[u],valores3[u],valores4[u]});
}


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GRaph_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRaph_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRaph_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRaph_Viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
	
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GRaph_Viewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MessajeLabel;
    private javax.swing.JButton OpenFileButon;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableData;
    // End of variables declaration//GEN-END:variables
}
