module prakJFX {
	requires transitive javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.fxml;
	
	exports application;
	
	// Izinkan JavaFX membaca Controller
    opens controller to javafx.fxml;

    // Izinkan Tabel membaca data Mahasiswa di Model
    opens model to javafx.base;
}
