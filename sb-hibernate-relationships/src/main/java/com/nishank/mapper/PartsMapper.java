package com.nishank.mapper;


import com.nishank.entity.Parts;
import com.nishank.model.PartsModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PartsMapper {

    PartsMapper INSTANCE = Mappers.getMapper( PartsMapper.class );
    public Parts partsModelToEntity(PartsModel partsModel);
    public PartsModel partsEntityToModel(Parts parts);
    public List<PartsModel> partsEntityListToModel(List<Parts> partsList);
    public List<Parts> partsModelListToEntity(List<PartsModel> partsModelList);

}
