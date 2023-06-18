package src.uni.fat.q2;

class InsufficientSeatsException extends Exception {
    InsufficientSeatsException(String msg) {
        super(msg);
    }
}

class Theatre {
    int avaiableSeats;

    Theatre(int avaiableSeats) {
        this.avaiableSeats = avaiableSeats;
    }

    synchronized void bookSeats(int seats) throws InsufficientSeatsException {
        if (seats > avaiableSeats)
            throw new InsufficientSeatsException("only " + avaiableSeats + " seats available");

        avaiableSeats -= seats;
        System.out.println("booked " + seats + ", remaining " + avaiableSeats);
    }

    synchronized void addSeats(int seats) {
        avaiableSeats += seats;
        System.out.println(seats + " added, updated capcity: " + avaiableSeats);
    }
}

class BookingCounter implements Runnable {
    Thread thread;
    Theatre theatre;
    int seats;

    public BookingCounter(Theatre theatre, int seats) {
        this.theatre = theatre;
        thread = new Thread(this, "movie tiket booking");
        this.seats = seats;
    }

    public void run() {
        try {
            theatre.bookSeats(seats);
        } catch (InsufficientSeatsException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Theatre theatre = new Theatre(10);

        BookingCounter counter1 = new BookingCounter(theatre, 5);
        BookingCounter counter2 = new BookingCounter(theatre, 6);
        BookingCounter counter3 = new BookingCounter(theatre, 2);

        counter1.thread.start();
        counter2.thread.start();
        counter3.thread.start();

        theatre.addSeats(5);

        BookingCounter counter4 = new BookingCounter(theatre, 3);
        counter4.thread.start();
    }
}