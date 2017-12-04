package com.messenger.net;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Net 
{
    private DatagramSocket socket;
    private InetAddress ip;
    
    public Net()
    {
    }
    
    public boolean openConnection(String address)
    {
        try 
        {
            socket = new DatagramSocket();
            ip = InetAddress.getByName(address);
        } 
        catch (SocketException e)
        {
            e.printStackTrace();
            return false;
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    //отправка сообщений
    public void send()
    {
    }
    
    //принятие сообщений
    public void receive()
    {
    }
}