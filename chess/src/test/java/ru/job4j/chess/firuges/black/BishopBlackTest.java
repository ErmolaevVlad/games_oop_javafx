package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void whenPositionC7() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C7);
        Cell expected = Cell.C7;
        assertThat(bishopBlack.position()).isEqualTo(expected);
    }

    @Test
    void whenCopyC7toC5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C7);
        Cell expected = Cell.C5;
        assertThat(bishopBlack.copy(Cell.C5).position()).isEqualTo(expected);
    }

    @Test
    void whenWayC1toG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean isDiagonal = bishopBlack.isDiagonal(bishopBlack.position(), Cell.F4);
        assertThat(isDiagonal).isTrue();
    }

    @Test
    void whenIsNoDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean isDiagonal = bishopBlack.isDiagonal(bishopBlack.position(), Cell.H4);
        assertThat(isDiagonal).isFalse();
    }
}
