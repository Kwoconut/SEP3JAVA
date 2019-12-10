package airclientview;

import java.io.IOException;

import airclientviewmodel.MainViewViewModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView
{
   private Stage stage;
   private MainViewViewModel mvViewModel;

   public MainView(Stage stage, MainViewViewModel mvViewModel)
   {
      this.stage = stage;
      this.mvViewModel = mvViewModel;
   }

   public void start() throws Exception
   {
      openView("AirRadar");
   }

   public void openView(String viewToOpen) throws IOException
   {
      Scene scene = null;
      FXMLLoader loader = new FXMLLoader();
      Parent root = null;

      if ("AirRadar".equals(viewToOpen))
      {
         loader.setLocation(getClass().getResource("AirRadarView.fxml"));
         root = loader.load();
         AirRadarView view = loader.getController();
         view.init(mvViewModel.getAirRadarViewModel(),this);
      }
      stage.setTitle("AirRadar");
      
      Stage localStage = new Stage();

      scene = new Scene(root);
      localStage.setScene(scene);
      localStage.show();
   }


}
