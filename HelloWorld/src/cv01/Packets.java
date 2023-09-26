package cv01;

public class Packets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var pac1 = new Packet("First");
		var pac2 = new Packet("Second");
		var pac3 = new Packet("Third");
		var pac4 = new Packet("Fourth");
		
		pac1.nextPacket = pac2;
		pac2.nextPacket = pac3;
		pac3.nextPacket = pac4;
		pac4.nextPacket = pac1;
	}

}
