
public class PointImpl implements Point {
	protected double x;
	protected double y;
	
	

	public PointImpl(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	



	@Override
	public void setPoint(double x, double y) {
		this.x=x;
		this.y=y;
	}

}