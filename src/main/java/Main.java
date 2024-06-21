//Plik stworzony jedynie na potrzeby mojej wygody

import client.Client;
import server.Server;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("[S = Server | C = Client | D = Database Creator]? ");
        System.out.print("[S/C/D]? ");
        switch (new Scanner(System.in).nextLine().toLowerCase().charAt(0)) {
            case 's':
                System.out.println("Podaj port");
            {int port = new Scanner(System.in).nextInt();
                Server server = new Server(port);
                server.listen();}
            break;
            case 'c': Client client = new Client();
                System.out.println("Podaj nazwe hosta");
                String username = new Scanner(System.in).nextLine().toLowerCase();
                System.out.println("Podaj ścieżkę pliku");
                String filePath = new Scanner(System.in).nextLine();
                client.connectToServer(new Scanner(System.in).nextLine().toLowerCase(), port);
                client.send("input.png");
                client.receive("output.png");
                break;
            case 'd':
                //TODO
                break;
}
