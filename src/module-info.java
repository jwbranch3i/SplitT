module splitT {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.base;
	requires javafx.graphics;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml, javafx.stage;
	opens transactionObjects to javafx.base;
}
