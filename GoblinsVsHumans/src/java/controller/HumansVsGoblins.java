package controller;

import creatures.Goblin;
import creatures.Human;
import creatures.Player;
import items.Drop;
import land.Land;

public class HumansVsGoblins {
    private Land[][] gameWorld = new Land[10][20];

    public HumansVsGoblins(){
        for (int i=0;i<10;i++){
            for (int j=0;j<20;j++){
                this.gameWorld[i][j] = new Land(new int[]{i, j});
            }
        }
    }
    public Land[][] getGameWorld() {
        return gameWorld;
    }

    public static void main(String[] args) {
        Player player = new Player(new int[]{8,9});
        System.out.println(player.toString());
    }
}

