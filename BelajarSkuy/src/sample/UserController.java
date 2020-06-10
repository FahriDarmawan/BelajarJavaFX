package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UserController {
    @FXML
    private TextField namaField;

    @FXML
    private TextField usiaField;

    @FXML
    private TextArea hasilField;

    @FXML
    private Button showDataButton;

    @FXML
    private Button nextPageButton;

    User user1 = new User("",0);

    @FXML
    public void showDataButtonOnAction(ActionEvent event){
        if (namaField.getText().isEmpty()||usiaField.getText().isEmpty()) {
            hasilField.setText("yaa diisi dulu dong");
        }
        else {
            user1.setNama(namaField.getText());
            user1.setUsia(Integer.parseInt(usiaField.getText()));
            hasilField.setText("Biodata anda \n" + "Nama : " + user1.getNama() + "\n" + "Usia : " + user1.getUsia());
        }
    }

    @FXML
    public void nextPageButtonOnAction(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("secPage.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }
}
