package tree;

public class Uzel {
	private int data;
	private Uzel lavy;
	private Uzel pravy;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Uzel getLavy() {
		return lavy;
	}
	public void setLavy(Uzel lavy) {
		this.lavy = lavy;
	}
	public Uzel getPravy() {
		return pravy;
	}
	public void setPravy(Uzel pravy) {
		this.pravy = pravy;
	}
	public Uzel(int data) {
		super();
		this.data = data;
	}

}
