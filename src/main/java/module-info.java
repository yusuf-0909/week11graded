module org.example.week11graded {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.graphics;
    opens org.example.week11graded2 to javafx.fxml;
    exports org.example.week11graded2;
}