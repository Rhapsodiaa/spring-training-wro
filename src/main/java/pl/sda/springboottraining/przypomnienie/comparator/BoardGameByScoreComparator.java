package pl.sda.springboottraining.przypomnienie.comparator;

import pl.sda.springboottraining.przypomnienie.model.BoardGame;

import java.util.Comparator;

public class BoardGameByScoreComparator implements Comparator<BoardGame> {

    // zwracamy liczbe dodatnia jesli o1 jest wieksze od o2
    // zwracamy 0 jesli o1 jest rowne o2
    // zrwacamy liczbe ujemna jezeli o1 jest mniejsze od o2
    @Override
    public int compare(BoardGame o1, BoardGame o2) {

        double score1 = o1.getScore();
        double score2 = o2.getScore();

        return Double.compare(score1, score2);
    }
}
