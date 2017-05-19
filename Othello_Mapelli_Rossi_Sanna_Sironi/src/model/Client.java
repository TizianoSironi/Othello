package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        String indIP = "";
        int Numero;
        String idClient;
        System.out.println("Client startato. Attendo al connessione di un altro giocatore.");
        Scanner sc = new Scanner(System.in);
       
            System.out.println("Inserisci l'indririzzo IP del server: ");
            indIP = sc.next();
            Socket server = new Socket(indIP, 9999);
            BufferedReader serverInput; 
            PrintStream serverOutput;
            try {
                serverInput = new BufferedReader (new InputStreamReader(server.getInputStream()));
                serverOutput = new PrintStream(server.getOutputStream());
                String messaggioServer =serverInput.readLine();
                if (messaggioServer.startsWith("start: ")){
                    idClient=messaggioServer.substring(messaggioServer.length()-3, messaggioServer.length()-2);
                    System.out.println(idClient);
                }
        } catch (Exception e) {
            System.err.println(e);
        }
    }   
}
