package application;

import dataModel.DB;
import dataModel.ReadData;
import dataModel.WriteData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.DoubleStringConverter;
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
	private TableColumn<Transaction, Double> colGas;

	@FXML
	private TableColumn<Transaction, Double> colService;

	@FXML
	private TableColumn<Transaction, Double> colJohn;

	@FXML
	private TableColumn<Transaction, Double> colMedical;

	@FXML
	private TableColumn<Transaction, Double> colMisc;

	@FXML
	private TableColumn<Transaction, Double> colTotal;

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
		colDate.setCellValueFactory(new PropertyValueFactory<Transaction, String>("transDate"));
		colDate.setCellFactory(TextFieldTableCell.forTableColumn());
		colDate.setOnEditCommit(e -> colDate_OnEditCommit(e));

		colDiscription.setCellValueFactory(new PropertyValueFactory<Transaction, String>("discription"));
		colDiscription.setCellFactory(TextFieldTableCell.forTableColumn());
		colDiscription.setOnEditCommit(e -> colDiscription_OnEditCommit(e));

		colGas.setCellValueFactory(new PropertyValueFactory<Transaction, Double>("gas"));
		colGas.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		colGas.setOnEditCommit(e -> colGas_OnEditCommit(e));
		colGas.setStyle("-fx-alignment: CENTER-RIGHT");

		colService.setCellValueFactory(new PropertyValueFactory<Transaction, Double>("service"));
		colService.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		colService.setOnEditCommit(e -> colService_OnEditCommit(e));
		colService.setStyle("-fx-alignment: CENTER-RIGHT");

		colJohn.setCellValueFactory(new PropertyValueFactory<Transaction, Double>("john"));
		colJohn.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		colJohn.setOnEditCommit(e -> colJohn_OnEditCommit(e));
		colJohn.setStyle("-fx-alignment: CENTER-RIGHT");

		colMedical.setCellValueFactory(new PropertyValueFactory<Transaction, Double>("medical"));
		colMedical.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		colMedical.setOnEditCommit(e -> colMedical_OnEditCommit(e));
		colMedical.setStyle("-fx-alignment: CENTER-RIGHT");

		colMisc.setCellValueFactory(new PropertyValueFactory<Transaction, Double>("misc"));
		colMisc.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		colMisc.setOnEditCommit(e -> colMisc_OnEditCommit(e));
		colMisc.setStyle("-fx-alignment: CENTER-RIGHT");

		colTotal.setCellValueFactory(new PropertyValueFactory<Transaction, Double>("total"));
	}

	/************************************************/
	@SuppressWarnings("unchecked")
	public void colDate_OnEditCommit(Event e)
	{
		TableColumn.CellEditEvent<Transaction, String> cellEdit;
		cellEdit = (TableColumn.CellEditEvent<Transaction, String>) e;
		Transaction transaction = cellEdit.getRowValue();

		transaction.setTransDate(cellEdit.getNewValue());
		if (!WriteData.updateRecord(DB.COL_TRANSACTIONS_DATE, transaction))
		{
			transaction.setTransDate(cellEdit.getOldValue());
		}
		table.refresh();
	}

	/************************************************/
	@SuppressWarnings("unchecked")
	public void colDiscription_OnEditCommit(Event e)
	{
		TableColumn.CellEditEvent<Transaction, String> cellEdit;
		cellEdit = (TableColumn.CellEditEvent<Transaction, String>) e;
		Transaction transaction = cellEdit.getRowValue();

		transaction.setDiscription(cellEdit.getNewValue());
		if (!WriteData.updateRecord(DB.COL_TRANSACTIONS_DISCRIPTION, transaction))
		{
			transaction.setDiscription(cellEdit.getOldValue());
		}
		table.refresh();
	}

	/************************************************/
	@SuppressWarnings("unchecked")
	public void colGas_OnEditCommit(Event e)
	{
		TableColumn.CellEditEvent<Transaction, Double> cellEdit;
		cellEdit = (TableColumn.CellEditEvent<Transaction, Double>) e;
		Transaction transaction = cellEdit.getRowValue();

		transaction.setGas(cellEdit.getNewValue());
		if (!WriteData.updateRecord(DB.COL_TRANSACTIONS_GAS, transaction))
		{
			transaction.setGas(cellEdit.getOldValue());
		}
		table.refresh();
	}

	/************************************************/
	@SuppressWarnings("unchecked")
	public void colService_OnEditCommit(Event e)
	{
		TableColumn.CellEditEvent<Transaction, Double> cellEdit;
		cellEdit = (TableColumn.CellEditEvent<Transaction, Double>) e;
		Transaction transaction = cellEdit.getRowValue();

		transaction.setService(cellEdit.getNewValue());
		if (!WriteData.updateRecord(DB.COL_TRANSACTIONS_SERVICE, transaction))
		{
			transaction.setService(cellEdit.getOldValue());
		}
		table.refresh();
	}

	/************************************************/
	@SuppressWarnings("unchecked")
	public void colJohn_OnEditCommit(Event e)
	{
		TableColumn.CellEditEvent<Transaction, Double> cellEdit;
		cellEdit = (TableColumn.CellEditEvent<Transaction, Double>) e;
		Transaction transaction = cellEdit.getRowValue();

		transaction.setJohn(cellEdit.getNewValue());
		if (!WriteData.updateRecord(DB.COL_TRANSACTIONS_JOHN, transaction))
		{
			transaction.setJohn(cellEdit.getOldValue());
		}
		table.refresh();
	}

	/************************************************/
	@SuppressWarnings("unchecked")
	public void colMedical_OnEditCommit(Event e)
	{
		TableColumn.CellEditEvent<Transaction, Double> cellEdit;
		cellEdit = (TableColumn.CellEditEvent<Transaction, Double>) e;
		Transaction transaction = cellEdit.getRowValue();

		transaction.setMedical(cellEdit.getNewValue());
		if (!WriteData.updateRecord(DB.COL_TRANSACTIONS_MEDICAL, transaction))
		{
			transaction.setMedical(cellEdit.getOldValue());
		}
		table.refresh();
	}

	/************************************************/
	@SuppressWarnings("unchecked")
	public void colMisc_OnEditCommit(Event e)
	{
		TableColumn.CellEditEvent<Transaction, Double> cellEdit;
		cellEdit = (TableColumn.CellEditEvent<Transaction, Double>) e;
		Transaction transaction = cellEdit.getRowValue();

		transaction.setMisc(cellEdit.getNewValue());
		if (!WriteData.updateRecord(DB.COL_TRANSACTIONS_MISC, transaction))
		{
			transaction.setMisc(cellEdit.getOldValue());
		}
		table.refresh();
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
		return FXCollections.observableArrayList(ReadData.getTransactions(DB.ORDER_BY_ASC));
	}
}
