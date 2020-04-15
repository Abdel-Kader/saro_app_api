package com.sapp.api.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapp.api.main.entities.Signalisation;

public interface SignalisationRepository extends JpaRepository<Signalisation, Long>
{

}
