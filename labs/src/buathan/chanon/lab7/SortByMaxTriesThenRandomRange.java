/**
 *  SortByMaxTries, program that sort number to compare minNum, maxNum, maxTries from GuessNumberGameVer4, in lab7.
 *  and the program first compare maxTries in each individual GuessNumberGameV4 results.
 * /

/*
 * Author: Chanon Buathan
 * ID: 623040421-0
 * Sec: 1
 * Date: March 14, 2021
 */

package buathan.chanon.lab7;

import java.util.Comparator;

public class SortByMaxTriesThenRandomRange implements Comparator<GuessNumberGameVer4>
{
    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2)
    {
        int maxTriesCompare = o2.getMaxTries() - o1.getMaxTries();
        if ( maxTriesCompare == 0)
        {
            int rangeCompare = ( o1.getMaxNum() - o1.getMinNum() ) - ( o2.getMaxNum() - o2.getMinNum() );
            return rangeCompare;
        } else {
            return maxTriesCompare;
        }

    }
}
