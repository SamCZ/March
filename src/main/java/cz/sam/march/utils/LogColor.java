package cz.sam.march.utils;

public enum LogColor {

    BLACK         (30),
    RED           (31),
    GREEN         (32),
    YELLOW        (33),
    BLUE          (34),
    MAGENTA       (35),
    CYAN          (36),
    WHITE         (37),
    DEFAULT_WHITE (39);

    private int color;

    LogColor(int colorID) {
        this.color = colorID;
    }

    public int getColorID() {
        return this.color;
    }

    public static String colorString(String par1String, LogColor color) {
        return "\u001b[1;" + color.getColorID() + "m" + par1String + "\u001b[m ";
    }

}