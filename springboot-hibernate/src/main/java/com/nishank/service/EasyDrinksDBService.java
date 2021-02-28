package com.nishank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishank.entities.EasyDrinks;
import com.nishank.mapper.EasyDrinksMapper;
import com.nishank.model.EasyDrinksModel;
import com.nishank.repositories.EasyDrinkRepository;

@Service
public class EasyDrinksDBService {

	@Autowired
	private EasyDrinkRepository easyDrinkRepo;
	
	public List<EasyDrinksModel> getAllDrinks() {
		List<EasyDrinks> easyDrinksList =  easyDrinkRepo.findAll();
		List<EasyDrinksModel> easyDrinksModelList = EasyDrinksMapper.INSTANCE.easyDrinksListToModelList(easyDrinksList);
		return easyDrinksModelList;
	}
	
	public void saveDrinks(EasyDrinksModel easyDrinkModel) {
		EasyDrinks easyDrinks = EasyDrinksMapper.INSTANCE.easyDrinkModelToEasyDrinks(easyDrinkModel);
		easyDrinkRepo.save(easyDrinks);
	}
}
