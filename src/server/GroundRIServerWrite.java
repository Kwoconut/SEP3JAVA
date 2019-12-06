package server;

import java.rmi.RemoteException;

import groundclient.GroundRIClient;

public interface GroundRIServerWrite extends GroundRIServerRead 
{
	void addGroundClient(GroundRIClient client) throws RemoteException;

	void changeGroundPlaneRoute(String callSign, int startNodeId, int endNodeId) throws RemoteException;
}