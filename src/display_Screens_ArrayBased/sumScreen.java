package display_Screens_ArrayBased;

public class sumScreen extends javax.swing.JFrame {

    int[] array = null;
    int startIndex;
    int endIndex;
    int returnedValue = 0;
    int sum;
    static boolean next_halfCheck = false;
    static boolean prev_halfCheck = false;

    public sumScreen() {
        initComponents();
    }

    public sumScreen(int[] arr, int start, int end, int returnedValue) {
        setLocationRelativeTo(null);
        initComponents();

        this.returnedValue = returnedValue;
        this.array = arr;
        this.startIndex = start;
        this.endIndex = end;

        endField.setText(endIndex + "");
        startField.setText(startIndex + "");

        if (startIndex > endIndex) {
            next_halfCheck = true;
            prev_halfCheck = true;
        }

        if (!prev_halfCheck) {
            if (startIndex == 0) {
                previousCallMethod.setVisible(false);
                nextCallMethod.setVisible(true);
            }
        }

        if (next_halfCheck) {
            if (startIndex == 0) {
                previousCallMethod.setVisible(true);
                nextCallMethod.setVisible(false);
            }
            if (startIndex > endIndex) {
                returnedElementField.setText("Recursive Ends ---- Returning " + returnedValue + "");
            } else {
                sum = returnedValue + array[startIndex];
                currentElementField.setText("Current Element = " + array[startIndex] + "");
                returnedElementField.setText("Returned Element = " + returnedValue + "");
                sumField.setText("Sum : " + array[startIndex] + " + " + returnedValue + " = " + sum + "");
                endField.setText(endIndex + "");
                startField.setText(startIndex + "");
            }
            System.out.println("Recursive call received ( Sum method ): start index = " + startIndex + " and end index " + endIndex + "");
        }
    }

    int helpingFunction(int start, int end) {
        if (start == end) {
            return 0;
        }
        return helpingFunction(start - 1, end) + array[start];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextCallMethod = new javax.swing.JButton();
        previousCallMethod = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        startField = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endField = new javax.swing.JLabel();
        currentElementField = new javax.swing.JLabel();
        returnedElementField = new javax.swing.JLabel();
        sumField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        nextCallMethod.setText("Next Recursive call");
        nextCallMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCallMethodActionPerformed(evt);
            }
        });

        previousCallMethod.setText("Previous Recursive call");
        previousCallMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousCallMethodActionPerformed(evt);
            }
        });

        jLabel1.setText("start index =");

        startField.setText("0");

        jLabel3.setText("end index  =");

        endField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(previousCallMethod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(nextCallMethod))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(endField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(returnedElementField)
                                    .addComponent(currentElementField)
                                    .addComponent(sumField))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(currentElementField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnedElementField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumField)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(startField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextCallMethod)
                    .addComponent(previousCallMethod))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousCallMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousCallMethodActionPerformed
        int index;
        int value = 0;
        if (startIndex > endIndex) {
            next_halfCheck = false;
            prev_halfCheck = false;
        }
        if (prev_halfCheck) {
            index = startIndex + 1;
            if (startIndex < endIndex) {
                value = helpingFunction(endIndex, index);
            }
            sumScreen object = new sumScreen(array, index, endIndex, value);
            object.setVisible(true);
        } else {
            index = startIndex - 1;
            sumScreen object = new sumScreen(array, index, endIndex, 0);
            object.setVisible(true);
        }

    }//GEN-LAST:event_previousCallMethodActionPerformed

    private void nextCallMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCallMethodActionPerformed
        // TODO add your handling code here:

        if (next_halfCheck) {
            int index = startIndex - 1;
            int value = helpingFunction(endIndex, index);
            sumScreen object = new sumScreen(array, index, endIndex, value);
            object.setVisible(true);
            if (startIndex == 0) {
                next_halfCheck = false;
                prev_halfCheck = false;
            }
        } else {
            int index = startIndex + 1;
            // int value = secondHelpingFunction(endIndex, index);
            sumScreen object = new sumScreen(array, index, endIndex, 0);
            object.setVisible(true);
        }
    }//GEN-LAST:event_nextCallMethodActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentElementField;
    private javax.swing.JLabel endField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextCallMethod;
    private javax.swing.JButton previousCallMethod;
    private javax.swing.JLabel returnedElementField;
    private javax.swing.JLabel startField;
    private javax.swing.JLabel sumField;
    // End of variables declaration//GEN-END:variables
}
