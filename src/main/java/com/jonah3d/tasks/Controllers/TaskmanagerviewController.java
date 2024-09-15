package com.jonah3d.tasks.Controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class TaskmanagerviewController implements Initializable {


    public Text Task_Text;
    public Button delete_btn;
    public Button AddTask_btn;
    public Text taskname_text;
    public Text deadline_text;
    public Text status_text;
    public ListView tasksview_listview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
