/**
 * User: Gustaf
 * Description: TODO: A short description of the class/interface
 */

import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] args) {

        if(args.length == 1){

            try{
                Socket socket = new Socket("localhost", 4444);

                PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
                printWriter.println(args[0]);

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("[Server]: " + bufferedReader.readLine());

            }catch (Exception e){

                System.out.println("Error: " + e);
                System.exit(1);
            }
        }
        else{

            System.err.println("Usage: Client <server> <name>");
        }
    }
}
