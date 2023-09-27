package com.dl.two;

class SeatsAvailable {
	int seats = 3;
	
	public synchronized void bookMovieTickets(String uname,int totalSeats) throws InterruptedException {
		if(seats>=totalSeats && totalSeats>0) {
			System.out.println("Hello" + " " + uname + " " + "you have Booked" + " " + totalSeats + " " + "Tickets");
			seats = seats - totalSeats;
			System.out.println("Tickets left :" + seats);
			Thread.sleep(3000);
		}else {
			System.out.println("Hello" + " " + uname + " " + "seats not avaialble");
		}
	}
}

class Tickets extends Thread {
	SeatsAvailable seatsAvailable;
	String userName;
	int noOfSeats;	
	
	public Tickets(SeatsAvailable seatsAvailable, String userName,int noOfSeats) {
		this.seatsAvailable=seatsAvailable;
		this.userName=userName;
		this.noOfSeats=noOfSeats;
	}
	
	@Override
	public void run() {
		try {
			seatsAvailable.bookMovieTickets(userName,noOfSeats);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class Client {

	public static void main(String[] args) {
		
		SeatsAvailable available = new SeatsAvailable();
		Tickets t1 = new Tickets(available,"srinivasu",2);
		Tickets t2 = new Tickets(available,"srinu",2);
		
		t1.start();
		t2.start();

	}

}

