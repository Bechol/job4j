package DeptSort;

import java.util.Objects;

public class unit {
    private String dept, service, office;

    public unit(String dept, String service, String office) {
        this.dept = "K" + dept;
        this.service = service;
        this.office = office;
    }

    public String getDept() {
        return dept;
    }

    public String getService() {
        return service;
    }

    public String getOffice() {
        return office;
    }

    @Override
    public String toString() {
        return dept + '\'' + service + '\'' + office;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        unit unit = (unit) o;
        return Objects.equals(dept, unit.dept) &&
                Objects.equals(service, unit.service) &&
                Objects.equals(office, unit.office);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dept, service, office);
    }
}
