package sample;

import com.sun.net.httpserver.Authenticator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Main extends Application {
    private  Stage stage;


    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
//        stage=Date;
        showPaymentPage();
//        Parent root = FXMLLoader.load(getClass().getResource("date.fxml"));
//        primaryStage.setTitle("Payment");
//        primaryStage.setScene(new Scene(root, 800, 500));
//        primaryStage.show();
    }
//    public void showDatepage() throws Exception{
//        FXMLLoader loader=new FXMLLoader();
//        loader.setLocation(getClass().getResource("date.FXML"));
//        Parent root=loader.load();
//        Date.setMain
//    }
    public void  showPaymentPage() throws Exception{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("payment.fxml"));
        Parent root= loader.load();

       PaymentController controller=loader.getController();
       controller.setMain(this);



        stage.setTitle("payment");
        stage.setScene(new Scene(root,960,540));
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }


}

