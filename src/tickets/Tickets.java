package tickets;

public class Tickets {

	protected double value = 30;
	protected int numberOfTickets;

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	protected double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setTotalValue() {
		this.value *= this.numberOfTickets;
	}

	public void showResult() {

		System.out.println("Seu ingresso ficou no valor de: R$ " + getValue());
	}

}
