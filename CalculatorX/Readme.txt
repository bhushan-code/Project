Hi,
This is simple GUI-based calculator application using AWT(abstract window toolkit)library.

Detail of Project :

Project Name : CalculatorX (GUI based)
Use	     : Calculate given 2 number.
Date 	     : 28/11/2021
Author	     : Bhushan Ramdas Nagpure

Overview :

- Main Entry Point: The CalculatorX class contains the main method, which creates an object of the Calculator class, initializing the GUI application.
   
- Calculator Class: This class extends WindowAdapter and implements ActionListener:
		    WindowAdapter is used to handle window events, such as closing the application.
	            ActionListener is used to respond to button clicks.

- Components	  : Frame (mainframe): Serves as the main window of the application.
		    Buttons (b1, b2, b3, b4): Represent four operations: addition, subtraction, multiplication, and division.
  		    TextFields (t1, t2): For user input of two numbers.
		    Label (lobj): Displays the result of the operation.

- Event Handling  : actionPerformed(ActionEvent aobj): Handles button clicks and performs the corresponding arithmetic operation. The result is displayed on the label.

- Window Closing  : windowClosing(WindowEvent wobj): Overrides the method from WindowAdapter to close the application when the frame's close button is clicked.