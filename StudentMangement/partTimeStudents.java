package InternProject.StudentMangement;

public class partTimeStudents extends GeneralStudent {
    int level;
    boolean workStatus;

    public partTimeStudents(int id, String firstname, String lastname, String courses,int level, boolean workStatus) {
        super(id, firstname, lastname, courses);
        this.level = level;
        this.workStatus = workStatus;
    }
    public void getDetails(){
        System.out.println(this.firstName);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.courses);
        System.out.println(this.level);
        System.out.println(this.workStatus);

    }
}
