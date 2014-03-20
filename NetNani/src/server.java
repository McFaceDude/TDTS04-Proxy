/**
 * User: Gustaf
 * Description: TODO: A short description of the class/interface
 */

import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) {

        try{
            ServerSocket serverSocket = new ServerSocket(4444);
            Socket socket = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = bufferedReader.readLine();
            System.out.println("[Client]: " + message);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("Echo: " + message);

        }catch (Exception e){

            System.out.println("Error: " + e);
            System.exit(-1);
        }
    }
}
