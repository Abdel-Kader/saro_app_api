package com.sapp.api.main.entities;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sapp.api.main.utils.InheritColumn;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="users")
public class User extends InheritColumn implements Serializable
{
    private static final long serialVersionUID = 6258645521468092424L;
    private Long phone_number;
    
    @OneToMany(mappedBy = "sendby")
    @JsonBackReference
    private Set<Signalisation> signalisations;

    @ManyToOne
    private Profil profil;

    public Long getPhone_number()
    {
        return phone_number;
    }

    public void setPhone_number(Long phone_number)
    {
        this.phone_number = phone_number;
    }

    public Profil getProfil()
    {
        return profil;
    }

    public void setProfil(Profil profil)
    {
        this.profil = profil;
    }

	public Set<Signalisation> getSignalisations() 
	{
		return signalisations;
	}

	public void setSignalisations(Set<Signalisation> signalisations) 
	{
		this.signalisations = signalisations;
	}
    
    
}