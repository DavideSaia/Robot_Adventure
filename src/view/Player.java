/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Utente
 */
public class Player {
    
    private String nickName;
    private String nation;
    private int score;
    
        public Player(String nickName,String nation, int score){
            this.nickName = nickName;
            this.nation = nation;
            this.score = score;
        };
    
        public String getNickname(){
            return this.nickName;
        }
        
        public String getNation(){
            return this.nation;
        }
        
        public int getScore(){
            return this.score;
        }
        
        public void setNickname(String newName){
            this.nickName = newName;
        }
        
        public void setNation(String newNation){
            this.nation = newNation;
        }
        
        public void setScore(int newScore){
            this.score = newScore;
        }
        
    
}//end class
