package ibmtal.eticaret.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="graphicCards")
public class GraphicCard {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
private int id;
@Column(name = "name")
private String name;
@Column(name = "marka")
private String marka;
@Column(name = "işlemci")
private String işlemci;
@Column(name = "gb")
private int gb;
public GraphicCard() {
	super();
}
public GraphicCard(int id, String name, String marka, String işlemci, int gb) {
	super();
	this.id = id;
	this.name = name;
	this.marka = marka;
	this.işlemci = işlemci;
	this.gb = gb;
}
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
public String getMarka() {
	return marka;
}
public void setMarka(String marka) {
	this.marka = marka;
}
public String getIşlemci() {
	return işlemci;
}
public void setIşlemci(String işlemci) {
	this.işlemci = işlemci;
}
public int getGb() {
	return gb;
}
public void setGb(int gb) {
	this.gb = gb;
}



}
