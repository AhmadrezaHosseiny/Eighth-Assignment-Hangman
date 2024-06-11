module hangman {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;
    requires org.json;
    requires org.postgresql.jdbc;

    opens hangman to javafx.fxml;
    exports hangman;
}