package InternProject.studentmanagement;

import java.util.Arrays;

public class PartTimeStudents extends Student {
    private int level;
    private boolean workStatus;



    public PartTimeStudents(int id, String firstname, String lastname, String[] courses, int level, boolean workStatus) {
        super(id, firstname, lastname, courses);
        this.level = level;
        this.workStatus = workStatus;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWorkStatus(boolean workStatus) {
        this.workStatus = workStatus;
    }

    public boolean isWorkStatus() {
        return workStatus;
    }
}
