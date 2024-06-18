import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {

//      Step1: if your echo server is running on the computer echoserver.example.com
//      and it is listening on port number 7, first run the following command from the
//      computer echoserver.example.com if you want to use the EchoServer example as your echo server:
//      java EchoServer 7

        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);
        System.out.println("Server is running on port " + portNumber);

        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}