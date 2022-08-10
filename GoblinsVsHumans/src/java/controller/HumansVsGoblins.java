package controller;

import creatures.Goblin;
import creatures.Human;
import creatures.Player;
import items.Drop;
import items.TreasureChest;
import land.Land;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class HumansVsGoblins {

    private boolean play = true;
    private Land[][] gameWorld = new Land[20][20];

    //Humans
    private ArrayList<Human> humans = new ArrayList<>();

    //Goblins
    private ArrayList<Goblin> goblins = new ArrayList<>();

    //Drops
    private ArrayList<Goblin> drops = new ArrayList<>();

    private Player player;

    //Drops
    private TreasureChest chest;

    private int round =1;

    public void setupGame(){
        for (int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                this.gameWorld[i][j] = new Land(new int[]{i, j});
            }
        }

        //Create 40 walls
        for (int i=0;i<40;i++){
            int x = (int) (Math.random() * 20);
            int y = (int) (Math.random() * 20);
            if(this.gameWorld[y][x].getSymbol().compareTo("|")!=0){
                this.gameWorld[y][x].setSymbol("|");
            }else {
                i--;
            }
        }

        //Create 4 Humans
        for (int i=0;i<4;i++){
            int x = (int) (Math.random() * 20);
            int y = (int) (Math.random() * 20);
            if(this.gameWorld[y][x].getSymbol().compareTo("|")!=0 && !(this.gameWorld[y][x] instanceof Human)){
                Human human = new Human(new int[]{y,x});
                this.gameWorld[y][x] = human;
                this.humans.add(human);
            }else {
                i--;
            }
        }

        //Create 5 Goblins
        for (int i=0;i<5;i++){
            int x = (int) (Math.random() * 20);
            int y = (int) (Math.random() * 20);
            if(this.gameWorld[y][x].getSymbol().compareTo("|")!=0 && !(this.gameWorld[y][x] instanceof Human) && !(this.gameWorld[y][x] instanceof Goblin)){
                Goblin goblin = new Goblin(new int[]{y,x});
                this.gameWorld[y][x] = goblin;
                this.goblins.add(goblin);
            }else {
                i--;
            }
        }

        //Create Player
        while (true){
            int x = (int) (Math.random() * 20);
            int y = (int) (Math.random() * 20);
            if(this.gameWorld[y][x].getSymbol().compareTo("|")!=0 && !(this.gameWorld[y][x] instanceof Human) && !(this.gameWorld[y][x] instanceof Goblin)){
                Player p = new Player(new int[]{y,x});
                this.gameWorld[y][x] = p;
                this.player = p;
                break;
            }
        }


    }
    public void humansCheckForGoblins(){
        for (Human h: this.humans){
            int y = h.getPosition()[0];
            int x = h.getPosition()[1];
            if(this.gameWorld[y+1][x] instanceof Goblin ||
                    this.gameWorld[y-1][x] instanceof Goblin ||
                    this.gameWorld[y][x+1] instanceof Goblin ||
                    this.gameWorld[y][x-1] instanceof Goblin){
                Combat.humanAttackGoblin(h, (Goblin) this.gameWorld[y+1][x+1]);
            }
        }
    }

    public void goblinsPursuePlayer(){
        for (int i = 0; i<this.goblins.size();i++){
            int goblinY = this.goblins.get(i).getPosition()[0];
            int goblinX = this.goblins.get(i).getPosition()[1];
            if(this.gameWorld[goblinY+1][goblinX] instanceof Player ||
                    this.gameWorld[goblinY-1][goblinX] instanceof Player ||
                    this.gameWorld[goblinY][goblinX+1] instanceof Player ||
                    this.gameWorld[goblinY][goblinX-1] instanceof Player){
                Combat.playerAttackGoblin(this.player,this.goblins.get(i));
            }else {
                int playerY = this.player.getPosition()[0];
                int playerX = this.player.getPosition()[1];
                if (goblinY<playerY && this.getGameWorld()[goblinY+1][goblinX].getSymbol().contains("*")){
                    this.goblins.get(i).setPosition(new int[]{goblinY+1,goblinX});
                }else if (goblinY>playerY && this.getGameWorld()[goblinY-1][goblinX].getSymbol().contains("*")) {
                    this.goblins.get(i).setPosition(new int[]{goblinY - 1, goblinX});
                } else if (goblinX<playerX && this.getGameWorld()[goblinY][goblinX+1].getSymbol().contains("*")) {
                    this.goblins.get(i).setPosition(new int[]{goblinY, goblinX+1});
                } else if (goblinX>playerX && this.getGameWorld()[goblinY][goblinX-1].getSymbol().contains("*")) {
                    this.goblins.get(i).setPosition(new int[]{goblinY, goblinX-1});
                }
            }
        }
    }


    public void playHumansVsGoblins(){
        setupGame();
        System.out.println(this.toString());

        goblinsPursuePlayer();

    }
    public boolean getPlay(){
        return this.play;
    }
    public Land[][] getGameWorld() {
        return gameWorld;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void setGameWorld(Land[][] gameWorld) {
        this.gameWorld = gameWorld;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        String result = "";
        for (Land [] lands:this.getGameWorld()){
            for (Land land: lands){
                if (land.getSymbol() == "|") {
                    result += "|" + land.getSymbol() + "|";
                }else {
                    result += " " + land.getSymbol() + " ";
                }
            }
            result+="\n";
        }
        return result;
    }

    public static void main(String[] args) {
        HumansVsGoblins humansVsGoblins = new HumansVsGoblins();
        humansVsGoblins.playHumansVsGoblins();
    }
}

