
public class �p�let {
	private String �p�letn�v;
	private String v�ros;
	private String orsz�g;
	private int magass�g;
	private int emelet;
	private int �p�t�s�ve;
	public �p�let(String �p�letn�v, String v�ros, String orsz�g, int magass�g, int emelet, int �p�t�s�ve) {
		this.�p�letn�v = �p�letn�v;
		this.v�ros = v�ros;
		this.orsz�g = orsz�g;
		this.magass�g = magass�g;
		this.emelet = emelet;
		this.�p�t�s�ve = �p�t�s�ve;
	}
	public String get�p�letn�v() {
		return �p�letn�v;
	}
	public String getV�ros() {
		return v�ros;
	}
	public String getOrsz�g() {
		return orsz�g;
	}
	public int getMagass�g() {
		return magass�g;
	}
	public int getEmelet() {
		return emelet;
	}
	public int get�p�t�s�ve() {
		return �p�t�s�ve;
	}
	public void set�p�letn�v(String �p�letn�v) {
		this.�p�letn�v = �p�letn�v;
	}
	public void setV�ros(String v�ros) {
		this.v�ros = v�ros;
	}
	public void setOrsz�g(String orsz�g) {
		this.orsz�g = orsz�g;
	}
	public void setMagass�g(int magass�g) {
		this.magass�g = magass�g;
	}
	public void setEmelet(int emelet) {
		this.emelet = emelet;
	}
	public void set�p�t�s�ve(int �p�t�s�ve) {
		this.�p�t�s�ve = �p�t�s�ve;
	}
	@Override
	public String toString() {
		return "�p�let [�p�letn�v= " + �p�letn�v + ", v�ros= " + v�ros + ", orsz�g= " + orsz�g + ", magass�g= " + magass�g
				+ ", emelet= " + emelet + ", �p�t�s�ve= " + �p�t�s�ve + "]";
	}
	
}
