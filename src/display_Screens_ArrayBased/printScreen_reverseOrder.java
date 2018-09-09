package display_Screens_ArrayBased;

public class printScreen_reverseOrder extends javax.swing.JFrame {

    int[] array = null;
    int startIndex;
    int endIndex;
    int returnedValue = 0;
    int sum;
    static boolean next_halfCheck = false;
    static boolean prev_halfCheck = false;

    public printScreen_reverseOrder() {
        initComponents();
    }

    printScreen_reverseOrder(int[] arr, int start, int end) {
        setLocationRelativeTo(null);
        initComponents();

        this.array = arr;
        this.startIndex = start;
        this.endIndex = end;

        staringIndex.setText(startIndex + "");
        endingIndex.setText(endIndex + "");

        if (startIndex > endIndex) {
            next_halfCheck = true;
            prev_halfCheck = true;
        }

        if (!prev_halfCheck) {
            if (startIndex == 0) {
                previousRecursiveCall.setVisible(false);
                nextRecursiveCall.setVisible(true);
            }
        }

        if (next_halfCheck) {
            if (startIndex == 0) {
                previousRecursiveCall.setVisible(true);
                nextRecursiveCall.setVisible(false);
            }
            if (startIndex <= endIndex) {
                currentElement.setText("Current Element = " + array[startIndex] + "");
                staringIndex.setText(startIndex + "");
                endingIndex.setText(endIndex + "");
            }
        }
        System.out.println("Recursive call received ( print in reverse method ): start index = " + startIndex + " and end index " + endIndex + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentElement = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        staringIndex = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endingIndex = new javax.swing.JLabel();
        nextRecursiveCall = new javax.swing.JButton();
        previousRecursiveCall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Printing Recursion"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        currentElement.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jLabel1.setText("start index =");

        staringIndex.setText("0");

        jLabel3.setText("end index = ");

        endingIndex.setText("-99");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousRecursiveCall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(nextRecursiveCall)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentElement, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endingIndex))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staringIndex)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(currentElement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(staringIndex))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endingIndex))
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

        if (next_halfCheck) {
            int index = startIndex - 1;
            printScreen_reverseOrder object = new printScreen_reverseOrder(array, index, endIndex);
            object.setVisible(true);
            if (startIndex == 0) {
                next_halfCheck = false;
                prev_halfCheck = false;
            }
        } else {
            int index = startIndex + 1;
            printScreen_reverseOrder object = new printScreen_reverseOrder(array, index, endIndex);
            object.setVisible(true);
        }

    }//GEN-LAST:event_nextRecursiveCallActionPerformed

    private void previousRecursiveCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousRecursiveCallActionPerformed
        // TODO add your handling code here:
        int index;

        if (startIndex > endIndex) {
            next_halfCheck = false;
            prev_halfCheck = false;
        }
        if (prev_halfCheck) {
            index = startIndex + 1;
            printScreen_reverseOrder object = new printScreen_reverseOrder(array, index, endIndex);
            object.setVisible(true);
        } else {
            index = startIndex - 1;
            printScreen_reverseOrder object = new printScreen_reverseOrder(array, index, endIndex);
            object.setVisible(true);
        }

    }//GEN-LAST:event_previousRecursiveCallActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printScreen_reverseOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentElement;
    private javax.swing.JLabel endingIndex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextRecursiveCall;
    private javax.swing.JButton previousRecursiveCall;
    private javax.swing.JLabel staringIndex;
    // End of variables declaration//GEN-END:variables
}
