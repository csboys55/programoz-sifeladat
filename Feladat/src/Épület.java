
public class Épület {
	private String épületnév;
	private String város;
	private String ország;
	private int magasság;
	private int emelet;
	private int építéséve;
	public Épület(String épületnév, String város, String ország, int magasság, int emelet, int építéséve) {
		this.épületnév = épületnév;
		this.város = város;
		this.ország = ország;
		this.magasság = magasság;
		this.emelet = emelet;
		this.építéséve = építéséve;
	}
	public String getÉpületnév() {
		return épületnév;
	}
	public String getVáros() {
		return város;
	}
	public String getOrszág() {
		return ország;
	}
	public int getMagasság() {
		return magasság;
	}
	public int getEmelet() {
		return emelet;
	}
	public int getÉpítéséve() {
		return építéséve;
	}
	public void setÉpületnév(String épületnév) {
		this.épületnév = épületnév;
	}
	public void setVáros(String város) {
		this.város = város;
	}
	public void setOrszág(String ország) {
		this.ország = ország;
	}
	public void setMagasság(int magasság) {
		this.magasság = magasság;
	}
	public void setEmelet(int emelet) {
		this.emelet = emelet;
	}
	public void setÉpítéséve(int építéséve) {
		this.építéséve = építéséve;
	}
	@Override
	public String toString() {
		return "Épület [Épületnév= " + épületnév + ", város= " + város + ", ország= " + ország + ", magasság= " + magasság
				+ ", emelet= " + emelet + ", építéséve= " + építéséve + "]";
	}
	
}
