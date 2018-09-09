package display_Screens_ArrayBased;

public class mainScreen extends javax.swing.JFrame {

    String arrayName = "array";
    int[] array = new int[20];
    int count = -1;
    String text = "";
    int textFormatter = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printArray = new javax.swing.JButton();
        insertElement = new javax.swing.JButton();
        insertEditext = new javax.swing.JTextField();
        printSumOfArray = new javax.swing.JButton();
        arrayDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arrayModel = new javax.swing.JTextArea();
        reversePrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Semester Project");
        setResizable(false);
        setSize(new java.awt.Dimension(730, 505));

        printArray.setText("Print");
        printArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printArrayActionPerformed(evt);
            }
        });

        insertElement.setText("Insert");
        insertElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertElementActionPerformed(evt);
            }
        });

        insertEditext.setToolTipText("Element");

        printSumOfArray.setText("Sum");
        printSumOfArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printSumOfArrayActionPerformed(evt);
            }
        });

        arrayDescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        arrayDescription.setText("(Array , 0 , 3)");

        arrayModel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        arrayModel.setColumns(20);
        arrayModel.setRows(10);
        arrayModel.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jScrollPane1.setViewportView(arrayModel);

        reversePrint.setText("Print in Reverse Order");
        reversePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversePrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(arrayDescription))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(printArray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insertElement, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(insertEditext, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(printSumOfArray, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(reversePrint, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(arrayDescription)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertElement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertEditext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printArray, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printSumOfArray, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reversePrint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printArrayActionPerformed
        // TODO add your handling code here:
        printScreen object = new printScreen(array, 0, count);
        object.setVisible(true);
    }//GEN-LAST:event_printArrayActionPerformed

    private void insertElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertElementActionPerformed
        // TODO add your handling code here:

        String temp = insertEditext.getText().trim();

        if (checkInputtedValue(temp, 0, temp.length())) {

            int element = Integer.parseInt(temp);

            if (array.length == count + 1) {
                System.out.print("OverFlow");
            } else {
                System.out.println("Inserting into array -  " + element);
                count++;
                array[count] = element;
                insertEditext.setText("");
            }
        } else {
            System.out.println("Input Mis-matched - enter only integer values");
             insertEditext.setText("");
        }

        setDataToView();
    }//GEN-LAST:event_insertElementActionPerformed

    boolean checkInputtedValue(String value, int start, int end) {
        if (start == end) {
            return true;
        }
        if (!(value.charAt(start) >= '0' && value.charAt(start) <= '9')) {
            return false;
        }
        return checkInputtedValue(value, start + 1, end);
    }


    private void printSumOfArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printSumOfArrayActionPerformed
        // TODO add your handling code here:
        sumScreen object = new sumScreen(array, 0, count, 0);
        object.setVisible(true);
    }//GEN-LAST:event_printSumOfArrayActionPerformed

    private void reversePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversePrintActionPerformed
        // TODO add your handling code here: 
        printScreen_reverseOrder ob = new printScreen_reverseOrder(array, 0, count);
        ob.setVisible(true);

    }//GEN-LAST:event_reversePrintActionPerformed

    private void prepareScreenText(int start, int end) {
        if (start > end) {
            return;
        }
        if (start == end) {
            text += array[start];
        } else {
            text += array[start] + " , ";
        }
        if (textFormatter == 20) {
            text += "\n";
            textFormatter = 0;
        }
        textFormatter++;
        prepareScreenText(start + 1, end);
    }

    private void setDataToView() {
        text = "";
        prepareScreenText(0, count);
        arrayModel.setText(text);
        arrayDescription.setText("(" + arrayName + ", 0 , " + count + ")");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);
            }
        });
    }

    private void initializeArray(int start, int end) {
        if (start == end) {
            return;
        }
        array[start] = start;
        initializeArray(start + 1, end);
        System.out.println("Inserting into array -  " + start);
        // recursion back - safe to incerement the count now
        count++;
    }

    public mainScreen() {
        initComponents();
        setLocationRelativeTo(null);
        initializeArray(0, 5);
        setDataToView();
        arrayModel.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrayDescription;
    private javax.swing.JTextArea arrayModel;
    private javax.swing.JTextField insertEditext;
    private javax.swing.JButton insertElement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printArray;
    private javax.swing.JButton printSumOfArray;
    private javax.swing.JButton reversePrint;
    // End of variables declaration//GEN-END:variables
}
