package buathan.chanon.lab7;

import java.util.Comparator;

public class SortByMaxTries implements Comparator<GuessNumberGameVer4>{

    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2)
    {
        return o2.getMaxTries() - o1.getMaxTries();
    }

}
