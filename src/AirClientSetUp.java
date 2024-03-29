import airclient.AirClient;
import airclient.AirRIClient;
import airclientmodel.ATCAirSimulator;
import airclientmodel.ATCAirSimulatorModel;
import airclientview.MainView;
import airclientviewmodel.MainViewViewModel;
import javafx.application.Application;
import javafx.stage.Stage;

public class AirClientSetUp extends Application
{
	@Override
	   public void start(Stage stage) throws Exception
	   {
	      ATCAirSimulator model = new ATCAirSimulatorModel();
	      MainViewViewModel mvvm = new MainViewViewModel(model);
	      AirRIClient client = new AirClient(model);
	      MainView mv = new MainView(stage, mvvm);
	      mv.start();
	   }
}
