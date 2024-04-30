package edu.dio.collections.set.guests;

/**
 * Guest
 */
public class Guest {
    private String name;
    private int codeInvitation;

    public Guest(String name, int codeInvitation) {
        this.name = name;
        this.codeInvitation = codeInvitation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeInvitation() {
        return codeInvitation;
    }

    public void setCodeInvitation(int codeInvitation) {
        this.codeInvitation = codeInvitation;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codeInvitation;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Guest other = (Guest) obj;
        if (codeInvitation != other.codeInvitation)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Guest [name=" + name + ", codeInvitation=" + codeInvitation + "]";
    }
}