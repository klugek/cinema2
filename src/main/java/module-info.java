module com.example.cinema2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.cinema2 to javafx.fxml;
    exports com.example.cinema2;
}