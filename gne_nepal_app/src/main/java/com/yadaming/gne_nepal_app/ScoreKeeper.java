package com.yadaming.gne_nepal_app;

public class ScoreKeeper {
    public static int correct = 0;
    public static int incorrect = 0;
    public static int sl5 = 0; // 0 means they have yet to answer, 1 is no, 2 is yes
    public static int sl6 = 0; // see sl5 for the deeper meaning to this int
    public static int sl8 = 100; // 100 if they have yet to answer, 0 if they chose 0-2, 1 if they chose 3-6, 2 if they chose 7-9
    public static int sl12 = 0; // number of items in sl12 that are eaten daily
    public static int sl23 = 100; // basically sl8, but 2 means "more than six"

}
