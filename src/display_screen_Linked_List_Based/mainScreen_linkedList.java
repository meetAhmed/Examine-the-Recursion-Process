package display_screen_Linked_List_Based;

import LinkedList.node;
import LinkedList.singlyLinkedList;

public class mainScreen_linkedList extends javax.swing.JFrame {

    singlyLinkedList object = new singlyLinkedList();

    String name = "Linked List";
    String text = "";
    int textFormatter = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printLinkedList = new javax.swing.JButton();
        insertElement = new javax.swing.JButton();
        insertEditext = new javax.swing.JTextField();
        SumLinkedList = new javax.swing.JButton();
        arrayDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arrayModel = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Semester Project");
        setResizable(false);
        setSize(new java.awt.Dimension(730, 505));

        printLinkedList.setText("Print");
        printLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printLinkedListActionPerformed(evt);
            }
        });

        insertElement.setText("Insert");
        insertElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertElementActionPerformed(evt);
            }
        });

        insertEditext.setToolTipText("Element");

        SumLinkedList.setText("Sum");
        SumLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumLinkedListActionPerformed(evt);
            }
        });

        arrayDescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        arrayDescription.setText("(List , 0 , 3)");

        arrayModel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        arrayModel.setColumns(20);
        arrayModel.setRows(10);
        arrayModel.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jScrollPane1.setViewportView(arrayModel);

        jButton1.setText("Print in Reverse Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                                    .addComponent(printLinkedList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insertElement, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertEditext, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SumLinkedList, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(arrayDescription)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(insertElement, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(insertEditext)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(printLinkedList, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(SumLinkedList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printLinkedListActionPerformed
        node tempNode = object.getHead();
        printListElement o = new printListElement(tempNode);
        o.setVisible(true);
    }//GEN-LAST:event_printLinkedListActionPerformed

    private void insertElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertElementActionPerformed

        String temp = insertEditext.getText().trim();

        if (checkInputtedValue(temp, 0, temp.length())) {
            int element = Integer.parseInt(temp);

            object.createNode(element);

            setDataToView();

            System.out.println("Inserting into list - " + element);

            insertEditext.setText("");
        } else {
            System.out.println("Input Mis-matched : Enter only integers value");

            insertEditext.setText("");
        }


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
    private void SumLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumLinkedListActionPerformed
        sumScreen_linkedList o = new sumScreen_linkedList(object.getHead());
        o.setVisible(true);
    }//GEN-LAST:event_SumLinkedListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        printListElement_reverseOrder o = new printListElement_reverseOrder(object.getHead());
        o.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    void prepareScreenText(node n) {
        if (n == null) {
            return;
        }
        if (n.getNext() == null) {
            text += n.getValue();
        } else {
            text += n.getValue() + " , ";
        }
        if (textFormatter == 20) {
            text += "\n";
            textFormatter = 0;
        }
        textFormatter++;
        // System.out.println(n);
        prepareScreenText(n.getNext());
    }

    private void setDataToView() {
        text = "";
        prepareScreenText(object.getHead());
        arrayModel.setText(text);
        arrayDescription.setText("(" + name + ", 0 , " + object.countNodes() + ")");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen_linkedList().setVisible(true);
            }
        });
    }

    private void initializeList(int start, int end) {
        if (start == end) {
            return;
        }
        object.createNode(start);
        System.out.println("Inserting into list - " + start);
        initializeList(start + 1, end);
    }

    public mainScreen_linkedList() {
        setLocationRelativeTo(null);
        initComponents();
        initializeList(0, 5);
        setDataToView();
        arrayModel.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SumLinkedList;
    private javax.swing.JLabel arrayDescription;
    private javax.swing.JTextArea arrayModel;
    private javax.swing.JTextField insertEditext;
    private javax.swing.JButton insertElement;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printLinkedList;
    // End of variables declaration//GEN-END:variables
}
