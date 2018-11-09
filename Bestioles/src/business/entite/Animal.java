package business.entite;

public class Animal {
	private long id;
	private String name;
	private String sex;
	private String coatColor;
	private Specie specie;
	
	public Animal(long id, String name, String sex, String coatColor, Specie specie) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.coatColor = coatColor;
		this.specie = specie;
	}
	
	public Animal () {
		
	}
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCoatColor() {
		return coatColor;
	}
	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}
	public Specie getSpecie() {
		return specie;
	}
	public void setSpecie(Specie specie) {
		this.specie = specie;
	}

	@Override
	public String toString() {
		return  "\r\n ##################" +
				"\r\nAnimal id = " + id + 
				"\r\n name = " + name + 
				"\r\n sex = " + sex + 
				"\r\n coatColor = " + coatColor + 
				"\r\n specie = "+ specie;
	}			
	

}
