package src;

public class PaymentService extends BookTickets {
    private int ticketPrice=200;
    private int totalTicketPrice;
    private int balance;
    boolean bookingTicket;

    public PaymentService(String validUserName, String validPassword, int noOfSeats,int balance) {
        super(validUserName, validPassword, noOfSeats);
        this.balance=balance;
    }

    public boolean payment() throws InsufficientbalanceException {


            totalTicketPrice = noOfSeats * ticketPrice;
        if(noOfSeats<=totalNoOfSeats) {
            if (totalTicketPrice <= balance) {
                System.out.println("Payment Is Successfull");
                int remaningBalance = balance - totalTicketPrice;
                System.out.println("Remanining Balance After Payment: " + remaningBalance);

            } else {
                throw new InsufficientbalanceException(ErrorCodes.Insufficient_Balance.getCode(),
                        ErrorCodes.Insufficient_Balance.getMessage());

            }
        } return false;
    }
}
