module com.example.examenfinal_poo_jtituana {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examenfinal_poo_jtituana to javafx.fxml;
    exports com.example.examenfinal_poo_jtituana;
}