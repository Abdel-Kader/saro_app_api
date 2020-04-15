package com.sapp.api.main.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sapp.api.main.utils.InheritColumn;

@Entity
@Table(name = "type_signalisation")
public class TypeSignalisation extends InheritColumn implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7860492744631988157L;
	
	
	private String libelle;
	
	 @OneToMany(mappedBy = "type_signalisation")
     @JsonBackReference
     private Set<Signalisation> signalisations;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Signalisation> getSignalisations() {
		return signalisations;
	}

	public void setSignalisations(Set<Signalisation> signalisations) {
		this.signalisations = signalisations;
	}
	 
	 

}
