package freedom.generatortest.dao;

import freedom.generatortest.model.Person;
import freedom.generatortest.model.PersonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    long countByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int deleteByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int deleteByPrimaryKey(Long ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int insert(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int insertSelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    List<Person> selectByExample(PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    Person selectByPrimaryKey(Long ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    int updateByPrimaryKey(Person record);
}