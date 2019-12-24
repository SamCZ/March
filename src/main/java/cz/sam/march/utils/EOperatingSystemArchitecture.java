package cz.sam.march.utils;

public enum EOperatingSystemArchitecture {
    X86,
    X64,
    Unknown;

    public static EOperatingSystemArchitecture getType() {
        String type = System.getProperty("os.arch");
        if(type.endsWith("32")) {
            return EOperatingSystemArchitecture.X86;
        } else if(type.endsWith("64")) {
            return EOperatingSystemArchitecture.X64;
        }
        return EOperatingSystemArchitecture.Unknown;
    }
}
