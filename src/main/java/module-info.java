module com.example.projetgroupe3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetgroupe3 to javafx.fxml;
    exports com.example.projetgroupe3;
}