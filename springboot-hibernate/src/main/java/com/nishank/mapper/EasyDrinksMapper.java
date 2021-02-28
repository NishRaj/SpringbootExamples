package com.nishank.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nishank.entities.EasyDrinks;
import com.nishank.model.EasyDrinksModel;

@Mapper(componentModel = "spring")
public interface EasyDrinksMapper {
	EasyDrinksMapper INSTANCE = Mappers.getMapper( EasyDrinksMapper.class ); 
	
	EasyDrinksModel easyDrinksToModel(EasyDrinks easyDrinks); 
	
	List<EasyDrinksModel> easyDrinksListToModelList(List<EasyDrinks> easyDrinks);
	
	EasyDrinks easyDrinkModelToEasyDrinks (EasyDrinksModel easyDrinkModel);

}
