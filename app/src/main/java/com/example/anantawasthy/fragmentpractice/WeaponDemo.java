package com.example.anantawasthy.fragmentpractice;

/**
 * Created by anantawasthy on 4/25/17.
 */

public class WeaponDemo {
    private String name;
    private int damageInflicted;
    private int hitPoints;

    public WeaponDemo(String name, int damageInflicted, int hitPoints) {
        this.name = name;
        this.damageInflicted = damageInflicted;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
