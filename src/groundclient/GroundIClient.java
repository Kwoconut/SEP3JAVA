package groundclient;

import java.rmi.RemoteException;

public interface GroundIClient
{
	void changeGroundPlaneRoute(String registrationNo, int startNodeId, int endNodeId) throws RemoteException;
}
