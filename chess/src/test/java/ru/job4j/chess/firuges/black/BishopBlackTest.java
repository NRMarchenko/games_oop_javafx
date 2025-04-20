package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        System.out.println(bishopBlack.position());
    }

    @Test
    void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        System.out.println(bishopBlack.copy(Cell.A4).position());
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        for (Cell cell : way) System.out.println(cell);
    }

    @Test
    void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        System.out.println(bishopBlack.isDiagonal(Cell.C1, Cell.G5));
    }
}