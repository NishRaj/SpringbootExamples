package com.nishank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nishank.entities.EasyDrinks;

@Repository
public interface EasyDrinkRepository extends JpaRepository<EasyDrinks, Long> {


}
