package groundclientmodel;

import java.beans.PropertyChangeListener;

public interface GroundRadarStartModel
{
   void establishConnection();
   
   void addPropertyChangeListener(PropertyChangeListener listener);

}
