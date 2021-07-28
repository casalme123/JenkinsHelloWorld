package learnProgramming2;

public class ClassesPart1 {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}

	public String getModel() {
		return model;
	}
}
