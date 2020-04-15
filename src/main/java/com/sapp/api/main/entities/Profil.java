package com.sapp.api.main.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sapp.api.main.utils.InheritColumn;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "profil")
public class Profil extends InheritColumn implements Serializable
{
	private static final long serialVersionUID = -6181466680408745736L;
    private String profil_name;

    @OneToMany(mappedBy = "profil")
    @JsonBackReference
    private Set<User> users;

    public String getProfil_name()
    {
        return profil_name;
    }

    public void setProfil_name(String profil_name)
    {
        this.profil_name = profil_name;
    }

    public Set<User> getUsers()
    {
        return users;
    }

    public void setUsers(Set<User> users)
    {
        this.users = users;
    }
}
