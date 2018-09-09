package display_Screens_ArrayBased;

public class printScreen extends javax.swing.JFrame {
    
    int startIndex;
    int endIndex;
    int[] array = null;

    public printScreen() {
         initComponents();
    }
    
    
    
    public printScreen(int[] arr , int start , int end) {
        setLocationRelativeTo(null);
        initComponents();
        
        
        array = arr;
        this.startIndex = start;
        this.endIndex = end;
                        
        elementField.setText("Current Element is "+array[startIndex]+"");
        endIndexLabel.setText(end+"");
        startIndexLabel.setText(start+"");
        
        if(startIndex == endIndex){
            nextRecursiveCall.setVisible(false);
        }
        if(startIndex == 0){
          previousRecursiveCall.setVisible(false);   
        }
        System.out.println("Recursive call received ( print method - Array Based ) : start index = "+startIndex+" and end index "+endIndex+"");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elementField = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        startIndexLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endIndexLabel = new javax.swing.JLabel();
        nextRecursiveCall = new javax.swing.JButton();
        previousRecursiveCall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Printing Recursion"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        elementField.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        elementField.setText("elements");

        jLabel1.setText("start index =");

        startIndexLabel.setText("0");

        jLabel3.setText("end index = ");

        endIndexLabel.setText("-99");

        nextRecursiveCall.setText("Next Recursive Call");
        nextRecursiveCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRecursiveCallActionPerformed(evt);
            }
        });

        previousRecursiveCall.setText("Previous Recursive Call");
        previousRecursiveCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousRecursiveCallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elementField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(previousRecursiveCall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(nextRecursiveCall)))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endIndexLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startIndexLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(elementField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(startIndexLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endIndexLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextRecursiveCall)
                    .addComponent(previousRecursiveCall))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextRecursiveCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRecursiveCallActionPerformed
        // TODO add your handling code here:
        
        printScreen object = new printScreen(array,startIndex+1,endIndex);
        object.setVisible(true);
        
        
    }//GEN-LAST:event_nextRecursiveCallActionPerformed

    private void previousRecursiveCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousRecursiveCallActionPerformed
        // TODO add your handling code here:
         printScreen object = new printScreen(array,startIndex-1,endIndex);
         object.setVisible(true);
    }//GEN-LAST:event_previousRecursiveCallActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementField;
    private javax.swing.JLabel endIndexLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextRecursiveCall;
    private javax.swing.JButton previousRecursiveCall;
    private javax.swing.JLabel startIndexLabel;
    // End of variables declaration//GEN-END:variables
}
