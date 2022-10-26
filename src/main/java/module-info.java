module com.example.examenpractico {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examenpractico to javafx.fxml;
    exports com.example.examenpractico;
}