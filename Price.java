public class Price {
	// public variables such that they can be accessed by (object).DeliveryCharge
	private double Total;
	private double DeliveryCharge;
	
	public double getTotal() {
		return Total;
	}
	public double getDeliveryCharge() {
		return DeliveryCharge;
	}
	public Price (double Total, double DeliveryCharge){
		this.Total = Total;
		this.DeliveryCharge = DeliveryCharge;
	}
	public String toString(){
		return String.format("|£%-8.2f|£%-15.2f|£%-13.2f", Total, DeliveryCharge, Total+DeliveryCharge);
	}
}
