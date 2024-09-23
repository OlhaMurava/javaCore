package labnum3;

public abstract class AbstractDepartment {
    protected String location; // Місцезнаходження кафедри
    protected String name;      // Назва кафедри
    protected int numFaculty;   // Кількість викладачів
    protected int numGroups;    // Кількість академічних груп
    protected String facultyName; // Назва факультету

    public AbstractDepartment(String location, String name, int numFaculty, int numGroups, String facultyName) {
        this.location = location;
        this.name = name;
        this.numFaculty = numFaculty;
        this.numGroups = numGroups;
        this.facultyName = facultyName;
    }

    public abstract String formatNormal();

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public int getNumFaculty() {
        return numFaculty;
    }

    public int getNumGroups() {
        return numGroups;
    }

    public String getFacultyName() {
        return facultyName;
    }
}

