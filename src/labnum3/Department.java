package labnum3;

import java.util.Objects;

public class Department extends AbstractDepartment implements Comparable<Department>, Cloneable {

    private DepartmentType type;

    public Department(String name, int numFaculty, int numGroups, String facultyName, String location, DepartmentType type) {
        super(location, name, numFaculty, numGroups, facultyName);
        this.type = type;
    }

    public DepartmentType getType() {
        return type;
    }

    public void setType(DepartmentType type) {
        this.type = type;
    }

    @Override
    public String formatNormal() {
        return String.format("Department: %s, Faculty Count: %d, Group Count: %d, Faculty: %s",
                getName(), getNumFaculty(), getNumGroups(), getFacultyName());
    }

    @Override
    public String toString() {
        return formatNormal() + "\nLocation: " + getLocation() + "\nType: " + type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Department)) return false;
        Department other = (Department) obj;
        return getNumFaculty() == other.getNumFaculty() &&
                getNumGroups() == other.getNumGroups() &&
                getName().equals(other.getName()) &&
                getFacultyName().equals(other.getFacultyName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumFaculty(), getNumGroups(), getFacultyName());
    }

    @Override
    public Department clone() {
        return new Department(getName(), getNumFaculty(), getNumGroups(), getFacultyName(), getLocation(), type);
    }

    @Override
    public int compareTo(Department other) {
        return this.getName().compareTo(other.getName());
    }
}
