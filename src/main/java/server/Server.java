package server;

import client.Client;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private ServerSocket serverSocket;
    private List<Client> clients = new ArrayList<>();
    int port = 2133;

    public void Server(int port) {
        serverSocket = new ServerSocket(2133);
    }

    public void ClientHandler(Client client) {

    }

    public void listen(int port) {
        while (true) {
            Socket socket = serverSocket.accept();
            Client client = new Client(socket);
            new Thread(client).start();
            clients.add(client);
        }
    }
}
