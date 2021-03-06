/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.view;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author allan
 */
public class PnlFuncionario extends JPanel {
    
    public PnlFuncionario() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

                entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("GERFARMAPU").createEntityManager();
                query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Funcionario f");
                list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query1.getResultList());
                masterScrollPane = new javax.swing.JScrollPane();
                masterTable = new javax.swing.JTable();
                cpfLabel = new javax.swing.JLabel();
                nomeLabel = new javax.swing.JLabel();
                enderecoLabel = new javax.swing.JLabel();
                bairroLabel = new javax.swing.JLabel();
                cidadeLabel = new javax.swing.JLabel();
                cepLabel = new javax.swing.JLabel();
                telefoneLabel = new javax.swing.JLabel();
                usuarioLabel = new javax.swing.JLabel();
                senhaLabel = new javax.swing.JLabel();
                cargoLabel = new javax.swing.JLabel();
                cpfField = new javax.swing.JTextField();
                nomeField = new javax.swing.JTextField();
                enderecoField = new javax.swing.JTextField();
                bairroField = new javax.swing.JTextField();
                cidadeField = new javax.swing.JTextField();
                cepField = new javax.swing.JTextField();
                telefoneField = new javax.swing.JTextField();
                usuarioField = new javax.swing.JTextField();
                senhaField = new javax.swing.JTextField();
                saveButton = new javax.swing.JButton();
                refreshButton = new javax.swing.JButton();
                newButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                jComboBox1 = new javax.swing.JComboBox();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();

                FormListener formListener = new FormListener();

                org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
                org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
                columnBinding.setColumnName("Cpf");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
                columnBinding.setColumnName("Nome");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${endereco}"));
                columnBinding.setColumnName("Endereco");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairro}"));
                columnBinding.setColumnName("Bairro");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
                columnBinding.setColumnName("Cidade");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cep}"));
                columnBinding.setColumnName("Cep");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
                columnBinding.setColumnName("Telefone");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cargo}"));
                columnBinding.setColumnName("Cargo");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuario}"));
                columnBinding.setColumnName("Usuario");
                columnBinding.setColumnClass(String.class);
                bindingGroup.addBinding(jTableBinding);
                jTableBinding.bind();
                masterScrollPane.setViewportView(masterTable);

                cpfLabel.setText("Cpf:");

                nomeLabel.setText("Nome:");

                enderecoLabel.setText("Endereco:");

                bairroLabel.setText("Bairro:");

                cidadeLabel.setText("Cidade:");

                cepLabel.setText("Cep:");

                telefoneLabel.setText("Telefone:");

                usuarioLabel.setText("Usuario:");

                senhaLabel.setText("Senha:");

                cargoLabel.setText("Cargo:");

                org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cpf}"), cpfField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cpfField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.endereco}"), enderecoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), enderecoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bairro}"), bairroField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), bairroField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidade}"), cidadeField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cidadeField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cep}"), cepField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cepField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefone}"), telefoneField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), telefoneField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.usuario}"), usuarioField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), usuarioField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.senha}"), senhaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("null");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), senhaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/salvar_32x32.png"))); // NOI18N
                saveButton.setText("Save");
                saveButton.addActionListener(formListener);

                refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/atualizar_32x32.png"))); // NOI18N
                refreshButton.setText("Refresh");
                refreshButton.addActionListener(formListener);

                newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/novo_32x32.png"))); // NOI18N
                newButton.setText("New");
                newButton.addActionListener(formListener);

                deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/apagar_32x32.png"))); // NOI18N
                deleteButton.setText("Delete");

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                deleteButton.addActionListener(formListener);

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "caixa", "balconista", "farmacêutico", "gerente" }));

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cargo}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                jLabel1.setText("Pesquisa:");

                jTextField1.addKeyListener(formListener);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(newButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deleteButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(refreshButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(saveButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cpfLabel)
                                                                        .addComponent(nomeLabel)
                                                                        .addComponent(enderecoLabel)
                                                                        .addComponent(bairroLabel)
                                                                        .addComponent(cidadeLabel)
                                                                        .addComponent(cepLabel)
                                                                        .addComponent(telefoneLabel)
                                                                        .addComponent(usuarioLabel)
                                                                        .addComponent(senhaLabel)
                                                                        .addComponent(cargoLabel))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cpfField)
                                                                        .addComponent(nomeField)
                                                                        .addComponent(enderecoField)
                                                                        .addComponent(bairroField)
                                                                        .addComponent(cidadeField)
                                                                        .addComponent(cepField)
                                                                        .addComponent(telefoneField)
                                                                        .addComponent(usuarioField)
                                                                        .addComponent(senhaField)
                                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField1)))))
                                .addContainerGap())
                );

                layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, newButton, refreshButton, saveButton});

                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cpfLabel)
                                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nomeLabel)
                                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(enderecoLabel)
                                        .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bairroLabel)
                                        .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cidadeLabel)
                                        .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cepLabel)
                                        .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(telefoneLabel)
                                        .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usuarioLabel)
                                        .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(senhaLabel)
                                        .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cargoLabel)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton)
                                        .addComponent(refreshButton)
                                        .addComponent(deleteButton)
                                        .addComponent(newButton))
                                .addContainerGap())
                );

                bindingGroup.bind();
        }

        // Code for dispatching events from components to event handlers.

        private class FormListener implements java.awt.event.ActionListener, java.awt.event.KeyListener {
                FormListener() {}
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if (evt.getSource() == saveButton) {
                                PnlFuncionario.this.saveButtonActionPerformed(evt);
                        }
                        else if (evt.getSource() == refreshButton) {
                                PnlFuncionario.this.refreshButtonActionPerformed(evt);
                        }
                        else if (evt.getSource() == newButton) {
                                PnlFuncionario.this.newButtonActionPerformed(evt);
                        }
                        else if (evt.getSource() == deleteButton) {
                                PnlFuncionario.this.deleteButtonActionPerformed(evt);
                        }
                }

                public void keyPressed(java.awt.event.KeyEvent evt) {
                        if (evt.getSource() == jTextField1) {
                                PnlFuncionario.this.jTextField1KeyPressed(evt);
                        }
                }

                public void keyReleased(java.awt.event.KeyEvent evt) {
                }

                public void keyTyped(java.awt.event.KeyEvent evt) {
                }
        }// </editor-fold>//GEN-END:initComponents

    

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query1.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<br.com.alf.gerfarma.model.entity.Funcionario> toRemove = new ArrayList<br.com.alf.gerfarma.model.entity.Funcionario>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            br.com.alf.gerfarma.model.entity.Funcionario f = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(f);
            entityManager.remove(f);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        br.com.alf.gerfarma.model.entity.Funcionario f = new br.com.alf.gerfarma.model.entity.Funcionario();
        entityManager.persist(f);
        list.add(f);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<br.com.alf.gerfarma.model.entity.Funcionario> merged = new ArrayList<br.com.alf.gerfarma.model.entity.Funcionario>(list.size());
            for (br.com.alf.gerfarma.model.entity.Funcionario f : list) {
                merged.add(entityManager.merge(f));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

        private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
                // TODO add your handling code here:
                  String query = "select p from Pessoa p where p.nome like :nome";
             query1 =entityManager.createQuery(query);
             query1.setParameter("nome","%"+ jTextField1.getText()+"%");
            list.clear();
            list.addAll(query1.getResultList());
        }//GEN-LAST:event_jTextField1KeyPressed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField bairroField;
        private javax.swing.JLabel bairroLabel;
        private javax.swing.JLabel cargoLabel;
        private javax.swing.JTextField cepField;
        private javax.swing.JLabel cepLabel;
        private javax.swing.JTextField cidadeField;
        private javax.swing.JLabel cidadeLabel;
        private javax.swing.JTextField cpfField;
        private javax.swing.JLabel cpfLabel;
        private javax.swing.JButton deleteButton;
        private javax.swing.JTextField enderecoField;
        private javax.swing.JLabel enderecoLabel;
        private javax.persistence.EntityManager entityManager;
        private javax.swing.JComboBox jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JTextField jTextField1;
        private java.util.List<br.com.alf.gerfarma.model.entity.Funcionario> list;
        private javax.swing.JScrollPane masterScrollPane;
        private javax.swing.JTable masterTable;
        private javax.swing.JButton newButton;
        private javax.swing.JTextField nomeField;
        private javax.swing.JLabel nomeLabel;
        private javax.persistence.Query query1;
        private javax.swing.JButton refreshButton;
        private javax.swing.JButton saveButton;
        private javax.swing.JTextField senhaField;
        private javax.swing.JLabel senhaLabel;
        private javax.swing.JTextField telefoneField;
        private javax.swing.JLabel telefoneLabel;
        private javax.swing.JTextField usuarioField;
        private javax.swing.JLabel usuarioLabel;
        private org.jdesktop.beansbinding.BindingGroup bindingGroup;
        // End of variables declaration//GEN-END:variables

    //Motra tela de cadastro de medicamento
    public void mostrar(JFrame f) {
        JDialog tela = new JDialog(f,true);
        tela.setContentPane(new PnlFuncionario());
        tela.setTitle("GerFarma - Cadastro de Funcionários");
        tela.setIconImage(new ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/logo_32x29.png")).getImage());
        tela.pack();
        tela.setVisible(true);
    }
    
    public static void main(String[] args) {
        new PnlFuncionario().mostrar(new JFrame());
    }
}
