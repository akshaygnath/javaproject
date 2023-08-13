package oops;

interface Tvremote
{
	public void channelup();
	public void channeldown();
	public void volumeup();
	public void volumedown();
}

interface Smarttvremote extends Tvremote
{
	public void bluetooth();
	public void voicesearch();

	
}
class TV implements Smarttvremote
{

	@Override
	public void channelup() {
		System.out.println("channelup");
		
	}

	@Override
	public void channeldown() {
		System.out.println("channeldown");
		
	}

	@Override
	public void volumeup() {
		System.out.println("volumeUp");
		
	}	
	
	@Override
	public void volumedown() {
		System.out.println("volumedown");
	}
	
	@Override
	public void bluetooth() {
		System.out.println("bluetooth");
	}
	
	@Override
	public void voicesearch() {
		System.out.println("Voicesearch");
	}
}
public class Interfacepgm1 {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.bluetooth();
		ob.channelup();
		ob.channeldown();
		ob.volumedown();
		ob.volumeup();
		ob.voicesearch();
	}
}
