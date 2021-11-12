/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Network;

import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public class NetworkDirectory {
    
    private ArrayList<Network> networkDirectory;

    public void setNetworkDirectory(ArrayList<Network> networkDirectory) {
        this.networkDirectory = networkDirectory;
    }
    
    public NetworkDirectory() {
       networkDirectory = new ArrayList<>();
    }
    
    public ArrayList<Network> getNetworkList()
    {
        return networkDirectory;
    }
    
    public Network createNetwork(String name)
    {
        Network network = new Network();
        network.setName(name);
        networkDirectory.add(network);
        return network;
    }
    
}
