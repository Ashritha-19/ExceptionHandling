package src;

public class BookTickets extends Login{
   public   int noOfSeats;
    public    int totalNoOfSeats=10;
    boolean loginStatus;

    public BookTickets(String validUserName, String validPassword,int noOfSeats) {
        super(validUserName, validPassword);
        this.noOfSeats=noOfSeats;
    }
    public boolean bookingTicket() throws InValidInputException {


            if(noOfSeats<=totalNoOfSeats){
                int availableSeats=totalNoOfSeats-noOfSeats;
                System.out.println("Booked Seats: " +noOfSeats);
                System.out.println("Remaining seats: " +availableSeats);

            }else{
                System.out.println("Requested Seats: " +noOfSeats);
                System.out.println("Available Seats: "+totalNoOfSeats);
                throw new InValidInputException(ErrorCodes.Invalid_Input.getCode(),
                        ErrorCodes.Invalid_Input.getMessage());
            }
       return false;
    }
}
