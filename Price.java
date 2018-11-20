public class Price {
	// public variables such that they can be accessed by (object).DeliveryCharge
	public double Total;
	public double DeliveryCharge;
	
	public Price (double Total, double DeliveryCharge){
		this.Total = Total;
		this.DeliveryCharge = DeliveryCharge;
	}
	public String toString(){
		return String.format("|£%-8.2f|£%-15.2f|£%-13.2f", Total, DeliveryCharge, Total+DeliveryCharge);
	}
}
