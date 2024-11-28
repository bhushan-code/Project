import java.net.*;
import java.io.*;

class Client
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client application is running...");

        
        //IP address of server in localhost space 
        
        Socket sobj = new Socket("localhost",2100);                                             //Request to server
        System.out.println("Connection establised with the client...");


        PrintStream ps = new PrintStream(sobj.getOutputStream());                               //oject creation

        BufferedReader Rcvobj = new BufferedReader(new InputStreamReader(sobj.getInputStream()));  //oject creation (to recive)
        BufferedReader Sendobj = new BufferedReader(new InputStreamReader(System.in));              //oject creation (to send)
        
        String sSend, sRcv;
        
        System.out.println("Chat messanger application started...");


        while(!(sSend = Sendobj.readLine()).equals("end"))       //equals() is object class method used to compare strings
        {
            ps.println(sSend);            //Send from here
            sRcv = Rcvobj.readLine();       //receiver

            System.out.println("Server says : "+sRcv);
            System.out.println("Enter the message for server : ");
        }
        System.out.println("Thank you for using Chat Application ...");
    }
}