module com.jonah3d.tasks {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome; // FontAwesomeFX for icon support
    requires org.controlsfx.controls;       // ControlsFX library
    requires java.sql;                      // SQLite requires java.sql package
    requires org.xerial.sqlitejdbc;         // SQLite JDBC driver

    // Opens the FXML package for reflection so that FXMLLoader can access the controller
    opens com.jonah3d.tasks to javafx.fxml;
    opens com.jonah3d.tasks.Controllers to javafx.fxml;

    // Exporting packages so other modules can access them
    exports com.jonah3d.tasks;
    exports com.jonah3d.tasks.Controllers;
}
