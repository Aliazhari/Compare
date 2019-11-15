package comparator;

/**
 * @author Ali
 * @File Computer.java
 *
 */
public class Computer {
	
	private String brand;
	private int ram;
	private int disk;
	private double price;
	
	
	public Computer(String brand, int ram, int disk, double price) {
		this.brand = brand;
		this.ram = ram;
		this.disk = disk;
		this.price = price;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	/**
	 * @return the disk
	 */
	public int getDisk() {
		return disk;
	}
	/**
	 * @param disk the disk to set
	 */
	public void setDisk(int disk) {
		this.disk = disk;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", ram=" + ram + ", disk=" + disk + ", price=" + price + "]";
	}
	
	

}
