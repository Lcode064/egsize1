module com.mycompany.jkrol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.jkrol to javafx.fxml;
    exports com.mycompany.jkrol;
}
