
public class Monkey extends RescueAnimal {
	
	//Instance variable
	private String species;
	
	//Constructor
	public Monkey(String name, String species, String gender, String age, String weight,
	String acquisitionDate,String acquisitionCountry, String trainingStatus, boolean reserved,
	String inServiceCountry) {
		setName(name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		
	}
	
	//Mutator Method
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	//Accessor Method
	public String getSpecies() {
		return species;
	}

}
