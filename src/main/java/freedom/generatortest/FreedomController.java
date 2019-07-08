package freedom.generatortest;


import freedom.generatortest.dao.PersonMapper;
import freedom.generatortest.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FreedomController {

    @Autowired
    PersonMapper personMapper;

    public FreedomController(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @GetMapping(value = "/{id}")
    public Person getPerson(@PathVariable(value = "id") Long id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @GetMapping(value = "/people")
    public List<Person> getPeople() {
        return personMapper.selectAll();
    }
}
