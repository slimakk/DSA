package cv01;

public class Packet {
	public String ID;
	public Packet nextPacket;
	
	Packet(String id){
		this.ID = id;
	}
}
