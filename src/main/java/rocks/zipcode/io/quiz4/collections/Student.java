package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double totalStudyTime;

    public Student() {
        this(0);
    }

    public Student(Integer id) {
        this.id = id;
        totalStudyTime = 0D;
    }

    public void learn(Double amountOfHours) {
        if (amountOfHours > 0 ) {
            totalStudyTime += amountOfHours;
        }
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
