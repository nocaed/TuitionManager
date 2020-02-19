package main;

/**
 * @author Thomas Brewer
 * @author Michael McLaughlin
 */

public abstract class Student implements Comparable {
    private String fname;
    private String lname;
    protected int  credit;

    /**
     * Constructor for Student, initializes the fname, lname, and credit attributes in an instance of Student.
     * @author Thomas Brewer
     * @param fname The first name of the student
     * @param lname The last name of the student
     * @param credit The amount of credits the student is taking this semester
     */
    public Student(String fname, String lname, int credit) {
        this.fname = fname;
        this.lname = lname;
        this.credit = credit;
    }

    /**
     * Compares this instance of Student to another instance of Student.
     * @author Thomas Brewer
     * @param obj The object that this instance is being compared with
     * @return 0 if the instances are equal, 1 if this instance is greater, -1 if obj is greater
     */
    public int compareTo(Object obj) {
        if(!(obj instanceof Student))
            // maybe throw an exception here idk
            return -1;
        Student otherStudent = (Student)obj;
        int fnameComp = fname.compareTo(otherStudent.fname);
        int lnameComp = lname.compareTo(otherStudent.lname);
        return fnameComp == lnameComp ? 0 : fnameComp > lnameComp ? 1 : -1;
    }

    @Override
    /**
     * Overridden toString implementation for Student.
     * @author Thomas Brewer
     * @return A string containing all properties of this instance of Student
     */
    public String toString() {
        return fname + " " + lname + " " + credit;
    }

    /**
     * Calculates the Student's tuition for this semester.
     * @author Thomas Brewer
     * @return The Student's semester tuition
     */
    public abstract int tuitionDue();
}
