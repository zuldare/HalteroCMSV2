package com.jj.halterocms.halterocms.enumeration;

/**
 * Possible status of a lift.
 */
public enum LiftStatus {

    PENDING("P", "PENDING"),
    VALID("V", "VALID"),
    INVALID("I", "INVALID"),
    RENOUNCED("R", "RENOUNCED");

    private String code;
    private String name;

    LiftStatus(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Return lift status code from a lift name.
     *
     * @param name name of the lift status.
     * @return liftStatus code. If no name matches with parameter return PENDING by default.
     */
    public static String fromLiftStatusName(String name) {
        String code = LiftStatus.PENDING.code;
        for (LiftStatus liftStatusType : values()) {
            if (liftStatusType.getName().equals(name)) {
                code = liftStatusType.code;
                break;
            }
        }
        return code;
    }

    /**
     * Return lift status code.
     *
     * @return code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Return lift status name.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }
}
