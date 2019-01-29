package virtualpet;

public class Robotic extends VirtualPet {
	private int fragmentation;
	private int charge;

	private int prevFragmentation;
	private int prevCharge;

	public int getCharge() {
		return charge;
	}

	public int getFragmentation() {
		return fragmentation;
	}

	public void getStatus() {
		System.out.println(getName() + "\n Charge is at " + charge + "\n Boredom is at " + getBoredom()
				+ "\n Fragmentation is at " + fragmentation + "\n Dirty is at " + getDirty());
	}

	public void getStatusChange() {
		System.out.println(getName() + "\n Charge \t" + prevCharge + "\t" + "=>" + "\t" + charge + "\n Boredom \t"
				+ getPrevBoredom() + "\t" + "=>" + "\t" + getBoredom() + "\n Fragmentation \t" + prevFragmentation
				+ "\t" + "=>" + "\t" + fragmentation + "\n Dirty \t\t" + getPrevDirty() + "\t" + "=>" + "\t"
				+ getDirty());
	}

	// constructor
	public Robotic(String name) {
		super(name);
		charge = 1000;
		fragmentation = 1500;

		prevCharge = 1000;
		prevFragmentation = 1500;

	}

	public void tick(int time) {

		super.tick(time);
		fragmentation -= time;
		charge -= time;

		if (charge < 0 || getBoredom() < 0 || fragmentation < 0 || getDirty() < 0) {
			System.out.println("Your pet has fainted");
			System.exit(0);
		}
	}

	public void plugin() { // Increase distance from 0 health
		charge += 500;
	}

	public void defrag() { // Increase distance from 0 dirty
		fragmentation = 1500;
	}
	
	public void updatePrevProperties() {
		
		super.updatePrevProperties();
		prevCharge = charge;
		prevFragmentation = fragmentation;
		
	}
}
