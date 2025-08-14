package com.jasper.mapStruct.convert;

import com.jasper.pojo.Person;
import com.jasper.pojo.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "hobby",target = "hobbies")
    @Mapping(target = "high", ignore = true)
    @Mapping(target = "name",qualifiedByName = "nameString")
    PersonDTO toPersonDTO(Person person);


    @Named("nameString")
    default String nameString(String input) {
        return input + "test qualifiedByName";
    }
}
