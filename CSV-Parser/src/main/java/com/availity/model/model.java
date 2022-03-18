package com.availity.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;
    private String firstName;
    private String lastName;
    private int ver;
    private String insComp;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, int ver, String insComp) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ver = ver;
        this.insComp = insComp;
    }

    public String getId() {
        return id;
    }

    public String getFistName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    public String getInsComp() {
        return insComp;
    }

    public void setInsComp(String insComp) {
        this.insComp = insComp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.firstName);
        hash = 79 * hash + Objects.hashCode(this.lastName);
        hash = 79 * hash + this.ver;
        hash = 79 * hash + Objects.hashCode(this.insComp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.ver != other.ver) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.insComp, other.insComp)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

//sort files by first name by ascending
    @Test
    public void sortByName() {
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File b1, File b2) {
                int a1 = extractName(b1.getName());
                int a2 = extractName(b2.getName());
                return a1 - a2;
            }

            private int extractNumber(String firstName) {
                int i = 0;
                try {
                    int x = name.indexOf('_') + 1;
                    int y = name.lastIndexOf('.');
                    String number = firstName.substring(x, y);
                    i = Integer.parseInt(number);
                } catch (Exception e) {
                    i = 0;
                }
                return i;
            }
        });
    }
    
//check for duplicate IDs and return record with highest version
    @Test
    public void checkIDDup() {
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File b1, File b2) {
                int a1 = insComp(b1.getInsComp());
                int a2 = insComp(b2.getInsComp());

                int a3 = ver(b1.getVer());
                int a4 = ver(b2.getVer());

                if (a1 == a2) {
                    if (a3 > a4){
                        return a1;
                    }else{
                        return a2;
                    }
                }
            }

        });
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", ver=").append(ver);
        sb.append(", insComp='").append(insComp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}