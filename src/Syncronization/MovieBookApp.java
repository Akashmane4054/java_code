package Syncronization;

class BookTheaterSeat {
	int total_seats = 10;

	void bookSeat(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + "seats Booked successfully");
			total_seats = total_seats - seats;
			System.out.println("Seats Left :" + total_seats);
		} else {
			System.out.println("Sorry seats cannot be booked...!!");
			System.out.println("Seats Left : " + total_seats);
		}
	}
}

public class MovieBookApp extends Thread {
	static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);

	}

	public static void main(String[] args) {
		b = new BookTheaterSeat();
		MovieBookApp dipak = new MovieBookApp();
		dipak.seats = 7;
		dipak.start();

		MovieBookApp akash = new MovieBookApp();
		akash.seats = 6;
		akash.start();
	}
}
