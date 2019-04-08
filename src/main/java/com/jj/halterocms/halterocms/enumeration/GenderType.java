package com.jj.halterocms.halterocms.enumeration;

/**
 * Types of gender.
 */
public enum GenderType {

    MALE("M", "MALE"),
    FEMALE("F", "FEMALE");

    private String code;
    private String name;

    GenderType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Return gender code from a gender name.
     *
     * @param name name of gender.
     * @return gender code. If no name matches with parameter return CL by default.
     */
    public static String fromStreetName(String name) {
        String code = GenderType.MALE.code;
        for (GenderType genderType : values()) {
            if (genderType.getName().equals(name)) {
                code = genderType.code;
                break;
            }
        }
        return code;
    }

    /**
     * Return gender code.
     *
     * @return code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Return gender name.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }
}
