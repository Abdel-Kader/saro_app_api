package com.sapp.api.main.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sapp.api.main.utils.InheritColumn;

@Entity
@Table(name = "signalisations")
public class Signalisation extends InheritColumn implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5312292572945827563L;
	
	private String content;
	
	/* 
	 * clé étrangère de la table user pour avoir les infos de celui qui envoie la signalisation
	 * 
	 * */
	@ManyToOne
    private User sendby;
	
	/* 
	 * clé étrangère de la table type_signalisation pour avoir le type de la signalisation (audio, text, video)
	 * 
	 * */
	@ManyToOne
    private TypeSignalisation type_signalisation;

	public String getContent() {
		return content;
	}

	public void setContent(String content) 
	{
		this.content = content;
	}

	public User getSendby() 
	{
		return sendby;
	}

	public void setSendby(User sendby) {
		this.sendby = sendby;
	}

	public TypeSignalisation getType_signalisation() 
	{
		return type_signalisation;
	}

	public void setType_signalisation(TypeSignalisation type_signalisation) 
	{
		this.type_signalisation = type_signalisation;
	}
	
	
	

}
