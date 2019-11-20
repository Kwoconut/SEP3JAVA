package model;

public class PlaneDTO
{
   private String callSign;
   private Position position;
   private PlaneState state;

   public PlaneDTO(String callSign, PlaneState state, Position position)
   {
      this.callSign = callSign;
      this.state = state;
      this.position = position;
   }

   public String getCallSign()
   {
      return callSign;
   }

   public PlaneState getState()
   {
      return state;
   }
   
   public Position getPosition()
   {
      return position;
   }


}