package spielobjekte;

public class Lanzentraeger extends Figur{
	private final Abkuerzung name;
	
	public Lanzentraeger() {
		super(1, 1);
		this.name = Abkuerzung.LAT;
	}
	
	public String toString() {
		return "LZT   ";
	}
}
