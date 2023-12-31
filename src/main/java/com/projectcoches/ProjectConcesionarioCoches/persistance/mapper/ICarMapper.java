package com.projectcoches.ProjectConcesionarioCoches.persistance.mapper;

import com.projectcoches.ProjectConcesionarioCoches.domain.dto.CarDto;
import com.projectcoches.ProjectConcesionarioCoches.persistance.entity.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICarMapper {

    @Mapping(source = "marcaCocheEntity.descripcion", target = "marcaCocheString")
    CarDto toCarDto(CarEntity carEntity);

    @Mapping(target = "marcaCocheEntity", ignore = true) // Ignora la relacion
    @Mapping(target = "carPurchaseEntity", ignore = true)
    CarEntity toCarEntity(CarDto carDto);

    List<CarDto> toCarsDto(List<CarEntity> carEntityList);
}
