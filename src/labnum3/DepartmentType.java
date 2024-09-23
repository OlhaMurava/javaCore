package labnum3;

public enum DepartmentType {
    SCIENCE,
    ARTS,
    BUSINESS;

    public static DepartmentType[] getAllTypes() {
        return values();
    }
}
