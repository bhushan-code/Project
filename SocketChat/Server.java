import java.net.*;
import java.io.*;

class Server
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting for client at port number 2100");

        Socket sobj = ssobj.accept();                                   //Accept the request from the client
        System.out.println("Connection establised with the client...");
    

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader Rcvobj = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader Sendobj = new BufferedReader(new InputStreamReader(System.in));
        
        String sRcv, sSend;
        
        System.out.println("Chat messanger application started...");


        while((sRcv = Rcvobj.readLine()) != null)
        {
            System.out.println("Client says : "+sRcv);
            System.out.println("Enter the message for client : ");

            sSend = Sendobj.readLine();      
            ps.println(sSend);           //Send from here
        }
        System.out.println("Thank you for using Chat Application ...");
    }
}