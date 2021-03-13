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
