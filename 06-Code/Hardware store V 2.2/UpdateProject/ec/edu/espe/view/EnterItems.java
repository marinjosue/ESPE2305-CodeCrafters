package ec.edu.espe.view;

import javax.swing.*;
import com.mongodb.client.*;
import org.bson.*;
import ec.edu.espe.model.*;
import javax.swing.table.*;
import java.awt.*;

public class EnterItems extends JFrame {

	FondoPanel fondo = new FondoPanel();
	private static final String CONNECTION_STRING = "mongodb+srv://josuemarin:josuemarin@cluster0.lntjz9j.mongodb.net/";
	private static MongoClient mongoClient;
	private static MongoDatabase database;
	private static MongoCollection<Document> collection;
	Product product;
	DefaultTableModel tableModel;
	private int selectedRow;

	/**
	 * Creates new form EnterItems
	 */
	public EnterItems() {
		// TODO - implement EnterItems.EnterItems
		throw new UnsupportedOperationException();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

	}

	/**
	 * </editor-fold>//GEN-END:initComponents
	 * @param evt
	 */
	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO - implement EnterItems.btnExitActionPerformed
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_btnExitActionPerformed
	 * @param evt
	 */
	private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO - implement EnterItems.btnAcceptActionPerformed
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_btnAcceptActionPerformed
	 * @param evt
	 */
	private void btnAcceptMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO - implement EnterItems.btnAcceptMouseClicked
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_btnAcceptMouseClicked
	 * @param evt
	 */
	private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO - implement EnterItems.btnNewActionPerformed
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_btnNewActionPerformed
	 * @param evt
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO - implement EnterItems.jButton1ActionPerformed
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_jButton1ActionPerformed
	 * @param evt
	 */
	private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO - implement EnterItems.btnEditActionPerformed
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_btnEditActionPerformed
	 * @param evt
	 */
	private void btnErrarseActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO - implement EnterItems.btnErrarseActionPerformed
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_btnErrarseActionPerformed
	 * @param evt
	 */
	private void btnErrarseMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO - implement EnterItems.btnErrarseMouseClicked
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_btnErrarseMouseClicked
	 * @param evt
	 */
	private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO - implement EnterItems.txtStockActionPerformed
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_txtStockActionPerformed
	 * @param evt
	 */
	private void TableMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO - implement EnterItems.TableMouseClicked
		throw new UnsupportedOperationException();
	}

	/**
	 * GEN-LAST:event_TableMouseClicked
	 */
	private StringBuilder appendItems() {
		// TODO - implement EnterItems.appendItems
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	private boolean checkIdExists(int id) {
		// TODO - implement EnterItems.checkIdExists
		throw new UnsupportedOperationException();
	}

	private void readData() throws NumberFormatException {
		// TODO - implement EnterItems.readData
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param product
	 */
	private void addToTable(Product product) {
		// TODO - implement EnterItems.addToTable
		throw new UnsupportedOperationException();
	}

	private void deleteSelectedItem() {
		// TODO - implement EnterItems.deleteSelectedItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO - implement EnterItems.main
		throw new UnsupportedOperationException();
	}


	class FondoPanel extends JPanel {

		private Image imagen;

		/**
		 * 
		 * @param g
		 */
		@Override()
		public void paint(Graphics g) {
			// TODO - implement FondoPanel.paint
			throw new UnsupportedOperationException();
		}

	}

}