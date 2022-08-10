package controller;

import creatures.Goblin;
import creatures.Human;
import creatures.Player;
import land.Land;

public class Combat {

    public static void goblinAttack(Object o, Goblin g){
        int goblinHealth = g.getHealth();
        int goblinStrength = g.getStrength();

        if(o instanceof Human){
            int humanHealth = ((Human) o).getHealth();
            ((Human) o).setHealth(((Human) o).getHealth()-(int)(Math.random()*g.getStrength()+1));
        } else if (o instanceof Player) {
            int playerHealth = ((Player) o).getHealth();
            ((Player) o).setHealth(((Player) o).getHealth()-(int)(Math.random()*g.getStrength()+1));
        }
    }

    public static void humanAttackGoblin(Human h, Goblin g){
        g.setHealth(g.getHealth()-(int)(Math.random()*h.getStrength()+1));
    }

    public static void playerAttackGoblin(Player p, Goblin g){
        g.setHealth(g.getHealth()-(int)(Math.random()*p.getStrength()+1));
    }

    public static String goblinVsHuman(Human h, Goblin g,HumansVsGoblins game){
        String result = "";
        Land[][] newWorld = game.getGameWorld();
        while (h.getHealth()>0 || g.getHealth()>0){
            goblinAttack(h,g);
            humanAttackGoblin(h,g);
        }

        if (h.getHealth()<=0 && g.getHealth()<=0){
            newWorld[g.getPosition()[0]][g.getPosition()[1]] = g.getDrops();
            newWorld[h.getPosition()[0]][h.getPosition()[1]] = new Land(h.getPosition());
            result += "Human and Goblin both killed each other";
        } else if (h.getHealth()<=0) {
            newWorld[g.getPosition()[0]][g.getPosition()[1]] = g.getDrops();
            result += "Human has been killed by the Goblin";
        }else if(g.getHealth()<=0){
            newWorld[h.getPosition()[0]][h.getPosition()[1]] = new Land(h.getPosition());
            result += "The Goblin has been killed by the Human";
        }

        game.setGameWorld(newWorld);
        return result;
    }

    public static String playerVsHuman(Player p, Goblin g, HumansVsGoblins game){
        String result = "";
        Land[][] newWorld = game.getGameWorld();

        while (p.getHealth()>0 || g.getHealth()>0){
            goblinAttack(p,g);
            playerAttackGoblin(p,g);
        }

        if (p.getHealth()<=0 && g.getHealth()<=0){
            game.setPlay(false);
            result += "You and the goblin Killed each other: GAME OVER";
        } else if (p.getHealth()<=0) {
            game.setPlay(false);
            result += "You have been killed by the Goblin: GAME OVER";
        }else if(g.getHealth()<=0){
            newWorld[g.getPosition()[0]][g.getPosition()[1]] = g.getDrops();
            result += "Great Job you have killed the goblin";
        }

        game.setGameWorld(newWorld);
        return result;
    }

}
