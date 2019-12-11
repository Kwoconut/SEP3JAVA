package airclientviewmodel;

import airclientmodel.AirNodeModel;
import groundclientmodel.GroundNodeModel;
import groundclientviewmodel.GroundNodeViewModel;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import model.NodeDTO;

public class AirNodeViewModel
{
   private DoubleProperty xProperty;
   private DoubleProperty yProperty;
   private IntegerProperty idProperty;
   private AirNodeModel model;

   public AirNodeViewModel(AirNodeModel model, NodeDTO node)
      {
         this.model = model;
         xProperty = new SimpleDoubleProperty(node.getPosition().getXCoordinate());
         yProperty = new SimpleDoubleProperty(node.getPosition().getYCoordinate());
         idProperty = new SimpleIntegerProperty(node.getNodeId());
      }

   public DoubleProperty getXProperty()
   {
      return xProperty;
   }

   public DoubleProperty getYProperty()
   {
      return yProperty;
   }

   public IntegerProperty getIDProperty()
   {
      return idProperty;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof GroundNodeViewModel))
      {
         return false;
      }
      GroundNodeViewModel other = (GroundNodeViewModel) obj;
      return other.getIDProperty().get() == idProperty.get()
            && other.getYProperty().get() == yProperty.get()
            && other.getXProperty().get() == xProperty.get();
   }

}