package cz.sam.march.utils;

public enum EOperatingSystem {
    Windows,
    Linux,
    Mac,
    Unknown;

    public static EOperatingSystem getType() {
        String os = System.getProperty("os.name").toLowerCase();
        if(os.contains("win")) {
            return EOperatingSystem.Windows;
        } else if(os.contains("mac")) {
            return EOperatingSystem.Mac;
        } else if(os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            return EOperatingSystem.Linux;
        }

        return EOperatingSystem.Unknown;
    }

}