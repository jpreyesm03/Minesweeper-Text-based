public class Visualization {
    //Attributes


    //Methods
    //Constructor... needed?
    public Visualization() {

    }

    public void visualize(Game game) {
        GameBoard board = game.getBoard();
        Tile[][] tiles = board.getTiles();
        for (int row=0; row < tiles.length; row++) {
            for (int column=0; column < tiles[row].length; column++) {
                Tile tile = tiles[row][column];
                if (!game.isGameOver()) {
                    if (!tile.getClickable()) {
                        System.out.print(" F ");
                    }
                    else {
                        if (tile.getReveal()) {
                            int neighbors = ((Number) tile).getNeighbors();

                            if (neighbors == 0 ) {
                                System.out.print(" . ");
                            }
                            else {
                                System.out.print(" " + neighbors + " ");
                            }

                        }
                        else {
                            System.out.print(" - ");
                        }

                    }
                }
                else {
                    if (tile instanceof Bomb) {
                        if (!tile.getClickable()) {
                            System.out.print(" X ");
                        }
                        else {
                            System.out.print(" B ");
                        }
                    }
                    else {
                        int neighbors = ((Number) tile).getNeighbors();

                        if (neighbors == 0 ) {
                            System.out.print(" . ");
                        }
                        else {
                            System.out.print(" " + neighbors + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

}
