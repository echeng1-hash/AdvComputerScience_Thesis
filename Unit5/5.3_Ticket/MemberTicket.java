import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class MemberTicket extends Ticket {
    private static final double MEMBER_DISCOUNT = 0.25;
    private double totalPrice;

    public MemberTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
        totalPrice = getTotalPrice();
    }

    public double getTotalPrice() {
        double pricePerTicketWithTax = getBasePrice() + (getBasePrice() * getTax());
        double fullPrice = pricePerTicketWithTax * getTicketCount();
        return fullPrice * (1 - MEMBER_DISCOUNT);
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Member");
    }

    @Override
    public void printPrice() {
        totalPrice = getTotalPrice();
        BigDecimal decimalFormatter = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue());
    }

    public void printMemberBenefits() {
        System.out.println("Includes access to special discounts and complimentary refreshments.");
    }

    @Override
    public void printCancellationPolicy() {
        super.printCancellationPolicy();
        System.out.println("Can be canceled within 24 hours before the event. No cancellation fee applies.");
    }

    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        printTicketType();
        printPrice();
        printMemberBenefits();
        printCancellationPolicy();
    }
}
