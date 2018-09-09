package display_screen_Linked_List_Based;

import LinkedList.node;
import LinkedList.singlyLinkedList;

public class sumScreen_linkedList extends javax.swing.JFrame {

    singlyLinkedList object = new singlyLinkedList();
    node headRef = null;

    static boolean next_halfCheck = false;
    static boolean prev_halfCheck = false;

    int sum;
    int returnedValue;

    public sumScreen_linkedList() {
        initComponents();
    }

    public sumScreen_linkedList(node suspect) {
        setLocationRelativeTo(null);
        initComponents();

        callingLabel.setEditable(false);

        headRef = suspect;

        /// disabling the buttons 
        if (!next_halfCheck && headRef == object.getHead()) {
            prevCall.setVisible(false);
        }
        if (next_halfCheck && headRef == object.getHead()) {
            nextCall.setVisible(false);
        }/// disabling the buttons code block ends here

        /// checking if we have traverse the whole list once or not
        if (headRef == object.getLastNode()) {
            next_halfCheck = true;
        }

        /// setting the calling label
        if (next_halfCheck) {
            // if we have covered the whole list once
            // if we are on last node
            if (headRef == object.getLastNode()) {
                callingLabel.setText(headRef.getValue() + " is calling null");
            } // if it is not last node
            else {
                callingLabel.setText(headRef.getNext().getValue() + " is calling " + headRef.getValue());
            }
        } else {
            callingLabel.setText(headRef.getValue() + " is calling " + headRef.getNext().getValue());
        }

        /// setting the views here 
        if (next_halfCheck) {
            returnedValue = object.SumToSuspectNode(headRef);
            sum = returnedValue + headRef.getValue();
            currentElement.setText("Current Element = " + headRef.getValue() + "");
            returnedValueLabel.setText("Returned Element = " + returnedValue + "");
            sumLabel.setText("Sum : " + headRef.getValue() + " + " + returnedValue + " = " + sum + "");
        }
    System.out.println("Recursive call received ( sum method - Linked List Based )");
    }

    node previousNode(node head, node suspect) {
        if (suspect == null) {
            return null;
        }
        if (head.getNext() == suspect) {
            return head;
        }
        return previousNode(head.getNext(), suspect);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nextCall = new javax.swing.JButton();
        prevCall = new javax.swing.JButton();
        currentElement = new javax.swing.JLabel();
        returnedValueLabel = new javax.swing.JLabel();
        sumLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        callingLabel = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nextCall.setText("Next Recursion Call");
        nextCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCallActionPerformed(evt);
            }
        });

        prevCall.setText("Previous Recursion Call");
        prevCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevCallActionPerformed(evt);
            }
        });

        callingLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        callingLabel.setColumns(20);
        callingLabel.setRows(5);
        callingLabel.setBorder(null);
        jScrollPane2.setViewportView(callingLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prevCall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(nextCall))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentElement)
                            .addComponent(sumLabel)
                            .addComponent(returnedValueLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(currentElement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnedValueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumLabel)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextCall)
                    .addComponent(prevCall))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCallActionPerformed
        // TODO add your handling code here:  
        if (next_halfCheck) {
            sumScreen_linkedList o = new sumScreen_linkedList(previousNode(object.getHead(), headRef));
            o.setVisible(true);
        } else {
            sumScreen_linkedList o = new sumScreen_linkedList(headRef.getNext());
            o.setVisible(true);
        }

    }//GEN-LAST:event_nextCallActionPerformed

    private void prevCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevCallActionPerformed
        // TODO add your handling code here:
        if (headRef == object.getLastNode()) {
            next_halfCheck = false;
        }
        if (next_halfCheck) {
            sumScreen_linkedList o = new sumScreen_linkedList(headRef.getNext());
            o.setVisible(true);
        } else {
            sumScreen_linkedList o = new sumScreen_linkedList(previousNode(object.getHead(), headRef));
            o.setVisible(true);
        }
    }//GEN-LAST:event_prevCallActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumScreen_linkedList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea callingLabel;
    private javax.swing.JLabel currentElement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nextCall;
    private javax.swing.JButton prevCall;
    private javax.swing.JLabel returnedValueLabel;
    private javax.swing.JLabel sumLabel;
    // End of variables declaration//GEN-END:variables
}
