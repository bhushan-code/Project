Hi,
This is Chat messsnger using java's ServerSocket and Socket classes.

Detail of Project :

Project Name : SocketChat (Networking)
Use	         : Communicate by using networkin(ServerSocket and Socket)
Date 	     : 25/11/2021
Author	     : Bhushan Ramdas Nagpure

Overview :


1- Server Setup:
    ServerSocket ssobj = new ServerSocket(2100);
    This line initializes a server socket that listens for incoming client connections on port 2100.

-Accepting Client Connection:
    Socket sobj = ssobj.accept();
    The accept() method blocks the server until a client connects. Once connected, it creates a Socket object for communication.

-I/O Streams:
    PrintStream ps: For sending messages to the client.
    BufferedReader Rcvobj: For reading messages from the client.
    BufferedReader Sendobj: For reading user input from the server console.

-Chat Loop:
    The while loop continues until the client disconnects. It:
    Reads a message from the client (Rcvobj.readLine()).
    Prints the client's message to the server console.
    Prompts the server user to enter a response (Sendobj.readLine()).
    Sends the response to the client (ps.println(sSend)).

-Termination:
    When the client disconnects (indicated by Rcvobj.readLine() returning null), the loop breaks, and the program exits with a thank-you message.



2- Client Setup:
    Socket sobj = new Socket("localhost", 2100);
    This line initializes a socket connection to the server.
    localhost: Indicates that the server is running on the same machine as the client. Replace "localhost" with the server's IP address to connect to a remote server.
    2100: The port number on which the server is listening.

-Stream Creation:
    -Sending Messages:
     PrintStream ps = new PrintStream(sobj.getOutputStream());
     This stream is used to send messages to the server.
    -Receiving Messages:
     BufferedReader Rcvobj = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
     This stream is used to receive messages from the server.

-User Input:
    BufferedReader Sendobj = new BufferedReader(new InputStreamReader(System.in));
    This stream reads user input from the console.

-Chat Loop:
    Send Message: ps.println(sSend);
    Sends the user's input to the server.
    Receive Message: sRcv = Rcvobj.readLine();
    Reads the server's response.
    The loop continues until the user types "end", which terminates the chat.

-Termination:
    The loop exits when Sendobj.readLine() reads "end".
    A thank-you message is displayed, and the program ends.

