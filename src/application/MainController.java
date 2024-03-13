package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import transactionObjects.Transaction;

public class MainController
{
		@FXML
		private TableView<Transaction> table;

		@FXML
		private TableColumn<Transaction, String> colDate;

		@FXML
		private TableColumn<Transaction, String> colDiscription;

		@FXML
		private TableColumn<Transaction, String> colGas;

		@FXML
		private TableColumn<Transaction, String> colService;

		@FXML
		private TableColumn<Transaction, String> colJohn;

		@FXML
		private TableColumn<Transaction, String> colMedical;

		@FXML
		private TableColumn<Transaction, String> colMisc;

		@FXML
		private TextField totalGas;

		@FXML
		private TextField totalService;

		@FXML
		private TextField totalJohn;

		@FXML
		private TextField totalMedical;

		@FXML
		private TextField totalMisc;

		@FXML
		private Label totalAcct;

}
