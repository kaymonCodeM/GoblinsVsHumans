package items;

public interface getEquipmentPool {
    Equipment[] attack = {};
    Equipment[] defend = {};
    Equipment[][] equipments = {attack,defend};

    default Equipment selectRandomEquipment(){
        int type = (int)(Math.random()*2);
        int equip;
        if(type==0){
            equip = (int) (Math.random()*attack.length);
        }else {
            equip = (int) (Math.random()*defend.length);
        }
        return equipments[type][equip];
    }
}
