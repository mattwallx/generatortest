package freedom.generatortest.model;

import java.io.Serializable;

public class Person implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.ID
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    private Long ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.firstname
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column people.lastname
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    private String lastname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.ID
     *
     * @return the value of people.ID
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    public Long getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.ID
     *
     * @param ID the value for people.ID
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.firstname
     *
     * @return the value of people.firstname
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.firstname
     *
     * @param firstname the value for people.firstname
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column people.lastname
     *
     * @return the value of people.lastname
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column people.lastname
     *
     * @param lastname the value for people.lastname
     *
     * @mbg.generated Fri Jul 05 16:09:13 PDT 2019
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }
}
