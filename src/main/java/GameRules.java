/*
переменные для 2-х игроков
метод где происходит игровой процесс
 */
public class GameRules {
    User player1;
    User player2;
    //доска
    //фигуры
    //расстановка фигур на доске

    //проверка окончания игры
    boolean ismat() {
        return true;
    }

    //проверка правильности хода
    boolean isRight(boolean color, String arg1, String arg2) {
        return true;
    }

    void startGame() {
        //создаем игроков
        player1 = new User();
        player1.isWhite = true;
        player2 = new User();
        //переменные для хранения ходов игроков
        String[] move1 = {"",""};
        String[] move2 = {"",""};

        boolean mat = false;
        boolean right = false;

        while (!mat) {
            //поочередные ходы игроков
            move1 = player1.makeMove();
            if (isRight(player1.isWhite, move1[0], move1[1])) {
                //записать результат хода
                //изменить расстановку на доске
                System.out.println("ход белыми" + move1[0] + move1[1]);
            }
            mat = ismat();
            if (mat) {
                break;
            }
            move2 = player2.makeMove();
            if (isRight(player2.isWhite, move2[0], move2[1])) {
                //записать результат хода
                //изменить расстановку на доске
                System.out.println("ход черными" + move2[0] + move2[1]);
            }
        }
        System.out.println("игра закончена, мат");
    }
}
