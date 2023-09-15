package vn.edu.iuh.fit.lab_week_01.models;

public enum isGrant {
    GRANT(1), DENIED(0), PENDING(-1);
    private int value;

    isGrant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
