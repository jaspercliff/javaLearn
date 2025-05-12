package com.jasper.mapStruct.convert;

import com.jasper.pojo.Person;
import com.jasper.pojo.PersonDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-11T10:48:15+0800",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
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
        personDTO.setName( person.getName() );
        personDTO.setAge( person.getAge() );

        return personDTO;
    }
}
