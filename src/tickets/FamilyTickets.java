package tickets;

public class FamilyTickets extends Tickets {

	public void calculateTotalValue() {
		if (this.numberOfTickets >= 3) {
			this.value = this.value * this.numberOfTickets;
			setValue(this.value = this.value - (this.value * 5 / 100));
		} else {
			this.value = this.value * this.numberOfTickets;
		}

	}

}
