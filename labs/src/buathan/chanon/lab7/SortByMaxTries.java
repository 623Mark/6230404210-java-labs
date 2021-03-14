/**
 *  SortByMaxTries, program that sort number to compare maxTries from GuessNumberGameVer4, in lab7.
 */

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 14, 2021
 */

package buathan.chanon.lab7;

import java.util.Comparator;

public class SortByMaxTries implements Comparator<GuessNumberGameVer4>{

    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2)
    {
        return o2.getMaxTries() - o1.getMaxTries();
    }

}
