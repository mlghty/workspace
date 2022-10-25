//  LED, OLED, PLASMA, LCD, CRT
enum DisplayType {
    LED,
    OLED,
    PLASMA,
    LCD,
    CRT;


    public static DisplayType setEnum(String display1) {
        for (DisplayType displays : DisplayType.values()) {
            if (displays.toString() == display1) {

                return DisplayType.valueOf(display1);

            }
        }

        System.out.println("Error display not valid reverting to LED!");

        return DisplayType.LED;
    }


}
