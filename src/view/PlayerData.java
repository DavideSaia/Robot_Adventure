/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.LinkedList;

/**
 *
 * @author Utente
 */
public class PlayerData {
    
    private LinkedList<Player> playerList;
    
        public PlayerData(){
            this.playerList = new LinkedList<Player>();
        };
    
    public void add(Player player) {
        this.playerList.add(player);
    }
    public void addToIndex(int index,Player player) {
        this.playerList.add(index,player);
    }

    public LinkedList<Player> getListOfPlayers() {
        return this.playerList;
    }

    public LinkedList<String[]> asListOfStringArray() {
        LinkedList<String[]> lstSA = null;

        lstSA = new LinkedList<String[]>();
        String[] sArr = null;
        for (Player p : this.playerList) {
            sArr = new String[3];
            sArr[0] = p.getNickname();
            sArr[1] = p.getNation();
            sArr[2] = String.valueOf(p.getScore());
            lstSA.add(sArr);
        }
        return lstSA;
    }
    
}// end class
