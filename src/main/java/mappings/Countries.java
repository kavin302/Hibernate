package mappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Countries {

	 @Id
	 private int id;
	 
	 @Column(unique = true)
	 private String name;
	 
	 private String population;
	 
	 @OneToOne//@OneToOne is used to establisg one to one relationship between two entities(tables)
	 private PrimeMinister primeMinister;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public PrimeMinister getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(PrimeMinister primeMinister) {
		this.primeMinister = primeMinister;
	}
	 
	 
}
