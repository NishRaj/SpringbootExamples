package com.nishank.service.impl;

import com.nishank.entity.Parts;
import com.nishank.mapper.PartsMapper;
import com.nishank.model.PartsModel;
import com.nishank.repository.PartsRepository;
import com.nishank.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.MissingResourceException;
import java.util.Optional;

@Service
public class PartsServiceImpl implements PartsService {
    @Autowired
    private PartsRepository partsRepository;

    @Override
    public PartsModel getPart(Long partId) {
       Optional<Parts> parts = partsRepository.findById(partId);
       PartsModel partsModel;
       if(parts.isPresent()){
           Parts newParts = parts.get();
           partsModel = PartsMapper.INSTANCE.partsEntityToModel(newParts);
       }else{
           throw new MissingResourceException("Parts is Empty", "PartsModel", partId.toString());
       }
        return partsModel;
    }

    @Override
    public List<PartsModel> getAllParts() {
        Optional<List<Parts> > partsList = Optional.of(partsRepository.findAll());
        List<PartsModel> partsModelList;
        if(partsList.isPresent()){
            partsModelList =  PartsMapper.INSTANCE.partsEntityListToModel(partsList.get());
        }else{
            throw new RuntimeException("No parts are Present");
        }
         return partsModelList;
    }

    @Override
    public void savePart(PartsModel partsModel) {
        Parts parts = PartsMapper.INSTANCE.partsModelToEntity(partsModel);
        partsRepository.save(PartsMapper.INSTANCE.partsModelToEntity(partsModel));
    }
}
