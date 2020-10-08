package com.wildchap.spring1;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private Address addr;
    private int age;
    private List<String> games;
    private Set<String> hobbys;
    private Map<String, String> cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    public Set<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(Set<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }
}
