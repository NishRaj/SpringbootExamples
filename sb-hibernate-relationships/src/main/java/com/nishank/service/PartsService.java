package com.nishank.service;

import com.nishank.model.PartsModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PartsService {

     PartsModel getPart(Long partId);
     List<PartsModel> getAllParts();
     void savePart(PartsModel partsModel);

}
