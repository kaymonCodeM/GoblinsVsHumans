package controller;

import creatures.Human;
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
        HumansVsGoblins hvg = new HumansVsGoblins();
        System.out.println(hvg.getGameWorld()[0][0].toString());
        for (Land[] lands : hvg.getGameWorld()){
            for (Land land : lands){
                System.out.print(land.getSymbol() + " ");
            }
            System.out.println();
        }
    }
}

