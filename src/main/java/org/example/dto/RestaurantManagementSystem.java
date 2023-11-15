package org.example.dto;

import lombok.*;


@EqualsAndHashCode
@Getter
@Setter
public class RestaurantManagementSystem {
    private int comboNum = 0;
    private Combo[] combos;
    private static final int MAX_COMBO_NUM = 20;

    public RestaurantManagementSystem(){
        this.combos = new Combo[MAX_COMBO_NUM];
    }

    public void addCombo(Combo combo){
        if(comboNum < MAX_COMBO_NUM){
            combos[comboNum] = combo;
        } else{
            System.out.printf("There are %d combos already, Add combo failed.", MAX_COMBO_NUM);
        }
    }

    @Override
    public String toString() {
        String comboStr = "[";
        for (Combo combo : combos){
            if (combo != null){
                comboStr += combo + " , ";
            }
        }
        comboStr += "]";

        return "RestaurantManagementSystem{" +
                "combos=" + comboStr +
                '}';
    }
}
