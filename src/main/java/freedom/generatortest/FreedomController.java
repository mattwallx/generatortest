package freedom.generatortest;


import freedom.generatortest.dao.PersonMapper;
import freedom.generatortest.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreedomController {

    @Autowired
    PersonMapper personMapper;

    public FreedomController(PersonMapper personMapper){
        this.personMapper = personMapper;
    }
    @GetMapping(value = "/test")
    public Person getPerson() {
        return personMapper.selectByPrimaryKey((long) 1);
    }
}
