class Chess {
    enum ChessPlayer {
        WHITE, BLACK
    }

    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }

}

class WorldChess extends Chess {
    // ChessPlayer getFirPlayer(){} // final 메서드 오버라이딩시 오류
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }

}
