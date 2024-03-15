module splitT {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.base;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
	opens transactionObjects to javafx.base;
}
