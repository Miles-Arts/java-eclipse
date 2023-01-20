module com.example.alura {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alura to javafx.fxml;
    exports com.example.alura;
}