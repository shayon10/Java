package sample;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


public class PaymentController implements Initializable  {

    private Main main;


    @FXML
    private TextField transcode;
    @FXML
    private TextField paymentNumber;
    @FXML
    private Button makePayment;
    @FXML
    private ComboBox comboBox;

    @FXML
    private Label payPage;

    void setMain(Main main) {
        this.main = main;

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.getItems().add("Bkash");
        comboBox.getItems().add("Rocket");
        comboBox.getItems().add("M Cash");
        comboBox.getItems().add("MY Cash");
        comboBox.getItems().add("T-Cash");
        comboBox.getItems().add("Upay");
        comboBox.getItems().add("I-pay");
        comboBox.getItems().add("Sure cash");
        comboBox.getItems().add("Nagad");


    }
    public static void showAlert(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("payment");
        alert.setHeaderText("payment Complete");
        alert.showAndWait();
    }
    public void paymentAction(ActionEvent event) {



        if (paymentNumber.getLength()==11 && (transcode.getLength()==10)
        ){

            payPage.setText("Payment Successful to RSS hotel management company");
        }
        else {
            payPage.setText("Payment Unsuccessful");
        }

    }




}




