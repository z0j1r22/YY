package Test;

public class Test2 implements  Comparable<Test2>{
    private Integer id;
    private Integer grade;
    private Integer score;

    @Override
    public String toString() {
        return "Test2{" +
                "id=" + id +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Test2(Integer id, Integer grade, Integer score) {
        this.id = id;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public int compareTo(Test2 o) {
        return this.id-o.id;
    }
}
