package display_screen_Linked_List_Based;

import LinkedList.node;
import LinkedList.singlyLinkedList;

public class printListElement extends javax.swing.JFrame {

    node headReference = null;
    singlyLinkedList object = new singlyLinkedList();

    public printListElement() {
        initComponents();
    }

    public printListElement(node n) {
        setLocationRelativeTo(null);
        initComponents();
        headReference = n;
        if (headReference != null) {
            elementLable.setText(n.getValue() + "");
        }
        if(headReference.getNext() == null){
            nextValueButton.setVisible(false);
        }
        if(headReference == object.getHead()){
            previousValueButton.setVisible(false);
        }
    System.out.println("Recursive call received ( print method - Linked List Based )");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elementLable = new javax.swing.JLabel();
        nextValueButton = new javax.swing.JButton();
        previousValueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        elementLable.setText("jLabel1");

        nextValueButton.setText("Next Recursive Call");
        nextValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextValueButtonActionPerformed(evt);
            }
        });

        previousValueButton.setText("Previous Recursive call");
        previousValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousValueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(elementLable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(previousValueButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(nextValueButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(elementLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextValueButton)
                    .addComponent(previousValueButton))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextValueButtonActionPerformed
        // TODO add your handling code here:
        printListElement o = new printListElement(headReference.getNext());
        o.setVisible(true);
    }//GEN-LAST:event_nextValueButtonActionPerformed

    private void previousValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousValueButtonActionPerformed
        // TODO add your handling code here
        node previousNode = helpingMethod(object.getHead() , headReference);
        printListElement o = new printListElement(previousNode);
        o.setVisible(true);
    }//GEN-LAST:event_previousValueButtonActionPerformed

    
    
    node helpingMethod(node head,node suspect){
        if(head.getNext() == suspect){
          return head;  
        }
      return helpingMethod(head.getNext(),suspect);  
    }
    
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printListElement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementLable;
    private javax.swing.JButton nextValueButton;
    private javax.swing.JButton previousValueButton;
    // End of variables declaration//GEN-END:variables
}
