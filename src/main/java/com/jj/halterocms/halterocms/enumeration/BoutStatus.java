package com.jj.halterocms.halterocms.enumeration;

/**
 * Possible states of a bout.
 * IN_PROGRESS: a competition is in progress.
 * TO_BE_STARTED: a competition has not started yet.
 * FINISHED: a competition has finished.
 */
public enum BoutStatus {

    IN_PROGRESS("INP", "IN_PROGRESS"),
    TO_BE_STARTED("TBS", "TO_BE_STARTED"),
    FINISHED("FIN", "FINISHED");

    private String code;
    private String name;

    BoutStatus(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Return bout status code from a bout status name.
     *
     * @param name name of bout status.
     * @return boutstatus code. If no name matches with parameter return CL by default.
     */
    public static String fromBoutStatusName(String name) {
        String code = BoutStatus.TO_BE_STARTED.code;
        for (BoutStatus boutStatus : values()) {
            if (boutStatus.getName().equals(name)) {
                code = boutStatus.code;
                break;
            }
        }
        return code;
    }

    /**
     * Return bout status code.
     *
     * @return code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Return bout status name.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }
}
