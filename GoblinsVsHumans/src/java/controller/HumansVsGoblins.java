package controller;

import land.Land;

public class HumansVsGoblins {
    private Land[][] gameWorld = new Land[10][20];

    public HumansVsGoblins(){
        for (int i=0;i<10;i++){
            for (int j=0;j<20;j++){
                this.gameWorld[i][j] = new Land();
            }
        }
    }
    public Land[][] getGameWorld() {
        return gameWorld;
    }

    public static void main(String[] args) {
        HumansVsGoblins hvg = new HumansVsGoblins();
        for (Land[] lands : hvg.getGameWorld()){
            for (Land land : lands){
                System.out.print(land.toString() + " ");
            }
            System.out.println();
        }
    }
}

