package GuiKalender;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerCalender implements Initializable {

    @FXML
    private GridPane gridPaneTimetable;

    private double CELL_PERCENTAGE_WIDTH;
    private double numberOfDays = 6;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        generateGridPaneTimetable(gridPaneTimetable);
    }



    private void generateGridPaneTimetable(GridPane gridPane) {

        CELL_PERCENTAGE_WIDTH = 100 / numberOfDays;

        for (int i = 0; i < numberOfDays; i++) {
            ColumnConstraints col = new ColumnConstraints();
            col.setPercentWidth(CELL_PERCENTAGE_WIDTH);
            gridPane.getColumnConstraints().add(col);
        }

        for (int i = 0; i < numberOfDays; i++) {
            RowConstraints row = new RowConstraints();
            row.setPercentHeight(CELL_PERCENTAGE_WIDTH);
            gridPane.getRowConstraints().add(row);
        }

    }
}
