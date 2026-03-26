package com.jasper.mapStruct.convert;

import com.jasper.pojo.Person;
import com.jasper.pojo.PersonDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-24T15:50:48+0800",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Arch Linux)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDTO toPersonDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        List<String> list = person.getHobby();
        if ( list != null ) {
            personDTO.setHobbies( new ArrayList<String>( list ) );
        }
        personDTO.setName( nameString( person.getName() ) );
        personDTO.setAge( person.getAge() );

        return personDTO;
    }
}
