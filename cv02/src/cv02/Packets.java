package cv02;

public class Packets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var p1 = new Packet();
		var p2 = new Packet();
		var p3 = new Packet();
		var p4 = new Packet();
		
		p1.setNextPacket(p2);
		p2.setNextPacket(p3);
		p3.setNextPacket(p4);
	}

}
