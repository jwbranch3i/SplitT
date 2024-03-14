package application;

import dataModel.DataGet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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

		public void initialize()
		{
			colDate.setCellValueFactory(new PropertyValueFactory<Transaction, String>("transactionDate"));

			colDiscription.setCellValueFactory(new PropertyValueFactory<Transaction, String>("discription"));

			colGas.setCellValueFactory(new PropertyValueFactory<Transaction, String>("gas"));
			colGas.setStyle("-fx-alignment: CENTER-RIGHT");

			colService.setCellValueFactory(new PropertyValueFactory<Transaction, String>("service"));
			colService.setStyle("-fx-alignment: CENTER-RIGHT");

			colJohn.setCellValueFactory(new PropertyValueFactory<Transaction, String>("john"));
			colJohn.setStyle("-fx-alignment: CENTER-RIGHT");

			colMedical.setCellValueFactory(new PropertyValueFactory<Transaction, String>("med"));
			colMedical.setStyle("-fx-alignment: CENTER-RIGHT");

			colMisc.setCellValueFactory(new PropertyValueFactory<Transaction, String>("misc"));
			colMisc.setStyle("-fx-alignment: CENTER-RIGHT");

		}

		/******************************************/
		public void getTransactions()
		{
			@SuppressWarnings("unchecked")
			Task<ObservableList<Transaction>> task = new GetAllTransactions();
			table.itemsProperty().bind(task.valueProperty());

			new Thread(task).start();
		}
}

/******************************************/
@SuppressWarnings("rawtypes")
class GetAllTransactions extends Task
{
	public ObservableList<Transaction> call()
	{
	//	return FXCollections.observableArrayList(DataSource.getInstance().queryTransactions(AcctData.ORDER_BY_ASC));
		ObservableList<Transaction> list = FXCollections.observableArrayList(DataGet.getTransactions(DataGet.ORDER_BY_ASC));
	//	return FXCollections.observableArrayList(DataGet.getTransactions(DataGet.ORDER_BY_ASC));
		for (int i=0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		return list;	

	}
}









