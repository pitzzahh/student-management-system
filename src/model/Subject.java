package model;

import java.io.Serializable;

public class Subject implements Serializable {
    private String subjectCode;
    private String subjectDescription;
    private int units;

    /**
     * public constructor, no args.
     */
    public Subject() {
        this.subjectCode = "";
        this.subjectDescription = "";
        this.units = 0;
    }

    /**
     * public Constructor that initializes the private fields {@code subjectCode}, {@code subjectDescription}, and the number of {@code units}.
     * @param subjectCode the code of the subject.
     * @param subjectDescription the description of the subject.
     * @param units the number of units on the subject.
     */
    public Subject(String subjectCode, String subjectDescription, int units) {
        this.subjectCode = subjectCode;
        this.subjectDescription = subjectDescription;
        this.units = units;
    }

    /**
     * Method that sets the subject code of a subject.
     * @param subjectCode the subject code.
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    /**
     * Method that sets the subject description of a subject.
     * @param subjectDescription the subject description.
     */
    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    /**
     * Method that sets the number of units of a subject.
     * @param units the number of units.
     */
    public void setUnits(int units) {
        this.units = units;
    }

    /**
     * Method that returns the subject code of a subject.
     * @return {@code subjectCode}
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Method that returns the subject description.
     * @return {@code subjectDescription}
     */
    public String getSubjectDescription() {
        return subjectDescription;
    }

    /**
     * Method that returns the number of units of a subject.
     * @return {@code units}
     */
    public int getUnits() {
        return units;
    }
}
